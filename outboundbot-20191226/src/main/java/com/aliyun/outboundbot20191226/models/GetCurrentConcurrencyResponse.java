// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetCurrentConcurrencyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCurrentConcurrencyResponseBody body;

    public static GetCurrentConcurrencyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentConcurrencyResponse self = new GetCurrentConcurrencyResponse();
        return TeaModel.build(map, self);
    }

    public GetCurrentConcurrencyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCurrentConcurrencyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCurrentConcurrencyResponse setBody(GetCurrentConcurrencyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCurrentConcurrencyResponseBody getBody() {
        return this.body;
    }

}
