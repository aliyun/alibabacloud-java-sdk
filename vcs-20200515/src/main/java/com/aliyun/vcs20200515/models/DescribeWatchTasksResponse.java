// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DescribeWatchTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeWatchTasksResponseBody body;

    public static DescribeWatchTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeWatchTasksResponse self = new DescribeWatchTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeWatchTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeWatchTasksResponse setBody(DescribeWatchTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeWatchTasksResponseBody getBody() {
        return this.body;
    }

}
