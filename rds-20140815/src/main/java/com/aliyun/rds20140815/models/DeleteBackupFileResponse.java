// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteBackupFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBackupFileResponseBody body;

    public static DeleteBackupFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileResponse self = new DeleteBackupFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupFileResponse setBody(DeleteBackupFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupFileResponseBody getBody() {
        return this.body;
    }

}
