// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InitialSysomResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitialSysomResponseBody body;

    public static InitialSysomResponse build(java.util.Map<String, ?> map) throws Exception {
        InitialSysomResponse self = new InitialSysomResponse();
        return TeaModel.build(map, self);
    }

    public InitialSysomResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitialSysomResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitialSysomResponse setBody(InitialSysomResponseBody body) {
        this.body = body;
        return this;
    }
    public InitialSysomResponseBody getBody() {
        return this.body;
    }

}
