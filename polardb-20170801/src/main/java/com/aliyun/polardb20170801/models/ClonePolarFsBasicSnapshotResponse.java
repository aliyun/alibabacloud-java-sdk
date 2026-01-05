// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ClonePolarFsBasicSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ClonePolarFsBasicSnapshotResponseBody body;

    public static ClonePolarFsBasicSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        ClonePolarFsBasicSnapshotResponse self = new ClonePolarFsBasicSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public ClonePolarFsBasicSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClonePolarFsBasicSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ClonePolarFsBasicSnapshotResponse setBody(ClonePolarFsBasicSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public ClonePolarFsBasicSnapshotResponseBody getBody() {
        return this.body;
    }

}
