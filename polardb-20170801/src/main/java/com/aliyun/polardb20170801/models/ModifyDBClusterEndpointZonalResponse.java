// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterEndpointZonalResponseBody body;

    public static ModifyDBClusterEndpointZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterEndpointZonalResponse self = new ModifyDBClusterEndpointZonalResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterEndpointZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterEndpointZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterEndpointZonalResponse setBody(ModifyDBClusterEndpointZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterEndpointZonalResponseBody getBody() {
        return this.body;
    }

}
