// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx220190430.models;

import com.aliyun.tea.*;

public class ReadSchedulerxCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReadSchedulerxCalendarResponseBody body;

    public static ReadSchedulerxCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        ReadSchedulerxCalendarResponse self = new ReadSchedulerxCalendarResponse();
        return TeaModel.build(map, self);
    }

    public ReadSchedulerxCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReadSchedulerxCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReadSchedulerxCalendarResponse setBody(ReadSchedulerxCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public ReadSchedulerxCalendarResponseBody getBody() {
        return this.body;
    }

}
