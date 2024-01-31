// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBProxyEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBProxyEndpointAddressResponseBody body;

    public static ModifyDBProxyEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBProxyEndpointAddressResponse self = new ModifyDBProxyEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBProxyEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBProxyEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBProxyEndpointAddressResponse setBody(ModifyDBProxyEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBProxyEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
