// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteBackupSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBackupSnapshotResponseBody body;

    public static DeleteBackupSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupSnapshotResponse self = new DeleteBackupSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBackupSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBackupSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBackupSnapshotResponse setBody(DeleteBackupSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBackupSnapshotResponseBody getBody() {
        return this.body;
    }

}
