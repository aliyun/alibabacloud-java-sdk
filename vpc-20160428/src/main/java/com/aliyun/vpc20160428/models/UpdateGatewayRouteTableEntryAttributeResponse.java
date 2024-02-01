// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateGatewayRouteTableEntryAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGatewayRouteTableEntryAttributeResponseBody body;

    public static UpdateGatewayRouteTableEntryAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGatewayRouteTableEntryAttributeResponse self = new UpdateGatewayRouteTableEntryAttributeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGatewayRouteTableEntryAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGatewayRouteTableEntryAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGatewayRouteTableEntryAttributeResponse setBody(UpdateGatewayRouteTableEntryAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGatewayRouteTableEntryAttributeResponseBody getBody() {
        return this.body;
    }

}
