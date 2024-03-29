// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobFeatureReportsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFeatureConsistencyCheckJobFeatureReportsResponseBody body;

    public static ListFeatureConsistencyCheckJobFeatureReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobFeatureReportsResponse self = new ListFeatureConsistencyCheckJobFeatureReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobFeatureReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureConsistencyCheckJobFeatureReportsResponse setBody(ListFeatureConsistencyCheckJobFeatureReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureConsistencyCheckJobFeatureReportsResponseBody getBody() {
        return this.body;
    }

}
