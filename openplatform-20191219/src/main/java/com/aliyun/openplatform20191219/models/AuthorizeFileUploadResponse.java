// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openplatform20191219.models;

import com.aliyun.tea.*;

public class AuthorizeFileUploadResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AuthorizeFileUploadResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeFileUploadResponse setBody(AuthorizeFileUploadResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeFileUploadResponseBody getBody() {
        return this.body;
    }

}
