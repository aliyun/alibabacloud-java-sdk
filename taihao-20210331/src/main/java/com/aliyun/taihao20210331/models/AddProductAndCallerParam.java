// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class AddProductAndCallerParam extends TeaModel {
    // productCallerId
    @NameInMap("productCallerId")
    public String productCallerId;

    // productName
    @NameInMap("productName")
    public String productName;

    public static AddProductAndCallerParam build(java.util.Map<String, ?> map) throws Exception {
        AddProductAndCallerParam self = new AddProductAndCallerParam();
        return TeaModel.build(map, self);
    }

    public AddProductAndCallerParam setProductCallerId(String productCallerId) {
        this.productCallerId = productCallerId;
        return this;
    }
    public String getProductCallerId() {
        return this.productCallerId;
    }

    public AddProductAndCallerParam setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
