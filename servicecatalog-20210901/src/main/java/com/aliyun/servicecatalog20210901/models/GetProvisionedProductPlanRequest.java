// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class GetProvisionedProductPlanRequest extends TeaModel {
    /**
     * <p>The ID of the plan.</p>
     */
    @NameInMap("PlanId")
    public String planId;

    public static GetProvisionedProductPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProvisionedProductPlanRequest self = new GetProvisionedProductPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetProvisionedProductPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
