// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationPrecheckResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCloudMigrationPrecheckResultResponseBody body;

    public static DescribeCloudMigrationPrecheckResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudMigrationPrecheckResultResponse self = new DescribeCloudMigrationPrecheckResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudMigrationPrecheckResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCloudMigrationPrecheckResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCloudMigrationPrecheckResultResponse setBody(DescribeCloudMigrationPrecheckResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudMigrationPrecheckResultResponseBody getBody() {
        return this.body;
    }

}
