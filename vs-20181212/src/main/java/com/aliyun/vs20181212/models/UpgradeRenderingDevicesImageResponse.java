// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingDevicesImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeRenderingDevicesImageResponseBody body;

    public static UpgradeRenderingDevicesImageResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingDevicesImageResponse self = new UpgradeRenderingDevicesImageResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingDevicesImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeRenderingDevicesImageResponse setBody(UpgradeRenderingDevicesImageResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeRenderingDevicesImageResponseBody getBody() {
        return this.body;
    }

}
