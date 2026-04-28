// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGatewayAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGatewayAttributeResponseBody body;

    public static DescribeGatewayAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayAttributeResponse self = new DescribeGatewayAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayAttributeResponse setBody(DescribeGatewayAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayAttributeResponseBody getBody() {
        return this.body;
    }

}
