// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class EnableBackupEncryptionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableBackupEncryptionResponseBody body;

    public static EnableBackupEncryptionResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupEncryptionResponse self = new EnableBackupEncryptionResponse();
        return TeaModel.build(map, self);
    }

    public EnableBackupEncryptionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableBackupEncryptionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableBackupEncryptionResponse setBody(EnableBackupEncryptionResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBackupEncryptionResponseBody getBody() {
        return this.body;
    }

}
