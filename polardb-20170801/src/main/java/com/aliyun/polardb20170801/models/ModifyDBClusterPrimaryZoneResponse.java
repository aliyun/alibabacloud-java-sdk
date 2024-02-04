// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPrimaryZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBClusterPrimaryZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterPrimaryZoneResponse setBody(ModifyDBClusterPrimaryZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterPrimaryZoneResponseBody getBody() {
        return this.body;
    }

}
