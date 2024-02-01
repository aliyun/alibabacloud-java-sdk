// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayAvailableZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnGatewayAvailableZonesResponseBody body;

    public static DescribeVpnGatewayAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayAvailableZonesResponse self = new DescribeVpnGatewayAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayAvailableZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnGatewayAvailableZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnGatewayAvailableZonesResponse setBody(DescribeVpnGatewayAvailableZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnGatewayAvailableZonesResponseBody getBody() {
        return this.body;
    }

}
