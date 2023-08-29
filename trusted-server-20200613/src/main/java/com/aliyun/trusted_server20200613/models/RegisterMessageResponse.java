// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class RegisterMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterMessageResponseBody body;

    public static RegisterMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterMessageResponse self = new RegisterMessageResponse();
        return TeaModel.build(map, self);
    }

    public RegisterMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterMessageResponse setBody(RegisterMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterMessageResponseBody getBody() {
        return this.body;
    }

}
