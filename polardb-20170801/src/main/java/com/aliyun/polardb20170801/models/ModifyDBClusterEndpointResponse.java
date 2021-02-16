// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDBClusterEndpointResponse setBody(ModifyDBClusterEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterEndpointResponseBody getBody() {
        return this.body;
    }

}
