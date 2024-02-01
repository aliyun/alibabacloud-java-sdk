// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnPbrRouteEntryPriorityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpnPbrRouteEntryPriorityResponseBody body;

    public static ModifyVpnPbrRouteEntryPriorityResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnPbrRouteEntryPriorityResponse self = new ModifyVpnPbrRouteEntryPriorityResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnPbrRouteEntryPriorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpnPbrRouteEntryPriorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpnPbrRouteEntryPriorityResponse setBody(ModifyVpnPbrRouteEntryPriorityResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnPbrRouteEntryPriorityResponseBody getBody() {
        return this.body;
    }

}
