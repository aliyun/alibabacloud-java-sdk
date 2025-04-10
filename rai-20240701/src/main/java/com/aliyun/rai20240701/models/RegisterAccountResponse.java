// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class RegisterAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RegisterAccountResponseBody body;

    public static RegisterAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterAccountResponse self = new RegisterAccountResponse();
        return TeaModel.build(map, self);
    }

    public RegisterAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterAccountResponse setBody(RegisterAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterAccountResponseBody getBody() {
        return this.body;
    }

}
