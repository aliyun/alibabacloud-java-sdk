// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnPbrRouteEntryWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpnPbrRouteEntryWeightResponseBody body;

    public static ModifyVpnPbrRouteEntryWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnPbrRouteEntryWeightResponse self = new ModifyVpnPbrRouteEntryWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnPbrRouteEntryWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpnPbrRouteEntryWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpnPbrRouteEntryWeightResponse setBody(ModifyVpnPbrRouteEntryWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnPbrRouteEntryWeightResponseBody getBody() {
        return this.body;
    }

}
