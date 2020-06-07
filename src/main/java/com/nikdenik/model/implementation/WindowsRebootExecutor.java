package com.nikdenik.model.implementation;

import com.nikdenik.model.api.OperationExecutor;

public class WindowsRebootExecutor extends WindowsExecutor implements OperationExecutor {

    public static String COMMAND_OPTION = "-r";

    @Override
    public String getCommandOption() {
        return COMMAND_OPTION;
    }
}
