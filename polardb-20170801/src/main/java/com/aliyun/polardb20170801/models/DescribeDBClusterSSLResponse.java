// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterSSLResponseBody body;

    public static DescribeDBClusterSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterSSLResponse self = new DescribeDBClusterSSLResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterSSLResponse setBody(DescribeDBClusterSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterSSLResponseBody getBody() {
        return this.body;
    }

}
