// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterProxyResponseBody body;

    public static DescribeDBClusterProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterProxyResponse self = new DescribeDBClusterProxyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterProxyResponse setBody(DescribeDBClusterProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterProxyResponseBody getBody() {
        return this.body;
    }

}
