// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class CloseProductRequest extends TeaModel {
    @NameInMap("productInstance")
    public ProductInstance productInstance;

    @NameInMap("requestId")
    public String requestId;

    public static CloseProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseProductRequest self = new CloseProductRequest();
        return TeaModel.build(map, self);
    }

    public CloseProductRequest setProductInstance(ProductInstance productInstance) {
        this.productInstance = productInstance;
        return this;
    }
    public ProductInstance getProductInstance() {
        return this.productInstance;
    }

    public CloseProductRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
