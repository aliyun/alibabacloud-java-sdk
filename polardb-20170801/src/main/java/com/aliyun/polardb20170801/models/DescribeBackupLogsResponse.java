// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupLogsResponseBody body;

    public static DescribeBackupLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLogsResponse self = new DescribeBackupLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupLogsResponse setBody(DescribeBackupLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupLogsResponseBody getBody() {
        return this.body;
    }

}
