// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteGatewayRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteGatewayRouteResponseBody body;

    public static DeleteGatewayRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGatewayRouteResponse self = new DeleteGatewayRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGatewayRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGatewayRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGatewayRouteResponse setBody(DeleteGatewayRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGatewayRouteResponseBody getBody() {
        return this.body;
    }

}
