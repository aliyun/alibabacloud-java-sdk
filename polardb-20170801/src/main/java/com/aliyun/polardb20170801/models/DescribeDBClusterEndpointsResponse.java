// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBClusterEndpointsResponse setBody(DescribeDBClusterEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterEndpointsResponseBody getBody() {
        return this.body;
    }

}
