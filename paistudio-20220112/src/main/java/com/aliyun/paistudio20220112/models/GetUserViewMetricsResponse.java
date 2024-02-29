// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetUserViewMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserViewMetricsResponseBody body;

    public static GetUserViewMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserViewMetricsResponse self = new GetUserViewMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetUserViewMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserViewMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserViewMetricsResponse setBody(GetUserViewMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserViewMetricsResponseBody getBody() {
        return this.body;
    }

}
