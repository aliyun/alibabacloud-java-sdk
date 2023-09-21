// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotEventTrendResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetHoneypotEventTrendResponseBody body;

    public static GetHoneypotEventTrendResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHoneypotEventTrendResponse self = new GetHoneypotEventTrendResponse();
        return TeaModel.build(map, self);
    }

    public GetHoneypotEventTrendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHoneypotEventTrendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHoneypotEventTrendResponse setBody(GetHoneypotEventTrendResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHoneypotEventTrendResponseBody getBody() {
        return this.body;
    }

}
