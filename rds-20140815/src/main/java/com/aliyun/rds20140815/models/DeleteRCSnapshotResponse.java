// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRCSnapshotResponseBody body;

    public static DeleteRCSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCSnapshotResponse self = new DeleteRCSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRCSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRCSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRCSnapshotResponse setBody(DeleteRCSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRCSnapshotResponseBody getBody() {
        return this.body;
    }

}
