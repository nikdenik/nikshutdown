package com.nikdenik.model.implementation;

import com.nikdenik.model.api.OperationExecutor;

public class WindowsLogoutExecutor extends WindowsExecutor implements OperationExecutor {

    public static String COMMAND_OPTION = "-l";

    @Override
    public String getCommandOption() {
        return COMMAND_OPTION;
    }
}
