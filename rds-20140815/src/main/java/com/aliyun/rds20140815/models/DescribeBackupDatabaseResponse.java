// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeBackupDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupDatabaseResponseBody body;

    public static DescribeBackupDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDatabaseResponse self = new DescribeBackupDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupDatabaseResponse setBody(DescribeBackupDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupDatabaseResponseBody getBody() {
        return this.body;
    }

}
