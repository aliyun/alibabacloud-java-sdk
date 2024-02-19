// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddResolverEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddResolverEndpointResponseBody body;

    public static AddResolverEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        AddResolverEndpointResponse self = new AddResolverEndpointResponse();
        return TeaModel.build(map, self);
    }

    public AddResolverEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddResolverEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddResolverEndpointResponse setBody(AddResolverEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public AddResolverEndpointResponseBody getBody() {
        return this.body;
    }

}
