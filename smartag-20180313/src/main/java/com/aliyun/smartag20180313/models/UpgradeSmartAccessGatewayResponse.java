// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UpgradeSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpgradeSmartAccessGatewayResponseBody body;

    public static UpgradeSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeSmartAccessGatewayResponse self = new UpgradeSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UpgradeSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpgradeSmartAccessGatewayResponse setBody(UpgradeSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UpgradeSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
