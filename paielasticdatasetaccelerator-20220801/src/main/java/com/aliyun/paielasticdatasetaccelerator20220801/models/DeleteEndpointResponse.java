// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DeleteEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEndpointResponseBody body;

    public static DeleteEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEndpointResponse self = new DeleteEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEndpointResponse setBody(DeleteEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEndpointResponseBody getBody() {
        return this.body;
    }

}
