// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class GetRenderingProjectInstanceStateMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRenderingProjectInstanceStateMetricsResponseBody body;

    public static GetRenderingProjectInstanceStateMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRenderingProjectInstanceStateMetricsResponse self = new GetRenderingProjectInstanceStateMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetRenderingProjectInstanceStateMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRenderingProjectInstanceStateMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRenderingProjectInstanceStateMetricsResponse setBody(GetRenderingProjectInstanceStateMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRenderingProjectInstanceStateMetricsResponseBody getBody() {
        return this.body;
    }

}
