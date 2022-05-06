// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCloudMigrationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCloudMigrationResultResponse setBody(DescribeCloudMigrationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCloudMigrationResultResponseBody getBody() {
        return this.body;
    }

}
