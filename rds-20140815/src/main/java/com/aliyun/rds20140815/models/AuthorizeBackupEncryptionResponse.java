// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class AuthorizeBackupEncryptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeBackupEncryptionResponseBody body;

    public static AuthorizeBackupEncryptionResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeBackupEncryptionResponse self = new AuthorizeBackupEncryptionResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeBackupEncryptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeBackupEncryptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeBackupEncryptionResponse setBody(AuthorizeBackupEncryptionResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeBackupEncryptionResponseBody getBody() {
        return this.body;
    }

}
