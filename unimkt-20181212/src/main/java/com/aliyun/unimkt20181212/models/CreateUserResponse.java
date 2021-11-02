// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class CreateUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserResponseBody body;

    public static CreateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserResponse self = new CreateUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserResponse setBody(CreateUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserResponseBody getBody() {
        return this.body;
    }

}
