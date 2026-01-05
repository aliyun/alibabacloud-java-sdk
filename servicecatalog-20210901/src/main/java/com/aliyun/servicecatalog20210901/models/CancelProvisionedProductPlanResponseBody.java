// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class CancelProvisionedProductPlanResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CancelProvisionedProductPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelProvisionedProductPlanResponseBody self = new CancelProvisionedProductPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelProvisionedProductPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
