// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupEncryptedStringResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeBackupEncryptedStringResponseBody body;

    public static DescribeBackupEncryptedStringResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupEncryptedStringResponse self = new DescribeBackupEncryptedStringResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupEncryptedStringResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupEncryptedStringResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeBackupEncryptedStringResponse setBody(DescribeBackupEncryptedStringResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupEncryptedStringResponseBody getBody() {
        return this.body;
    }

}
