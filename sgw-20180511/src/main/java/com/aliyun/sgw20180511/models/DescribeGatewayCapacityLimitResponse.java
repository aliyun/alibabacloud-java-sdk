// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeGatewayCapacityLimitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeGatewayCapacityLimitResponseBody body;

    public static DescribeGatewayCapacityLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayCapacityLimitResponse self = new DescribeGatewayCapacityLimitResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayCapacityLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayCapacityLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayCapacityLimitResponse setBody(DescribeGatewayCapacityLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayCapacityLimitResponseBody getBody() {
        return this.body;
    }

}
