// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class LaunchProductResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance</p>
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

    public static LaunchProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LaunchProductResponseBody self = new LaunchProductResponseBody();
        return TeaModel.build(map, self);
    }

    public LaunchProductResponseBody setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public LaunchProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
