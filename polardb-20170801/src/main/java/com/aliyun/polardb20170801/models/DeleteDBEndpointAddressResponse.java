// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBEndpointAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDBEndpointAddressResponseBody body;

    public static DeleteDBEndpointAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBEndpointAddressResponse self = new DeleteDBEndpointAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBEndpointAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBEndpointAddressResponse setBody(DeleteDBEndpointAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBEndpointAddressResponseBody getBody() {
        return this.body;
    }

}
