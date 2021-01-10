// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AuthCasDatabaseAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthCasDatabaseAccountResponseBody body;

    public static AuthCasDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthCasDatabaseAccountResponse self = new AuthCasDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public AuthCasDatabaseAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthCasDatabaseAccountResponse setBody(AuthCasDatabaseAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthCasDatabaseAccountResponseBody getBody() {
        return this.body;
    }

}
