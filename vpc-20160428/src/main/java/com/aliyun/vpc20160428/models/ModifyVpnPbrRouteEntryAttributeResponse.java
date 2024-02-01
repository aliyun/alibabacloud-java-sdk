// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnPbrRouteEntryAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpnPbrRouteEntryAttributeResponseBody body;

    public static ModifyVpnPbrRouteEntryAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnPbrRouteEntryAttributeResponse self = new ModifyVpnPbrRouteEntryAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnPbrRouteEntryAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpnPbrRouteEntryAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpnPbrRouteEntryAttributeResponse setBody(ModifyVpnPbrRouteEntryAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnPbrRouteEntryAttributeResponseBody getBody() {
        return this.body;
    }

}
