// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class DeleteProvisionedProductPlanResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteProvisionedProductPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteProvisionedProductPlanResponseBody self = new DeleteProvisionedProductPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteProvisionedProductPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
