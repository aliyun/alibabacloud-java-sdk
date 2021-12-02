// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class AssociateRouteTableWithGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AssociateRouteTableWithGatewayResponse setBody(AssociateRouteTableWithGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateRouteTableWithGatewayResponseBody getBody() {
        return this.body;
    }

}
