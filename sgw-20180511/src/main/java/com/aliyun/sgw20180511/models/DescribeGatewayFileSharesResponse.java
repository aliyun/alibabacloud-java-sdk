// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayFileSharesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayFileSharesResponseBody body;

    public static DescribeGatewayFileSharesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayFileSharesResponse self = new DescribeGatewayFileSharesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayFileSharesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayFileSharesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayFileSharesResponse setBody(DescribeGatewayFileSharesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayFileSharesResponseBody getBody() {
        return this.body;
    }

}
