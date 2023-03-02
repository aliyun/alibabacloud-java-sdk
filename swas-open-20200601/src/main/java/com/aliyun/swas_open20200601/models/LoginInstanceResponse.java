// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class LoginInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LoginInstanceResponseBody body;

    public static LoginInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginInstanceResponse self = new LoginInstanceResponse();
        return TeaModel.build(map, self);
    }

    public LoginInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginInstanceResponse setBody(LoginInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginInstanceResponseBody getBody() {
        return this.body;
    }

}
