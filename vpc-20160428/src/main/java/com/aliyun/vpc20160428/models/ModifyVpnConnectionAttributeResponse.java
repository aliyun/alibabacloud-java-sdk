// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnConnectionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyVpnConnectionAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpnConnectionAttributeResponse setBody(ModifyVpnConnectionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnConnectionAttributeResponseBody getBody() {
        return this.body;
    }

}
