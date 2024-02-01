// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeEipGatewayInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEipGatewayInfoResponseBody body;

    public static DescribeEipGatewayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEipGatewayInfoResponse self = new DescribeEipGatewayInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEipGatewayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEipGatewayInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEipGatewayInfoResponse setBody(DescribeEipGatewayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEipGatewayInfoResponseBody getBody() {
        return this.body;
    }

}
