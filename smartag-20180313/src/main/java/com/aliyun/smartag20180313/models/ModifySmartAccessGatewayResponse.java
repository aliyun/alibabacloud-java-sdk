// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ModifySmartAccessGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifySmartAccessGatewayResponseBody body;

    public static ModifySmartAccessGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySmartAccessGatewayResponse self = new ModifySmartAccessGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ModifySmartAccessGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifySmartAccessGatewayResponse setBody(ModifySmartAccessGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifySmartAccessGatewayResponseBody getBody() {
        return this.body;
    }

}
