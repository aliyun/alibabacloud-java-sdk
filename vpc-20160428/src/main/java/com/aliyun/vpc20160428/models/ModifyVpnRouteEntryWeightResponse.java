// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnRouteEntryWeightResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpnRouteEntryWeightResponseBody body;

    public static ModifyVpnRouteEntryWeightResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpnRouteEntryWeightResponse self = new ModifyVpnRouteEntryWeightResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpnRouteEntryWeightResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpnRouteEntryWeightResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpnRouteEntryWeightResponse setBody(ModifyVpnRouteEntryWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnRouteEntryWeightResponseBody getBody() {
        return this.body;
    }

}
