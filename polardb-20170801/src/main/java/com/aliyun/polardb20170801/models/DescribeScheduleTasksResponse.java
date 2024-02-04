// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeScheduleTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeScheduleTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScheduleTasksResponse setBody(DescribeScheduleTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScheduleTasksResponseBody getBody() {
        return this.body;
    }

}
