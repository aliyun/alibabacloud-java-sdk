// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RegisterBucUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterBucUserResponseBody body;

    public static RegisterBucUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterBucUserResponse self = new RegisterBucUserResponse();
        return TeaModel.build(map, self);
    }

    public RegisterBucUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterBucUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterBucUserResponse setBody(RegisterBucUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterBucUserResponseBody getBody() {
        return this.body;
    }

}
