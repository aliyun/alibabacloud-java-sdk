// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class EnableOpenSearchPublicEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableOpenSearchPublicEndpointResponseBody body;

    public static EnableOpenSearchPublicEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableOpenSearchPublicEndpointResponse self = new EnableOpenSearchPublicEndpointResponse();
        return TeaModel.build(map, self);
    }

    public EnableOpenSearchPublicEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableOpenSearchPublicEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableOpenSearchPublicEndpointResponse setBody(EnableOpenSearchPublicEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableOpenSearchPublicEndpointResponseBody getBody() {
        return this.body;
    }

}
