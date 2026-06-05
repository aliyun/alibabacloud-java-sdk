// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class RollbackAppCodeSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RollbackAppCodeSnapshotResponseBody body;

    public static RollbackAppCodeSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        RollbackAppCodeSnapshotResponse self = new RollbackAppCodeSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public RollbackAppCodeSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RollbackAppCodeSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RollbackAppCodeSnapshotResponse setBody(RollbackAppCodeSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public RollbackAppCodeSnapshotResponseBody getBody() {
        return this.body;
    }

}
