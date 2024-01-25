// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class GetAiStoreReceiveConfigRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Product")
    public String product;

    public static GetAiStoreReceiveConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAiStoreReceiveConfigRequest self = new GetAiStoreReceiveConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAiStoreReceiveConfigRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public GetAiStoreReceiveConfigRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
