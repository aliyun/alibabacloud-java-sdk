// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateRouteTablesFromVpcGatewayEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateRouteTablesFromVpcGatewayEndpointResponseBody body;

    public static DissociateRouteTablesFromVpcGatewayEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateRouteTablesFromVpcGatewayEndpointResponse self = new DissociateRouteTablesFromVpcGatewayEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DissociateRouteTablesFromVpcGatewayEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateRouteTablesFromVpcGatewayEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateRouteTablesFromVpcGatewayEndpointResponse setBody(DissociateRouteTablesFromVpcGatewayEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateRouteTablesFromVpcGatewayEndpointResponseBody getBody() {
        return this.body;
    }

}
