// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class GetUrgentDemandPlanDetailRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111223</p>
     */
    @NameInMap("planId")
    public String planId;

    public static GetUrgentDemandPlanDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUrgentDemandPlanDetailRequest self = new GetUrgentDemandPlanDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetUrgentDemandPlanDetailRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
