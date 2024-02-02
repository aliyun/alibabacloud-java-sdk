// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class LoginModelScopeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoginModelScopeResponseBody body;

    public static LoginModelScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginModelScopeResponse self = new LoginModelScopeResponse();
        return TeaModel.build(map, self);
    }

    public LoginModelScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginModelScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginModelScopeResponse setBody(LoginModelScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginModelScopeResponseBody getBody() {
        return this.body;
    }

}
