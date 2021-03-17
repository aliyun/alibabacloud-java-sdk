// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class GetSnapshotInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSnapshotInfoResponseBody body;

    public static GetSnapshotInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotInfoResponse self = new GetSnapshotInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotInfoResponse setBody(GetSnapshotInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSnapshotInfoResponseBody getBody() {
        return this.body;
    }

}
