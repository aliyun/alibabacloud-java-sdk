// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewaySoftwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeSmartAccessGatewaySoftwareResponseBody body;

    public static UpgradeSmartAccessGatewaySoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewaySoftwareResponse self = new UpgradeSmartAccessGatewaySoftwareResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewaySoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeSmartAccessGatewaySoftwareResponse setBody(UpgradeSmartAccessGatewaySoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeSmartAccessGatewaySoftwareResponseBody getBody() {
        return this.body;
    }

}
