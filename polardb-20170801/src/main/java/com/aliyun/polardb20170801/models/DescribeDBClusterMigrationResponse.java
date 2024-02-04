// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMigrationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeDBClusterMigrationResponseBody body;

    public static DescribeDBClusterMigrationResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterMigrationResponse self = new DescribeDBClusterMigrationResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterMigrationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDBClusterMigrationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDBClusterMigrationResponse setBody(DescribeDBClusterMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterMigrationResponseBody getBody() {
        return this.body;
    }

}
