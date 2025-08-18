// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeInstanceEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeInstanceEndpointsResponseBody body;

    public static DescribeInstanceEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceEndpointsResponse self = new DescribeInstanceEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeInstanceEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeInstanceEndpointsResponse setBody(DescribeInstanceEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeInstanceEndpointsResponseBody getBody() {
        return this.body;
    }

}
