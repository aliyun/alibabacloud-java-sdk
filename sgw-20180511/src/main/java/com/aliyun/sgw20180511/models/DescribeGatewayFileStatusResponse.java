// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayFileStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayFileStatusResponseBody body;

    public static DescribeGatewayFileStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayFileStatusResponse self = new DescribeGatewayFileStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayFileStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayFileStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayFileStatusResponse setBody(DescribeGatewayFileStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayFileStatusResponseBody getBody() {
        return this.body;
    }

}
