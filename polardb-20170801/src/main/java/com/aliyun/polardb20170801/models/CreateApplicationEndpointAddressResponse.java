// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateApplicationEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationEndpointAddressResponseBody body;

    public static CreateApplicationEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationEndpointAddressResponse self = new CreateApplicationEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationEndpointAddressResponse setBody(CreateApplicationEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
