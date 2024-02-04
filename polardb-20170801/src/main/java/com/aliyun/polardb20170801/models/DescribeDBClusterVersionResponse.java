// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterVersionResponseBody body;

    public static DescribeDBClusterVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterVersionResponse self = new DescribeDBClusterVersionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterVersionResponse setBody(DescribeDBClusterVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterVersionResponseBody getBody() {
        return this.body;
    }

}
