// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ScheduledPlanExecutedStatus extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>HOT_UPDATE</p>
     */
    @NameInMap("restartType")
    public String restartType;

    /**
     * <strong>example:</strong>
     * <p>UPGRADED</p>
     */
    @NameInMap("statusState")
    public String statusState;

    public static ScheduledPlanExecutedStatus build(java.util.Map<String, ?> map) throws Exception {
        ScheduledPlanExecutedStatus self = new ScheduledPlanExecutedStatus();
        return TeaModel.build(map, self);
    }

    public ScheduledPlanExecutedStatus setRestartType(String restartType) {
        this.restartType = restartType;
        return this;
    }
    public String getRestartType() {
        return this.restartType;
    }

    public ScheduledPlanExecutedStatus setStatusState(String statusState) {
        this.statusState = statusState;
        return this;
    }
    public String getStatusState() {
        return this.statusState;
    }

}
