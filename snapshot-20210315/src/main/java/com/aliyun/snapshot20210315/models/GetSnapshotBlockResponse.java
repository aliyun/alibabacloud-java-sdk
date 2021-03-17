// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.snapshot20210315.models;

import com.aliyun.tea.*;

public class GetSnapshotBlockResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.io.InputStream body;

    public static GetSnapshotBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSnapshotBlockResponse self = new GetSnapshotBlockResponse();
        return TeaModel.build(map, self);
    }

    public GetSnapshotBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSnapshotBlockResponse setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
