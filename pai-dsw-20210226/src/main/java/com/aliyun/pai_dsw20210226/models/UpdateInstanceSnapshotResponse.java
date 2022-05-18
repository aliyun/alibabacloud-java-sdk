// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class UpdateInstanceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateInstanceSnapshotResponseBody body;

    public static UpdateInstanceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceSnapshotResponse self = new UpdateInstanceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateInstanceSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateInstanceSnapshotResponse setBody(UpdateInstanceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

}
