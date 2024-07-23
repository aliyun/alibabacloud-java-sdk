// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class JobStatusRunning extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("observedFlinkJobRestarts")
    public Long observedFlinkJobRestarts;

    /**
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("observedFlinkJobStatus")
    public String observedFlinkJobStatus;

    public static JobStatusRunning build(java.util.Map<String, ?> map) throws Exception {
        JobStatusRunning self = new JobStatusRunning();
        return TeaModel.build(map, self);
    }

    public JobStatusRunning setObservedFlinkJobRestarts(Long observedFlinkJobRestarts) {
        this.observedFlinkJobRestarts = observedFlinkJobRestarts;
        return this;
    }
    public Long getObservedFlinkJobRestarts() {
        return this.observedFlinkJobRestarts;
    }

    public JobStatusRunning setObservedFlinkJobStatus(String observedFlinkJobStatus) {
        this.observedFlinkJobStatus = observedFlinkJobStatus;
        return this;
    }
    public String getObservedFlinkJobStatus() {
        return this.observedFlinkJobStatus;
    }

}
