// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.privatelink20200415.models;

import com.aliyun.tea.*;

public class DisableVpcEndpointConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableVpcEndpointConnectionResponseBody body;

    public static DisableVpcEndpointConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableVpcEndpointConnectionResponse self = new DisableVpcEndpointConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DisableVpcEndpointConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableVpcEndpointConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableVpcEndpointConnectionResponse setBody(DisableVpcEndpointConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableVpcEndpointConnectionResponseBody getBody() {
        return this.body;
    }

}
