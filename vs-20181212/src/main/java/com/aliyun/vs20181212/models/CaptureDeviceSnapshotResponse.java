// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class CaptureDeviceSnapshotResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CaptureDeviceSnapshotResponseBody body;

    public static CaptureDeviceSnapshotResponse build(java.util.Map<String, ?> map) throws Exception {
        CaptureDeviceSnapshotResponse self = new CaptureDeviceSnapshotResponse();
        return TeaModel.build(map, self);
    }

    public CaptureDeviceSnapshotResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CaptureDeviceSnapshotResponse setBody(CaptureDeviceSnapshotResponseBody body) {
        this.body = body;
        return this;
    }
    public CaptureDeviceSnapshotResponseBody getBody() {
        return this.body;
    }

}
