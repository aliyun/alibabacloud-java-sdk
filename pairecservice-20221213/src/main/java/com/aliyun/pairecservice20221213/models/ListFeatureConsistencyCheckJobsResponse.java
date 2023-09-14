// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListFeatureConsistencyCheckJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListFeatureConsistencyCheckJobsResponseBody body;

    public static ListFeatureConsistencyCheckJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureConsistencyCheckJobsResponse self = new ListFeatureConsistencyCheckJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListFeatureConsistencyCheckJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFeatureConsistencyCheckJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFeatureConsistencyCheckJobsResponse setBody(ListFeatureConsistencyCheckJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFeatureConsistencyCheckJobsResponseBody getBody() {
        return this.body;
    }

}
