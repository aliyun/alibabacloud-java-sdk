// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ManageSchedulerxCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ManageSchedulerxCalendarResponseBody body;

    public static ManageSchedulerxCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        ManageSchedulerxCalendarResponse self = new ManageSchedulerxCalendarResponse();
        return TeaModel.build(map, self);
    }

    public ManageSchedulerxCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ManageSchedulerxCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ManageSchedulerxCalendarResponse setBody(ManageSchedulerxCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public ManageSchedulerxCalendarResponseBody getBody() {
        return this.body;
    }

}
