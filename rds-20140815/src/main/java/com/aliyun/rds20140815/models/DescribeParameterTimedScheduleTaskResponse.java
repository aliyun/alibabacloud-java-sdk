// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeParameterTimedScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeParameterTimedScheduleTaskResponseBody body;

    public static DescribeParameterTimedScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeParameterTimedScheduleTaskResponse self = new DescribeParameterTimedScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribeParameterTimedScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeParameterTimedScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeParameterTimedScheduleTaskResponse setBody(DescribeParameterTimedScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeParameterTimedScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
