// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ProductCallerIdParam extends TeaModel {
    // productCallerId
    @NameInMap("productCallerId")
    public String productCallerId;

    public static ProductCallerIdParam build(java.util.Map<String, ?> map) throws Exception {
        ProductCallerIdParam self = new ProductCallerIdParam();
        return TeaModel.build(map, self);
    }

    public ProductCallerIdParam setProductCallerId(String productCallerId) {
        this.productCallerId = productCallerId;
        return this;
    }
    public String getProductCallerId() {
        return this.productCallerId;
    }

}
