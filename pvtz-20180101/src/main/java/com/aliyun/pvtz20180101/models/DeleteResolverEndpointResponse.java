// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DeleteResolverEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteResolverEndpointResponseBody body;

    public static DeleteResolverEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteResolverEndpointResponse self = new DeleteResolverEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteResolverEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteResolverEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteResolverEndpointResponse setBody(DeleteResolverEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteResolverEndpointResponseBody getBody() {
        return this.body;
    }

}
