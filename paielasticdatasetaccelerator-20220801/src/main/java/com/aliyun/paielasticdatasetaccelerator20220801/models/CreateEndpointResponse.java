// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class CreateEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateEndpointResponseBody body;

    public static CreateEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEndpointResponse self = new CreateEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEndpointResponse setBody(CreateEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEndpointResponseBody getBody() {
        return this.body;
    }

}
