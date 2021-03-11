// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BindParentPlatformDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindParentPlatformDeviceResponseBody body;

    public static BindParentPlatformDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BindParentPlatformDeviceResponse self = new BindParentPlatformDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BindParentPlatformDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindParentPlatformDeviceResponse setBody(BindParentPlatformDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BindParentPlatformDeviceResponseBody getBody() {
        return this.body;
    }

}
