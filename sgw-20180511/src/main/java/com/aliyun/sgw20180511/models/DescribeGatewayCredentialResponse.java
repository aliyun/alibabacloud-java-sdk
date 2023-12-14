// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCredentialResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayCredentialResponseBody body;

    public static DescribeGatewayCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCredentialResponse self = new DescribeGatewayCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayCredentialResponse setBody(DescribeGatewayCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayCredentialResponseBody getBody() {
        return this.body;
    }

}
