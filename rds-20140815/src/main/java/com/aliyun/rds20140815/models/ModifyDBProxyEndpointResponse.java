// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDBProxyEndpointResponseBody body;

    public static ModifyDBProxyEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointResponse self = new ModifyDBProxyEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBProxyEndpointResponse setBody(ModifyDBProxyEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBProxyEndpointResponseBody getBody() {
        return this.body;
    }

}
