// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterEndpointsResponseBody body;

    public static DescribeDBClusterEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsResponse self = new DescribeDBClusterEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterEndpointsResponse setBody(DescribeDBClusterEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterEndpointsResponseBody getBody() {
        return this.body;
    }

}
