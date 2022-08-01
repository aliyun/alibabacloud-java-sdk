// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDBEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

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

    public CreateDBEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDBEndpointAddressResponse setBody(CreateDBEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDBEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
