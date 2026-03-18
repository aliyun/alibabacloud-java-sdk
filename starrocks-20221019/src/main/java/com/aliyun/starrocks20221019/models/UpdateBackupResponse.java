// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class UpdateBackupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBackupResponseBody body;

    public static UpdateBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBackupResponse self = new UpdateBackupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBackupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBackupResponse setBody(UpdateBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBackupResponseBody getBody() {
        return this.body;
    }

}
