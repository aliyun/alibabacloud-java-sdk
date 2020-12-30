// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyVpnConnectionAttributeResponseBody body;

    public static ModifyVpnConnectionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnConnectionAttributeResponse self = new ModifyVpnConnectionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnConnectionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpnConnectionAttributeResponse setBody(ModifyVpnConnectionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBody getBody() {
        return this.body;
    }

}
