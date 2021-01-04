// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class BindSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BindSmartAccessGatewayResponseBody body;

    public static BindSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        BindSmartAccessGatewayResponse self = new BindSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public BindSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindSmartAccessGatewayResponse setBody(BindSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
