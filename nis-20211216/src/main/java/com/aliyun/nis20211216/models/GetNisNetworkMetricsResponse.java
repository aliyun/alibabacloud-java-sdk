// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisNetworkMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNisNetworkMetricsResponseBody body;

    public static GetNisNetworkMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNisNetworkMetricsResponse self = new GetNisNetworkMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetNisNetworkMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNisNetworkMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNisNetworkMetricsResponse setBody(GetNisNetworkMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNisNetworkMetricsResponseBody getBody() {
        return this.body;
    }

}
