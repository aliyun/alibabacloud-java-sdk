// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDBEndpointAddressResponseBody body;

    public static CreateDBEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDBEndpointAddressResponse self = new CreateDBEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateDBEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDBEndpointAddressResponse setBody(CreateDBEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
