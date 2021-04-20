// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class RaiseDevicesStorageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RaiseDevicesStorageResponseBody body;

    public static RaiseDevicesStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        RaiseDevicesStorageResponse self = new RaiseDevicesStorageResponse();
        return TeaModel.build(map, self);
    }

    public RaiseDevicesStorageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RaiseDevicesStorageResponse setBody(RaiseDevicesStorageResponseBody body) {
        this.body = body;
        return this;
    }
    public RaiseDevicesStorageResponseBody getBody() {
        return this.body;
    }

}
