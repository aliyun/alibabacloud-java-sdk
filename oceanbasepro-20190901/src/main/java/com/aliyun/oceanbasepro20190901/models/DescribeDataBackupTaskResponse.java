// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDataBackupTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataBackupTaskResponseBody body;

    public static DescribeDataBackupTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupTaskResponse self = new DescribeDataBackupTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataBackupTaskResponse setBody(DescribeDataBackupTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataBackupTaskResponseBody getBody() {
        return this.body;
    }

}
