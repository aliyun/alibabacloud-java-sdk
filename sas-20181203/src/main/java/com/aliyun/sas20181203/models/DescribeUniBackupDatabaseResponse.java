// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUniBackupDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeUniBackupDatabaseResponseBody body;

    public static DescribeUniBackupDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeUniBackupDatabaseResponse self = new DescribeUniBackupDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DescribeUniBackupDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeUniBackupDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeUniBackupDatabaseResponse setBody(DescribeUniBackupDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeUniBackupDatabaseResponseBody getBody() {
        return this.body;
    }

}
