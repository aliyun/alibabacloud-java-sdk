// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20191111.models;

import com.aliyun.tea.*;

public class GetAsyncPredictRequest extends TeaModel {
    @NameInMap("AsyncPredictId")
    public Integer asyncPredictId;

    @NameInMap("Product")
    public String product;

    public static GetAsyncPredictRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncPredictRequest self = new GetAsyncPredictRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncPredictRequest setAsyncPredictId(Integer asyncPredictId) {
        this.asyncPredictId = asyncPredictId;
        return this;
    }
    public Integer getAsyncPredictId() {
        return this.asyncPredictId;
    }

    public GetAsyncPredictRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

}
