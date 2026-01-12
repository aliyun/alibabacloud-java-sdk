// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class LoginAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LoginAppResponseBody body;

    public static LoginAppResponse build(java.util.Map<String, ?> map) throws Exception {
        LoginAppResponse self = new LoginAppResponse();
        return TeaModel.build(map, self);
    }

    public LoginAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LoginAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LoginAppResponse setBody(LoginAppResponseBody body) {
        this.body = body;
        return this;
    }
    public LoginAppResponseBody getBody() {
        return this.body;
    }

}
