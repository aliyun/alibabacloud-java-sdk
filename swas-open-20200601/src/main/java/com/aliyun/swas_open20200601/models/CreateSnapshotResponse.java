// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class CreateSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateSnapshotResponseBody body;

    public static CreateSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSnapshotResponse self = new CreateSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSnapshotResponse setBody(CreateSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSnapshotResponseBody getBody() {
        return this.body;
    }

}
