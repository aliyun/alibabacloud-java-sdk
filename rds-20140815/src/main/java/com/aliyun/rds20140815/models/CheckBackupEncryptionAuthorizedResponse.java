// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckBackupEncryptionAuthorizedResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckBackupEncryptionAuthorizedResponseBody body;

    public static CheckBackupEncryptionAuthorizedResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckBackupEncryptionAuthorizedResponse self = new CheckBackupEncryptionAuthorizedResponse();
        return TeaModel.build(map, self);
    }

    public CheckBackupEncryptionAuthorizedResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckBackupEncryptionAuthorizedResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckBackupEncryptionAuthorizedResponse setBody(CheckBackupEncryptionAuthorizedResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckBackupEncryptionAuthorizedResponseBody getBody() {
        return this.body;
    }

}
