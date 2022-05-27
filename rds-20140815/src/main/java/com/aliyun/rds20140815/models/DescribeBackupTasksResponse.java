// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupTasksResponseBody body;

    public static DescribeBackupTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupTasksResponse self = new DescribeBackupTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupTasksResponse setBody(DescribeBackupTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupTasksResponseBody getBody() {
        return this.body;
    }

}
