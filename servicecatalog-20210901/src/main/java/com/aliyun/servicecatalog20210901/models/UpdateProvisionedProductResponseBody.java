// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateProvisionedProductResponseBody extends TeaModel {
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
     * <p>0FEEF92D-4052-5202-87D0-3D8EC16F81BF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateProvisionedProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProvisionedProductResponseBody self = new UpdateProvisionedProductResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProvisionedProductResponseBody setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public UpdateProvisionedProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
