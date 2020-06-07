package com.nikdenik.model.implementation;

import com.nikdenik.model.api.OperationExecutor;

public class WindowsHibernateExecutor extends WindowsExecutor implements OperationExecutor {

    public static String COMMAND_OPTION = "-h";

    @Override
    public String getCommandOption() {
        return COMMAND_OPTION;
    }
}
