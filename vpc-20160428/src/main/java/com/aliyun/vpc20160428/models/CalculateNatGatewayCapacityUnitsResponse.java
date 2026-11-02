// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CalculateNatGatewayCapacityUnitsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CalculateNatGatewayCapacityUnitsResponseBody body;

    public static CalculateNatGatewayCapacityUnitsResponse build(java.util.Map<String, ?> map) throws Exception {
        CalculateNatGatewayCapacityUnitsResponse self = new CalculateNatGatewayCapacityUnitsResponse();
        return TeaModel.build(map, self);
    }

    public CalculateNatGatewayCapacityUnitsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CalculateNatGatewayCapacityUnitsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CalculateNatGatewayCapacityUnitsResponse setBody(CalculateNatGatewayCapacityUnitsResponseBody body) {
        this.body = body;
        return this;
    }
    public CalculateNatGatewayCapacityUnitsResponseBody getBody() {
        return this.body;
    }

}
