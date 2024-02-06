// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupSetDownloadLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupSetDownloadLinkResponseBody body;

    public static DescribeBackupSetDownloadLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupSetDownloadLinkResponse self = new DescribeBackupSetDownloadLinkResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupSetDownloadLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupSetDownloadLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupSetDownloadLinkResponse setBody(DescribeBackupSetDownloadLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupSetDownloadLinkResponseBody getBody() {
        return this.body;
    }

}
