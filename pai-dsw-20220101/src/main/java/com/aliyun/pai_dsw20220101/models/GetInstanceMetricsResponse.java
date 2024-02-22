// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceMetricsResponseBody body;

    public static GetInstanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceMetricsResponse self = new GetInstanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceMetricsResponse setBody(GetInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
