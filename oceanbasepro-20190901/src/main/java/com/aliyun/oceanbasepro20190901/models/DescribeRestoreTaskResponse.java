// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestoreTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreTaskResponseBody body;

    public static DescribeRestoreTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTaskResponse self = new DescribeRestoreTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreTaskResponse setBody(DescribeRestoreTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreTaskResponseBody getBody() {
        return this.body;
    }

}
