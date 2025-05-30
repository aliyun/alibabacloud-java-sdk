// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class SubmitUrgentDemandPlanRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111223</p>
     */
    @NameInMap("planId")
    public String planId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>262940</p>
     */
    @NameInMap("userId")
    public String userId;

    public static SubmitUrgentDemandPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitUrgentDemandPlanRequest self = new SubmitUrgentDemandPlanRequest();
        return TeaModel.build(map, self);
    }

    public SubmitUrgentDemandPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public SubmitUrgentDemandPlanRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
