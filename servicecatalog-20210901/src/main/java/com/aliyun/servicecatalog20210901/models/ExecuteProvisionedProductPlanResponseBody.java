// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ExecuteProvisionedProductPlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the plan.</p>
     * 
     * <strong>example:</strong>
     * <p>plan-bp1jvmdk2k****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExecuteProvisionedProductPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteProvisionedProductPlanResponseBody self = new ExecuteProvisionedProductPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteProvisionedProductPlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public ExecuteProvisionedProductPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
