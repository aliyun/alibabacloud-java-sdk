// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpnRouteEntryWeightResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyVpnRouteEntryWeightResponse setBody(ModifyVpnRouteEntryWeightResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpnRouteEntryWeightResponseBody getBody() {
        return this.body;
    }

}
