// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTablesWithVpcGatewayEndpointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateRouteTablesWithVpcGatewayEndpointResponseBody body;

    public static AssociateRouteTablesWithVpcGatewayEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTablesWithVpcGatewayEndpointResponse self = new AssociateRouteTablesWithVpcGatewayEndpointResponse();
        return TeaModel.build(map, self);
    }

    public AssociateRouteTablesWithVpcGatewayEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateRouteTablesWithVpcGatewayEndpointResponse setBody(AssociateRouteTablesWithVpcGatewayEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateRouteTablesWithVpcGatewayEndpointResponseBody getBody() {
        return this.body;
    }

}
