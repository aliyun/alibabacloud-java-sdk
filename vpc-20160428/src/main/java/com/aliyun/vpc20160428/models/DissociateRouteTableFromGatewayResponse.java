// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateRouteTableFromGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DissociateRouteTableFromGatewayResponseBody body;

    public static DissociateRouteTableFromGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateRouteTableFromGatewayResponse self = new DissociateRouteTableFromGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DissociateRouteTableFromGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateRouteTableFromGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DissociateRouteTableFromGatewayResponse setBody(DissociateRouteTableFromGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateRouteTableFromGatewayResponseBody getBody() {
        return this.body;
    }

}
