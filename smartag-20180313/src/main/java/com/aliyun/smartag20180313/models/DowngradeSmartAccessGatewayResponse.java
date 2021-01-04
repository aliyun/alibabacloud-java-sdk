// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DowngradeSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DowngradeSmartAccessGatewayResponseBody body;

    public static DowngradeSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DowngradeSmartAccessGatewayResponse self = new DowngradeSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DowngradeSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DowngradeSmartAccessGatewayResponse setBody(DowngradeSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DowngradeSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
