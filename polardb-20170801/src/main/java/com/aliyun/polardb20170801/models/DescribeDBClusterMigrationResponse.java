// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBClusterMigrationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeDBClusterMigrationResponse setBody(DescribeDBClusterMigrationResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDBClusterMigrationResponseBody getBody() {
        return this.body;
    }

}
