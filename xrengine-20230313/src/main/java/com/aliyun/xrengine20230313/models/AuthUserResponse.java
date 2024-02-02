// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class AuthUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthUserResponseBody body;

    public static AuthUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthUserResponse self = new AuthUserResponse();
        return TeaModel.build(map, self);
    }

    public AuthUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthUserResponse setBody(AuthUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthUserResponseBody getBody() {
        return this.body;
    }

}
