// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNatGatewayCapacityReservationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeNatGatewayCapacityReservationResponseBody body;

    public static DescribeNatGatewayCapacityReservationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNatGatewayCapacityReservationResponse self = new DescribeNatGatewayCapacityReservationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNatGatewayCapacityReservationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNatGatewayCapacityReservationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeNatGatewayCapacityReservationResponse setBody(DescribeNatGatewayCapacityReservationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNatGatewayCapacityReservationResponseBody getBody() {
        return this.body;
    }

}
