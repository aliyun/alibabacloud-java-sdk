// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ProductNameParam extends TeaModel {
    // productName
    @NameInMap("productName")
    public String productName;

    public static ProductNameParam build(java.util.Map<String, ?> map) throws Exception {
        ProductNameParam self = new ProductNameParam();
        return TeaModel.build(map, self);
    }

    public ProductNameParam setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
