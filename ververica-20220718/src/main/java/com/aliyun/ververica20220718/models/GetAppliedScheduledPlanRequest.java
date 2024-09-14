// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetAppliedScheduledPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5737ef81-d2f1-49cf-8752-30910809****</p>
     */
    @NameInMap("deploymentId")
    public String deploymentId;

    public static GetAppliedScheduledPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppliedScheduledPlanRequest self = new GetAppliedScheduledPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetAppliedScheduledPlanRequest setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }
    public String getDeploymentId() {
        return this.deploymentId;
    }

}
