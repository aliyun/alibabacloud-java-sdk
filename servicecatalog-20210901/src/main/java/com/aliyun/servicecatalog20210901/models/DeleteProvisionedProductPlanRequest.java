// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteProvisionedProductPlanRequest extends TeaModel {
    /**
     * <p>The ID of the plan.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-bp1jvmdk2k****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    public static DeleteProvisionedProductPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProvisionedProductPlanRequest self = new DeleteProvisionedProductPlanRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProvisionedProductPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
