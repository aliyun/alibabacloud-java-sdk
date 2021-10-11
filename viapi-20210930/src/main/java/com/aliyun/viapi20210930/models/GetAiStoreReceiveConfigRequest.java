// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreReceiveConfigRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("ApiName")
    public String apiName;

    public static GetAiStoreReceiveConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreReceiveConfigRequest self = new GetAiStoreReceiveConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAiStoreReceiveConfigRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public GetAiStoreReceiveConfigRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

}
