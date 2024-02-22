// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobScoreReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeatureConsistencyCheckJobScoreReportsResponseBody body;

    public static ListFeatureConsistencyCheckJobScoreReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobScoreReportsResponse self = new ListFeatureConsistencyCheckJobScoreReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobScoreReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureConsistencyCheckJobScoreReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureConsistencyCheckJobScoreReportsResponse setBody(ListFeatureConsistencyCheckJobScoreReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureConsistencyCheckJobScoreReportsResponseBody getBody() {
        return this.body;
    }

}
