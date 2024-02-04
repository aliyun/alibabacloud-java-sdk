// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBackupResponseBody body;

    public static DeleteBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupResponse self = new DeleteBackupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupResponse setBody(DeleteBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupResponseBody getBody() {
        return this.body;
    }

}
