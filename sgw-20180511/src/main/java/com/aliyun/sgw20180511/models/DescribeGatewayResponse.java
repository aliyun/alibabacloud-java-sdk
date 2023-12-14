// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayResponseBody body;

    public static DescribeGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayResponse self = new DescribeGatewayResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayResponse setBody(DescribeGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayResponseBody getBody() {
        return this.body;
    }

}
