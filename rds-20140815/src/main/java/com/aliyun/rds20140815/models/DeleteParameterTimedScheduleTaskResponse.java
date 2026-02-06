// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteParameterTimedScheduleTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteParameterTimedScheduleTaskResponseBody body;

    public static DeleteParameterTimedScheduleTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteParameterTimedScheduleTaskResponse self = new DeleteParameterTimedScheduleTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteParameterTimedScheduleTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteParameterTimedScheduleTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteParameterTimedScheduleTaskResponse setBody(DeleteParameterTimedScheduleTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteParameterTimedScheduleTaskResponseBody getBody() {
        return this.body;
    }

}
