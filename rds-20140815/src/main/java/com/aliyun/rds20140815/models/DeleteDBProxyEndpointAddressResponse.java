// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteDBProxyEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteDBProxyEndpointAddressResponse setBody(DeleteDBProxyEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBProxyEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
