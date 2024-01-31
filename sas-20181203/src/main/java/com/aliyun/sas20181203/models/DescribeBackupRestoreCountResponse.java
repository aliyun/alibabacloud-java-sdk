// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupRestoreCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupRestoreCountResponseBody body;

    public static DescribeBackupRestoreCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupRestoreCountResponse self = new DescribeBackupRestoreCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupRestoreCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupRestoreCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupRestoreCountResponse setBody(DescribeBackupRestoreCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupRestoreCountResponseBody getBody() {
        return this.body;
    }

}
