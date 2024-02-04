// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterAvailableResourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterAvailableResourcesResponseBody body;

    public static DescribeDBClusterAvailableResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterAvailableResourcesResponse self = new DescribeDBClusterAvailableResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterAvailableResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterAvailableResourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterAvailableResourcesResponse setBody(DescribeDBClusterAvailableResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterAvailableResourcesResponseBody getBody() {
        return this.body;
    }

}
