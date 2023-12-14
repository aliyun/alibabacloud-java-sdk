// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLoggingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayLoggingResponseBody body;

    public static DescribeGatewayLoggingResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLoggingResponse self = new DescribeGatewayLoggingResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLoggingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayLoggingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayLoggingResponse setBody(DescribeGatewayLoggingResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayLoggingResponseBody getBody() {
        return this.body;
    }

}
