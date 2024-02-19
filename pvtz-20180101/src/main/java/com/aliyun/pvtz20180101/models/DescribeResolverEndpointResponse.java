// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeResolverEndpointResponseBody body;

    public static DescribeResolverEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverEndpointResponse self = new DescribeResolverEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResolverEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResolverEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResolverEndpointResponse setBody(DescribeResolverEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResolverEndpointResponseBody getBody() {
        return this.body;
    }

}
