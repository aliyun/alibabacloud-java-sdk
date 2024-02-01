// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeVpnGatewaysResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeVpnGatewaysResponseBody body;

    public static DescribeVpnGatewaysResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpnGatewaysResponse self = new DescribeVpnGatewaysResponse();
        return TeaModel.build(map, self);
    }

    public DescribeVpnGatewaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeVpnGatewaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeVpnGatewaysResponse setBody(DescribeVpnGatewaysResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeVpnGatewaysResponseBody getBody() {
        return this.body;
    }

}
