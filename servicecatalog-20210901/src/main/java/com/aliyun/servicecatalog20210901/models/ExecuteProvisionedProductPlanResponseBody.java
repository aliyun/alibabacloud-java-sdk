// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ExecuteProvisionedProductPlanResponseBody extends TeaModel {
    @NameInMap("PlanId")
    public String planId;

    // Id of the request
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
