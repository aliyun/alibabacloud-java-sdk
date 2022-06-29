// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CreateProvisionedProductPlanResponseBody extends TeaModel {
    @NameInMap("PlanId")
    public String planId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateProvisionedProductPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateProvisionedProductPlanResponseBody self = new CreateProvisionedProductPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateProvisionedProductPlanResponseBody setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public CreateProvisionedProductPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
