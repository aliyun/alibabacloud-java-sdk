// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class DescribeEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeEndpointResponseBody body;

    public static DescribeEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointResponse self = new DescribeEndpointResponse();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeEndpointResponse setBody(DescribeEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeEndpointResponseBody getBody() {
        return this.body;
    }

}
