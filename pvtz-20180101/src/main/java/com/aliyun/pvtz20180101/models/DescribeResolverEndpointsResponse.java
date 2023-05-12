// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeResolverEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeResolverEndpointsResponseBody body;

    public static DescribeResolverEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResolverEndpointsResponse self = new DescribeResolverEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResolverEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeResolverEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeResolverEndpointsResponse setBody(DescribeResolverEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeResolverEndpointsResponseBody getBody() {
        return this.body;
    }

}
