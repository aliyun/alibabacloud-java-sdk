// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDBEndpointAddressResponse setBody(ModifyDBEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
