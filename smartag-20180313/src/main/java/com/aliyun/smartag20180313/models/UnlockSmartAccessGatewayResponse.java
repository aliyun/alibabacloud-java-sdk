// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class UnlockSmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UnlockSmartAccessGatewayResponseBody body;

    public static UnlockSmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        UnlockSmartAccessGatewayResponse self = new UnlockSmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public UnlockSmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnlockSmartAccessGatewayResponse setBody(UnlockSmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public UnlockSmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
