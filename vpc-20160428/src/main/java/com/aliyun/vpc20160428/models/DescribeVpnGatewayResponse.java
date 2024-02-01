// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnGatewayResponseBody body;

    public static DescribeVpnGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewayResponse self = new DescribeVpnGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnGatewayResponse setBody(DescribeVpnGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnGatewayResponseBody getBody() {
        return this.body;
    }

}
