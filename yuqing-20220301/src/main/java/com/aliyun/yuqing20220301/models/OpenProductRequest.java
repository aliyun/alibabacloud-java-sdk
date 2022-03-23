// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301.models;

import com.aliyun.tea.*;

public class OpenProductRequest extends TeaModel {
    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("productInstance")
    public ProductInstance productInstance;

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

}
