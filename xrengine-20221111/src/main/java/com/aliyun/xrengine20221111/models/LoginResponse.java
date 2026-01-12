// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class LoginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoginResponseBody body;

    public static LoginResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginResponse self = new LoginResponse();
        return TeaModel.build(map, self);
    }

    public LoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginResponse setBody(LoginResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginResponseBody getBody() {
        return this.body;
    }

}
