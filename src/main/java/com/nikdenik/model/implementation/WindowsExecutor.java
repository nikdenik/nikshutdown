package com.nikdenik.model.implementation;

import com.nikdenik.model.api.OperationExecutor;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class WindowsExecutor implements OperationExecutor {

    protected static Logger LOGGER = Logger.getLogger(WindowsExecutor.class.toString());
    private static String COMMAND = "shutdown %s -t %s";

    @Override
    public void executeOperationIn(Duration period) {
        executeOperation(period.getSeconds());
    }

    @Override
    public void executeOperationAt(LocalDateTime executionTime) {
        LocalDateTime timeFrom = LocalDateTime.from(LocalDateTime.now());
        Long seconds = timeFrom.until(executionTime, ChronoUnit.SECONDS);

        executeOperation(seconds);
    }

    protected void executeOperation(Long seconds) {
        String finalCommand = String.format(COMMAND, this.getCommandOption(), seconds);
        try {
            Runtime r = Runtime.getRuntime();
            LOGGER.log(Level.INFO, "Operation \"" + finalCommand + "\" is about to be exexuted");
            r.exec(finalCommand);
        } catch (NumberFormatException | IOException e) {
            LOGGER.log(Level.ALL, "Operation " + finalCommand + " has failed: " + e);
            throw new RuntimeException(e);
        }
    }

    public abstract String getCommandOption();
}
