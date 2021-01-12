// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBProxyEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBProxyEndpointAddressResponseBody body;

    public static CreateDBProxyEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBProxyEndpointAddressResponse self = new CreateDBProxyEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBProxyEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBProxyEndpointAddressResponse setBody(CreateDBProxyEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBProxyEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
