// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAgenticDBClustersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeAgenticDBClustersResponseBody body;

    public static DescribeAgenticDBClustersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAgenticDBClustersResponse self = new DescribeAgenticDBClustersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAgenticDBClustersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAgenticDBClustersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeAgenticDBClustersResponse setBody(DescribeAgenticDBClustersResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAgenticDBClustersResponseBody getBody() {
        return this.body;
    }

}
