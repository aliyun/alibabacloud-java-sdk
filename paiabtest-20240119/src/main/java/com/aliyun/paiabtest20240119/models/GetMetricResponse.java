// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class GetMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetricResponseBody body;

    public static GetMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricResponse self = new GetMetricResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricResponse setBody(GetMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricResponseBody getBody() {
        return this.body;
    }

}
