// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeBackupLogDownloadLinksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupLogDownloadLinksResponseBody body;

    public static DescribeBackupLogDownloadLinksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupLogDownloadLinksResponse self = new DescribeBackupLogDownloadLinksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupLogDownloadLinksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupLogDownloadLinksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupLogDownloadLinksResponse setBody(DescribeBackupLogDownloadLinksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupLogDownloadLinksResponseBody getBody() {
        return this.body;
    }

}
