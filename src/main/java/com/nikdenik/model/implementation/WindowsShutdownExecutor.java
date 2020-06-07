package com.nikdenik.model.implementation;

import com.nikdenik.model.api.OperationExecutor;

public class WindowsShutdownExecutor extends WindowsExecutor implements OperationExecutor {

    public static String COMMAND_OPTION = "-s";

    @Override
    public String getCommandOption() {
        return COMMAND_OPTION;
    }
}
