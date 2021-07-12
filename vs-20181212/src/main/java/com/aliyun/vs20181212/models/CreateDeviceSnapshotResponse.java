// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CreateDeviceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDeviceSnapshotResponseBody body;

    public static CreateDeviceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceSnapshotResponse self = new CreateDeviceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeviceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeviceSnapshotResponse setBody(CreateDeviceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeviceSnapshotResponseBody getBody() {
        return this.body;
    }

}
