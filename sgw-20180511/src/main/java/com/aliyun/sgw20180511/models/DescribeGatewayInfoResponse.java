// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayInfoResponseBody body;

    public static DescribeGatewayInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayInfoResponse self = new DescribeGatewayInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayInfoResponse setBody(DescribeGatewayInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayInfoResponseBody getBody() {
        return this.body;
    }

}
