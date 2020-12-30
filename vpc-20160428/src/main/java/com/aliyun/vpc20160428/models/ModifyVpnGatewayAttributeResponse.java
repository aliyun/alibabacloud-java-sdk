// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVpnGatewayAttributeResponseBody body;

    public static ModifyVpnGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnGatewayAttributeResponse self = new ModifyVpnGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpnGatewayAttributeResponse setBody(ModifyVpnGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
