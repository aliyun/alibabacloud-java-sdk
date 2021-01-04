// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnbindSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindSmartAccessGatewayResponseBody body;

    public static UnbindSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSmartAccessGatewayResponse self = new UnbindSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSmartAccessGatewayResponse setBody(UnbindSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
