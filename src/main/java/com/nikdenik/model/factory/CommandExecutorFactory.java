package com.nikdenik.model.factory;

import com.nikdenik.model.api.OperationExecutor;
import com.nikdenik.model.data.OperationType;
import com.nikdenik.model.implementation.WindowsHibernateExecutor;
import com.nikdenik.model.implementation.WindowsLogoutExecutor;
import com.nikdenik.model.implementation.WindowsRebootExecutor;
import com.nikdenik.model.implementation.WindowsShutdownExecutor;

import static com.nikdenik.model.data.OperativeSystem.WINDOWS;

public class CommandExecutorFactory {

    private static String CURRENT_OS_NAME = System.getProperty("os.name").toLowerCase();

    public static OperationExecutor getOperationExecutorInstance(OperationType operationType) {
        if (CURRENT_OS_NAME.contains(WINDOWS.name())) {
            switch (operationType) {
                case SHUTDOWN:
                    return new WindowsShutdownExecutor();
                case REBOOT:
                    return new WindowsRebootExecutor();
                case LOGOUT:
                    return new WindowsLogoutExecutor();
                case HIBERNATE:
                    return new WindowsHibernateExecutor();
                default:
                    throw new RuntimeException("The requested operation is not yet implemented: " + operationType);
            }
        } else {
            throw new RuntimeException("OS other than Windows has not been implemented yet");
        }
    }

}
