// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class BindEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindEndpointResponseBody body;

    public static BindEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        BindEndpointResponse self = new BindEndpointResponse();
        return TeaModel.build(map, self);
    }

    public BindEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindEndpointResponse setBody(BindEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public BindEndpointResponseBody getBody() {
        return this.body;
    }

}
