// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterConnectivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterConnectivityResponseBody body;

    public static DescribeDBClusterConnectivityResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterConnectivityResponse self = new DescribeDBClusterConnectivityResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterConnectivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterConnectivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterConnectivityResponse setBody(DescribeDBClusterConnectivityResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterConnectivityResponseBody getBody() {
        return this.body;
    }

}
