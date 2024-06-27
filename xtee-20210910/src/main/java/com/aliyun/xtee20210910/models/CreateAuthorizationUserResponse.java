// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreateAuthorizationUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAuthorizationUserResponseBody body;

    public static CreateAuthorizationUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationUserResponse self = new CreateAuthorizationUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAuthorizationUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAuthorizationUserResponse setBody(CreateAuthorizationUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAuthorizationUserResponseBody getBody() {
        return this.body;
    }

}
