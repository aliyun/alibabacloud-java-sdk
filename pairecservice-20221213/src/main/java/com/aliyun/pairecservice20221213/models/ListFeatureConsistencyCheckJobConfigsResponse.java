// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobConfigsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeatureConsistencyCheckJobConfigsResponseBody body;

    public static ListFeatureConsistencyCheckJobConfigsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobConfigsResponse self = new ListFeatureConsistencyCheckJobConfigsResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobConfigsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureConsistencyCheckJobConfigsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureConsistencyCheckJobConfigsResponse setBody(ListFeatureConsistencyCheckJobConfigsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureConsistencyCheckJobConfigsResponseBody getBody() {
        return this.body;
    }

}
