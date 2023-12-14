// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayActionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayActionsResponseBody body;

    public static DescribeGatewayActionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayActionsResponse self = new DescribeGatewayActionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayActionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayActionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayActionsResponse setBody(DescribeGatewayActionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayActionsResponseBody getBody() {
        return this.body;
    }

}
