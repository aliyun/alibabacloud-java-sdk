// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersZonalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClustersZonalResponseBody body;

    public static DescribeDBClustersZonalResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersZonalResponse self = new DescribeDBClustersZonalResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersZonalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClustersZonalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClustersZonalResponse setBody(DescribeDBClustersZonalResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClustersZonalResponseBody getBody() {
        return this.body;
    }

}
