package com.nikdenik.model.api;

import java.time.Duration;
import java.time.LocalDateTime;

public interface OperationExecutor {

    void executeOperationIn(Duration period);

    void executeOperationAt(LocalDateTime time);

}
