// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetInstanceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceSnapshotResponseBody body;

    public static GetInstanceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSnapshotResponse self = new GetInstanceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceSnapshotResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceSnapshotResponse setBody(GetInstanceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

}
