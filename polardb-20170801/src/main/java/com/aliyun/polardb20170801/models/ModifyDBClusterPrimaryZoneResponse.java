// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPrimaryZoneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBClusterPrimaryZoneResponseBody body;

    public static ModifyDBClusterPrimaryZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterPrimaryZoneResponse self = new ModifyDBClusterPrimaryZoneResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterPrimaryZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterPrimaryZoneResponse setBody(ModifyDBClusterPrimaryZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterPrimaryZoneResponseBody getBody() {
        return this.body;
    }

}
