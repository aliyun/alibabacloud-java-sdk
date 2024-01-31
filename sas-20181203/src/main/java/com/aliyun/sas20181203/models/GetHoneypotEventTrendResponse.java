// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetHoneypotEventTrendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
