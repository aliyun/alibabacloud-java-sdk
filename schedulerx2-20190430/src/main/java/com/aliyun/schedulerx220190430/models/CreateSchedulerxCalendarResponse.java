// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class CreateSchedulerxCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSchedulerxCalendarResponseBody body;

    public static CreateSchedulerxCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerxCalendarResponse self = new CreateSchedulerxCalendarResponse();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerxCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSchedulerxCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSchedulerxCalendarResponse setBody(CreateSchedulerxCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSchedulerxCalendarResponseBody getBody() {
        return this.body;
    }

}
