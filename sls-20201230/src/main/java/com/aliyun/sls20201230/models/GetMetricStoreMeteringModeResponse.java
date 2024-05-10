// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetMetricStoreMeteringModeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMetricStoreMeteringModeResponseBody body;

    public static GetMetricStoreMeteringModeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetricStoreMeteringModeResponse self = new GetMetricStoreMeteringModeResponse();
        return TeaModel.build(map, self);
    }

    public GetMetricStoreMeteringModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMetricStoreMeteringModeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMetricStoreMeteringModeResponse setBody(GetMetricStoreMeteringModeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMetricStoreMeteringModeResponseBody getBody() {
        return this.body;
    }

}
