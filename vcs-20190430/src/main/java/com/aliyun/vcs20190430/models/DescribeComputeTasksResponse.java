// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class DescribeComputeTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeComputeTasksResponseBody body;

    public static DescribeComputeTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeTasksResponse self = new DescribeComputeTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComputeTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComputeTasksResponse setBody(DescribeComputeTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComputeTasksResponseBody getBody() {
        return this.body;
    }

}
