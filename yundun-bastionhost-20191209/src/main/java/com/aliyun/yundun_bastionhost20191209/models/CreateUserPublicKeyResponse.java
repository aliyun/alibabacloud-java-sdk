// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateUserPublicKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateUserPublicKeyResponseBody body;

    public static CreateUserPublicKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserPublicKeyResponse self = new CreateUserPublicKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserPublicKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserPublicKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserPublicKeyResponse setBody(CreateUserPublicKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserPublicKeyResponseBody getBody() {
        return this.body;
    }

}
