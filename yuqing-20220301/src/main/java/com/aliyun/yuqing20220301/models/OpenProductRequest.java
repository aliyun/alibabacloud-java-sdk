// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class OpenProductRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("productInstance")
    public ProductInstance productInstance;

    @NameInMap("requestId")
    public String requestId;

    public static OpenProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenProductRequest self = new OpenProductRequest();
        return TeaModel.build(map, self);
    }

    public OpenProductRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public OpenProductRequest setProductInstance(ProductInstance productInstance) {
        this.productInstance = productInstance;
        return this;
    }
    public ProductInstance getProductInstance() {
        return this.productInstance;
    }

    public OpenProductRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
