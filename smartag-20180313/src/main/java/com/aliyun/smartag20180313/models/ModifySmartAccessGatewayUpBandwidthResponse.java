// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayUpBandwidthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySmartAccessGatewayUpBandwidthResponseBody body;

    public static ModifySmartAccessGatewayUpBandwidthResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayUpBandwidthResponse self = new ModifySmartAccessGatewayUpBandwidthResponse();
        return TeaModel.build(map, self);
    }

    public ModifySmartAccessGatewayUpBandwidthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySmartAccessGatewayUpBandwidthResponse setBody(ModifySmartAccessGatewayUpBandwidthResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySmartAccessGatewayUpBandwidthResponseBody getBody() {
        return this.body;
    }

}
