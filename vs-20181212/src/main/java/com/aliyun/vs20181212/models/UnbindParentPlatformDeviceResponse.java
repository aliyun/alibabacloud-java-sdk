// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UnbindParentPlatformDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindParentPlatformDeviceResponseBody body;

    public static UnbindParentPlatformDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindParentPlatformDeviceResponse self = new UnbindParentPlatformDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UnbindParentPlatformDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindParentPlatformDeviceResponse setBody(UnbindParentPlatformDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindParentPlatformDeviceResponseBody getBody() {
        return this.body;
    }

}
