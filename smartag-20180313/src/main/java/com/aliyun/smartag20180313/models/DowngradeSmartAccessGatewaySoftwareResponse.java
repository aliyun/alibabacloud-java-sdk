// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewaySoftwareResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DowngradeSmartAccessGatewaySoftwareResponseBody body;

    public static DowngradeSmartAccessGatewaySoftwareResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradeSmartAccessGatewaySoftwareResponse self = new DowngradeSmartAccessGatewaySoftwareResponse();
        return TeaModel.build(map, self);
    }

    public DowngradeSmartAccessGatewaySoftwareResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradeSmartAccessGatewaySoftwareResponse setBody(DowngradeSmartAccessGatewaySoftwareResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradeSmartAccessGatewaySoftwareResponseBody getBody() {
        return this.body;
    }

}
