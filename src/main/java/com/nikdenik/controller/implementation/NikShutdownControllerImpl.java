package com.nikdenik.controller.implementation;

import com.nikdenik.controller.api.NikShutdownController;
import com.nikdenik.model.api.OperationExecutor;
import com.nikdenik.model.data.OperationType;
import com.nikdenik.model.data.TimeRelationType;
import com.nikdenik.model.factory.CommandExecutorFactory;
import com.nikdenik.model.implementation.WindowsHibernateExecutor;
import com.nikdenik.model.implementation.WindowsLogoutExecutor;
import com.nikdenik.model.implementation.WindowsRebootExecutor;
import com.nikdenik.model.implementation.WindowsShutdownExecutor;
import com.sun.corba.se.spi.orb.OperationFactory;

import java.time.Duration;
import java.time.LocalDateTime;

public class NikShutdownControllerImpl implements NikShutdownController {

    public void performOperation(OperationType operationType, TimeRelationType timeRelationType, LocalDateTime time) {
        OperationExecutor executor = CommandExecutorFactory.getOperationExecutorInstance(operationType);

        switch (timeRelationType) {
            case SPECIFIC_MOMENT:
                executor.executeOperationAt(time);
            case TIME_WINDOW:
                executor.executeOperationIn(Duration.between(LocalDateTime.now(), time));
            default:
                throw new RuntimeException("The requested timeRelation is not yet implemented: " + timeRelationType);
        }
    }

}
