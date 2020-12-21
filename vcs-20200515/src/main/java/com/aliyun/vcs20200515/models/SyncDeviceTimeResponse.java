// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class SyncDeviceTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncDeviceTimeResponseBody body;

    public static SyncDeviceTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceTimeResponse self = new SyncDeviceTimeResponse();
        return TeaModel.build(map, self);
    }

    public SyncDeviceTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDeviceTimeResponse setBody(SyncDeviceTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDeviceTimeResponseBody getBody() {
        return this.body;
    }

}
