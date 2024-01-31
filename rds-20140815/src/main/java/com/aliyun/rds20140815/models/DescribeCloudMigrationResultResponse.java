// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudMigrationResultResponseBody body;

    public static DescribeCloudMigrationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMigrationResultResponse self = new DescribeCloudMigrationResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMigrationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudMigrationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudMigrationResultResponse setBody(DescribeCloudMigrationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudMigrationResultResponseBody getBody() {
        return this.body;
    }

}
