// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DisableOpenSearchPublicEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableOpenSearchPublicEndpointResponseBody body;

    public static DisableOpenSearchPublicEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableOpenSearchPublicEndpointResponse self = new DisableOpenSearchPublicEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DisableOpenSearchPublicEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableOpenSearchPublicEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableOpenSearchPublicEndpointResponse setBody(DisableOpenSearchPublicEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableOpenSearchPublicEndpointResponseBody getBody() {
        return this.body;
    }

}
