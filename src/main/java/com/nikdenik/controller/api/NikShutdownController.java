package com.nikdenik.controller.api;

import com.nikdenik.model.data.OperationType;
import com.nikdenik.model.data.TimeRelationType;

import java.time.LocalDateTime;

public interface NikShutdownController {

    void performOperation(OperationType operationType, TimeRelationType timeRelationType, LocalDateTime time);

}
