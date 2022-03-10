// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AuthorizeMenuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeMenuResponseBody body;

    public static AuthorizeMenuResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeMenuResponse self = new AuthorizeMenuResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeMenuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeMenuResponse setBody(AuthorizeMenuResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeMenuResponseBody getBody() {
        return this.body;
    }

}
