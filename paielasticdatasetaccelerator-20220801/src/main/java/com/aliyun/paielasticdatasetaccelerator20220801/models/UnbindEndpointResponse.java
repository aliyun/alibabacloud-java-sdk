// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class UnbindEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindEndpointResponseBody body;

    public static UnbindEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindEndpointResponse self = new UnbindEndpointResponse();
        return TeaModel.build(map, self);
    }

    public UnbindEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindEndpointResponse setBody(UnbindEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindEndpointResponseBody getBody() {
        return this.body;
    }

}
