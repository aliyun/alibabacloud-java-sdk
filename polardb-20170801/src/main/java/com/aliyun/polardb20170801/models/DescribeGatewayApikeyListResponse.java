// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeGatewayApikeyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeGatewayApikeyListResponseBody body;

    public static DescribeGatewayApikeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatewayApikeyListResponse self = new DescribeGatewayApikeyListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGatewayApikeyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeGatewayApikeyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeGatewayApikeyListResponse setBody(DescribeGatewayApikeyListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeGatewayApikeyListResponseBody getBody() {
        return this.body;
    }

}
