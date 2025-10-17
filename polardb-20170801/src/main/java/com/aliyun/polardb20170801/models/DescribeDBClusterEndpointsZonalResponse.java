// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterEndpointsZonalResponseBody body;

    public static DescribeDBClusterEndpointsZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterEndpointsZonalResponse self = new DescribeDBClusterEndpointsZonalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterEndpointsZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterEndpointsZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterEndpointsZonalResponse setBody(DescribeDBClusterEndpointsZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterEndpointsZonalResponseBody getBody() {
        return this.body;
    }

}
