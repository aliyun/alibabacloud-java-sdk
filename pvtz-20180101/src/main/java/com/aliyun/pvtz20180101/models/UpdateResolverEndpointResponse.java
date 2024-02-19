// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateResolverEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResolverEndpointResponseBody body;

    public static UpdateResolverEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResolverEndpointResponse self = new UpdateResolverEndpointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResolverEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResolverEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResolverEndpointResponse setBody(UpdateResolverEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResolverEndpointResponseBody getBody() {
        return this.body;
    }

}
