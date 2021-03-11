// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateStreamSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateStreamSnapshotResponseBody body;

    public static CreateStreamSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamSnapshotResponse self = new CreateStreamSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateStreamSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateStreamSnapshotResponse setBody(CreateStreamSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateStreamSnapshotResponseBody getBody() {
        return this.body;
    }

}
