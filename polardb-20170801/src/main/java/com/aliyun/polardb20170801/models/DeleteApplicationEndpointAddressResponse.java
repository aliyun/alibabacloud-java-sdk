// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteApplicationEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationEndpointAddressResponseBody body;

    public static DeleteApplicationEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationEndpointAddressResponse self = new DeleteApplicationEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationEndpointAddressResponse setBody(DeleteApplicationEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
