// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeLogBackupFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeLogBackupFilesResponseBody body;

    public static DescribeLogBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupFilesResponse self = new DescribeLogBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogBackupFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeLogBackupFilesResponse setBody(DescribeLogBackupFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogBackupFilesResponseBody getBody() {
        return this.body;
    }

}
