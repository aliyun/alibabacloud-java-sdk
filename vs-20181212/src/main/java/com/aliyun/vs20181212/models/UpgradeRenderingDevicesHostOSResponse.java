// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class UpgradeRenderingDevicesHostOSResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeRenderingDevicesHostOSResponseBody body;

    public static UpgradeRenderingDevicesHostOSResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeRenderingDevicesHostOSResponse self = new UpgradeRenderingDevicesHostOSResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeRenderingDevicesHostOSResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeRenderingDevicesHostOSResponse setBody(UpgradeRenderingDevicesHostOSResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeRenderingDevicesHostOSResponseBody getBody() {
        return this.body;
    }

}
