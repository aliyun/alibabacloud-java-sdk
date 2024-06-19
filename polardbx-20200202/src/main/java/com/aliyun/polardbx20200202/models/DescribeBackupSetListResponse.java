// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeBackupSetListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupSetListResponseBody body;

    public static DescribeBackupSetListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetListResponse self = new DescribeBackupSetListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSetListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupSetListResponse setBody(DescribeBackupSetListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSetListResponseBody getBody() {
        return this.body;
    }

}
