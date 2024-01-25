// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class ListAiStoreBucketsRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("Product")
    public String product;

    public static ListAiStoreBucketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAiStoreBucketsRequest self = new ListAiStoreBucketsRequest();
        return TeaModel.build(map, self);
    }

    public ListAiStoreBucketsRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ListAiStoreBucketsRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
