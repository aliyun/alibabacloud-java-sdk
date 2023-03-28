// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ReduceVideoNoiseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReduceVideoNoiseResponseBody body;

    public static ReduceVideoNoiseResponse build(java.util.Map<String, ?> map) throws Exception {
        ReduceVideoNoiseResponse self = new ReduceVideoNoiseResponse();
        return TeaModel.build(map, self);
    }

    public ReduceVideoNoiseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReduceVideoNoiseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReduceVideoNoiseResponse setBody(ReduceVideoNoiseResponseBody body) {
        this.body = body;
        return this;
    }
    public ReduceVideoNoiseResponseBody getBody() {
        return this.body;
    }

}
