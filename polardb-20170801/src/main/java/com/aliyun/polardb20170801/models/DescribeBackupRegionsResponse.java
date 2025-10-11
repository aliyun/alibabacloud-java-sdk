// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupRegionsResponseBody body;

    public static DescribeBackupRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupRegionsResponse self = new DescribeBackupRegionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupRegionsResponse setBody(DescribeBackupRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupRegionsResponseBody getBody() {
        return this.body;
    }

}
