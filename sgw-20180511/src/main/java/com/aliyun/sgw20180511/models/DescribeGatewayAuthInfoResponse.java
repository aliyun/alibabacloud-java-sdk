// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayAuthInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayAuthInfoResponseBody body;

    public static DescribeGatewayAuthInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAuthInfoResponse self = new DescribeGatewayAuthInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAuthInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayAuthInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayAuthInfoResponse setBody(DescribeGatewayAuthInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayAuthInfoResponseBody getBody() {
        return this.body;
    }

}
