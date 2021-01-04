// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ActivateSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ActivateSmartAccessGatewayResponseBody body;

    public static ActivateSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateSmartAccessGatewayResponse self = new ActivateSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ActivateSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateSmartAccessGatewayResponse setBody(ActivateSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
