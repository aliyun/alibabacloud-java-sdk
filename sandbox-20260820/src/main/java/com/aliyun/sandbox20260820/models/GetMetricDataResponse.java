// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class GetMetricDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetricDataResponseBody body;

    public static GetMetricDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricDataResponse self = new GetMetricDataResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricDataResponse setBody(GetMetricDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricDataResponseBody getBody() {
        return this.body;
    }

}
