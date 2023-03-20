// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductPlanResponseBody extends TeaModel {
    @NameInMap("PlanId")
    public String planId;

    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

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
