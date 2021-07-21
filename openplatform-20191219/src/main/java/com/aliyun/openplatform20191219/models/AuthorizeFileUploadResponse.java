// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openplatform20191219.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeFileUploadResponseBody body;

    public static AuthorizeFileUploadResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeFileUploadResponse self = new AuthorizeFileUploadResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeFileUploadResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeFileUploadResponse setBody(AuthorizeFileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeFileUploadResponseBody getBody() {
        return this.body;
    }

}
