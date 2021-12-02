// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DissociateRouteTableFromGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DissociateRouteTableFromGatewayResponse setBody(DissociateRouteTableFromGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateRouteTableFromGatewayResponseBody getBody() {
        return this.body;
    }

}
