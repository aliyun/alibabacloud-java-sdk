// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeLogBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeLogBackupTaskResponseBody body;

    public static DescribeLogBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupTaskResponse self = new DescribeLogBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeLogBackupTaskResponse setBody(DescribeLogBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeLogBackupTaskResponseBody getBody() {
        return this.body;
    }

}
