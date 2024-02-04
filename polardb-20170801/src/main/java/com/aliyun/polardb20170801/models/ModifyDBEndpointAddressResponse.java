// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBEndpointAddressResponseBody body;

    public static ModifyDBEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBEndpointAddressResponse self = new ModifyDBEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBEndpointAddressResponse setBody(ModifyDBEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
