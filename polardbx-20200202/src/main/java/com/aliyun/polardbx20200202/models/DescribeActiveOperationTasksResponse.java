// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeActiveOperationTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeActiveOperationTasksResponseBody body;

    public static DescribeActiveOperationTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveOperationTasksResponse self = new DescribeActiveOperationTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeActiveOperationTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeActiveOperationTasksResponse setBody(DescribeActiveOperationTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeActiveOperationTasksResponseBody getBody() {
        return this.body;
    }

}
