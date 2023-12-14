// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayAutoPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayAutoPlansResponseBody body;

    public static DescribeGatewayAutoPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAutoPlansResponse self = new DescribeGatewayAutoPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAutoPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayAutoPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayAutoPlansResponse setBody(DescribeGatewayAutoPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayAutoPlansResponseBody getBody() {
        return this.body;
    }

}
