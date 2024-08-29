// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMetricStoreResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetricStoreResponseBody body;

    public static GetMetricStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricStoreResponse self = new GetMetricStoreResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricStoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricStoreResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricStoreResponse setBody(GetMetricStoreResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricStoreResponseBody getBody() {
        return this.body;
    }

}
