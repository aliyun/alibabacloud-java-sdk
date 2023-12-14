// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayClassesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayClassesResponseBody body;

    public static DescribeGatewayClassesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayClassesResponse self = new DescribeGatewayClassesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayClassesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayClassesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayClassesResponse setBody(DescribeGatewayClassesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayClassesResponseBody getBody() {
        return this.body;
    }

}
