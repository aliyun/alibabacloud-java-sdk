// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateUserAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserAccessTokenResponseBody body;

    public static CreateUserAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAccessTokenResponse self = new CreateUserAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserAccessTokenResponse setBody(CreateUserAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserAccessTokenResponseBody getBody() {
        return this.body;
    }

}
