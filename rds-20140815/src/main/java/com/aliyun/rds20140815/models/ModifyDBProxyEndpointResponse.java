// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyDBProxyEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBProxyEndpointResponse setBody(ModifyDBProxyEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBProxyEndpointResponseBody getBody() {
        return this.body;
    }

}
