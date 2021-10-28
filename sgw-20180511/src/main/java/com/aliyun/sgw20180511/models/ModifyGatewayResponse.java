// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ModifyGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyGatewayResponseBody body;

    public static ModifyGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayResponse self = new ModifyGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGatewayResponse setBody(ModifyGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGatewayResponseBody getBody() {
        return this.body;
    }

}
