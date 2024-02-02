// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class InitLocateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitLocateResponseBody body;

    public static InitLocateResponse build(java.util.Map<String, ?> map) throws Exception {
        InitLocateResponse self = new InitLocateResponse();
        return TeaModel.build(map, self);
    }

    public InitLocateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitLocateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitLocateResponse setBody(InitLocateResponseBody body) {
        this.body = body;
        return this;
    }
    public InitLocateResponseBody getBody() {
        return this.body;
    }

}
