// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductPlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-bp1jvmdk2k****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the product instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pp-bp1ddg1n2a****</p>
     */
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProvisionedProductPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProvisionedProductPlanResponseBody self = new UpdateProvisionedProductPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProvisionedProductPlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public UpdateProvisionedProductPlanResponseBody setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public UpdateProvisionedProductPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
