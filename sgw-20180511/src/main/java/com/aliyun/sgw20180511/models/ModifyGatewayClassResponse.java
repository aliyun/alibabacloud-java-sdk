// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGatewayClassResponseBody body;

    public static ModifyGatewayClassResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayClassResponse self = new ModifyGatewayClassResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGatewayClassResponse setBody(ModifyGatewayClassResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGatewayClassResponseBody getBody() {
        return this.body;
    }

}
