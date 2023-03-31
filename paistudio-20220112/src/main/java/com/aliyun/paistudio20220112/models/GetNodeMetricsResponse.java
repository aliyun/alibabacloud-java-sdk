// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetNodeMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetNodeMetricsResponseBody body;

    public static GetNodeMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNodeMetricsResponse self = new GetNodeMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetNodeMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNodeMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNodeMetricsResponse setBody(GetNodeMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNodeMetricsResponseBody getBody() {
        return this.body;
    }

}
