// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableWithGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssociateRouteTableWithGatewayResponseBody body;

    public static AssociateRouteTableWithGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateRouteTableWithGatewayResponse self = new AssociateRouteTableWithGatewayResponse();
        return TeaModel.build(map, self);
    }

    public AssociateRouteTableWithGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateRouteTableWithGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssociateRouteTableWithGatewayResponse setBody(AssociateRouteTableWithGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateRouteTableWithGatewayResponseBody getBody() {
        return this.body;
    }

}
