// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterEndpointResponseBody body;

    public static ModifyDBClusterEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterEndpointResponse self = new ModifyDBClusterEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterEndpointResponse setBody(ModifyDBClusterEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

}
