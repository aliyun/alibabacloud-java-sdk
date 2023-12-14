// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayLogsResponseBody body;

    public static DescribeGatewayLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayLogsResponse self = new DescribeGatewayLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayLogsResponse setBody(DescribeGatewayLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayLogsResponseBody getBody() {
        return this.body;
    }

}
