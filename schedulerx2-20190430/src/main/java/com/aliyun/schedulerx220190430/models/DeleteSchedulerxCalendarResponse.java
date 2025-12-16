// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class DeleteSchedulerxCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSchedulerxCalendarResponseBody body;

    public static DeleteSchedulerxCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchedulerxCalendarResponse self = new DeleteSchedulerxCalendarResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSchedulerxCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSchedulerxCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSchedulerxCalendarResponse setBody(DeleteSchedulerxCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSchedulerxCalendarResponseBody getBody() {
        return this.body;
    }

}
