// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class CreateAiStoreReceiveConfigRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("ApiName")
    public String apiName;

    public static CreateAiStoreReceiveConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAiStoreReceiveConfigRequest self = new CreateAiStoreReceiveConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateAiStoreReceiveConfigRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public CreateAiStoreReceiveConfigRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

}
