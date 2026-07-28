// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyApplicationEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyApplicationEndpointAddressResponseBody body;

    public static ModifyApplicationEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationEndpointAddressResponse self = new ModifyApplicationEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyApplicationEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyApplicationEndpointAddressResponse setBody(ModifyApplicationEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyApplicationEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
