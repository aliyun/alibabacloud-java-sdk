// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGatewayListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGatewayListResponseBody body;

    public static DescribeGatewayListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayListResponse self = new DescribeGatewayListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayListResponse setBody(DescribeGatewayListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayListResponseBody getBody() {
        return this.body;
    }

}
