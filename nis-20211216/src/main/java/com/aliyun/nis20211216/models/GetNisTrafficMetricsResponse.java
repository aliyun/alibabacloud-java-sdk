// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class GetNisTrafficMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNisTrafficMetricsResponseBody body;

    public static GetNisTrafficMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNisTrafficMetricsResponse self = new GetNisTrafficMetricsResponse();
        return TeaModel.build(map, self);
    }

    public GetNisTrafficMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNisTrafficMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNisTrafficMetricsResponse setBody(GetNisTrafficMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNisTrafficMetricsResponseBody getBody() {
        return this.body;
    }

}
