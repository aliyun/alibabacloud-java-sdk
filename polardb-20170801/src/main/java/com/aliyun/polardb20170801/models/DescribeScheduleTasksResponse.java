// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeScheduleTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScheduleTasksResponseBody body;

    public static DescribeScheduleTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScheduleTasksResponse self = new DescribeScheduleTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScheduleTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScheduleTasksResponse setBody(DescribeScheduleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduleTasksResponseBody getBody() {
        return this.body;
    }

}
