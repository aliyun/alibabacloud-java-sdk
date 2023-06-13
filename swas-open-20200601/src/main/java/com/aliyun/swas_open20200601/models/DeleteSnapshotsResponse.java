// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DeleteSnapshotsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSnapshotsResponseBody body;

    public static DeleteSnapshotsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSnapshotsResponse self = new DeleteSnapshotsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSnapshotsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSnapshotsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSnapshotsResponse setBody(DeleteSnapshotsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSnapshotsResponseBody getBody() {
        return this.body;
    }

}
