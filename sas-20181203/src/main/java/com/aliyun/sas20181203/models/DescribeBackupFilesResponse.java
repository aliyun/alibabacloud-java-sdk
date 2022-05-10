// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupFilesResponseBody body;

    public static DescribeBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupFilesResponse self = new DescribeBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupFilesResponse setBody(DescribeBackupFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupFilesResponseBody getBody() {
        return this.body;
    }

}
