// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBProxyEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBProxyEndpointAddressResponseBody body;

    public static DeleteDBProxyEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBProxyEndpointAddressResponse self = new DeleteDBProxyEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBProxyEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBProxyEndpointAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBProxyEndpointAddressResponse setBody(DeleteDBProxyEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBProxyEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
