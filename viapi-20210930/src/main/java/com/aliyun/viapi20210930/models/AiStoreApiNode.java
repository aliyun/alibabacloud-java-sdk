// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class AiStoreApiNode extends TeaModel {
    @NameInMap("Apis")
    public java.util.List<AiStoreUserTask> apis;

    @NameInMap("Product")
    public String product;

    @NameInMap("ProductDesc")
    public String productDesc;

    public static AiStoreApiNode build(java.util.Map<String, ?> map) throws Exception {
        AiStoreApiNode self = new AiStoreApiNode();
        return TeaModel.build(map, self);
    }

    public AiStoreApiNode setApis(java.util.List<AiStoreUserTask> apis) {
        this.apis = apis;
        return this;
    }
    public java.util.List<AiStoreUserTask> getApis() {
        return this.apis;
    }

    public AiStoreApiNode setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public AiStoreApiNode setProductDesc(String productDesc) {
        this.productDesc = productDesc;
        return this;
    }
    public String getProductDesc() {
        return this.productDesc;
    }

}
