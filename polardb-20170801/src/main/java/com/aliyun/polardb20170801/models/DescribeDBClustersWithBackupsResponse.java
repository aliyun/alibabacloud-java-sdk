// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClustersWithBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClustersWithBackupsResponseBody body;

    public static DescribeDBClustersWithBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClustersWithBackupsResponse self = new DescribeDBClustersWithBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClustersWithBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClustersWithBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClustersWithBackupsResponse setBody(DescribeDBClustersWithBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClustersWithBackupsResponseBody getBody() {
        return this.body;
    }

}
