// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetricsResponseBody body;

    public static GetMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricsResponse self = new GetMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricsResponse setBody(GetMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricsResponseBody getBody() {
        return this.body;
    }

}
