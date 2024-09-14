// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListScheduledPlanExecutedHistoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>58718c99-3b29-4c5e-93bb-c9fc4ec6****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    /**
     * <strong>example:</strong>
     * <p>SCHEDULED_PLAN</p>
     */
    @NameInMap("origin")
    public String origin;

    public static ListScheduledPlanExecutedHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPlanExecutedHistoryRequest self = new ListScheduledPlanExecutedHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListScheduledPlanExecutedHistoryRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

    public ListScheduledPlanExecutedHistoryRequest setOrigin(String origin) {
        this.origin = origin;
        return this;
    }
    public String getOrigin() {
        return this.origin;
    }

}
