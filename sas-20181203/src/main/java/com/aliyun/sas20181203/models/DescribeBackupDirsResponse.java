// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupDirsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBackupDirsResponseBody body;

    public static DescribeBackupDirsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupDirsResponse self = new DescribeBackupDirsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBackupDirsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBackupDirsResponse setBody(DescribeBackupDirsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBackupDirsResponseBody getBody() {
        return this.body;
    }

}
