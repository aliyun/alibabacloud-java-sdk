// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationBackupResponseBody body;

    public static CreateApplicationBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationBackupResponse self = new CreateApplicationBackupResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationBackupResponse setBody(CreateApplicationBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationBackupResponseBody getBody() {
        return this.body;
    }

}
