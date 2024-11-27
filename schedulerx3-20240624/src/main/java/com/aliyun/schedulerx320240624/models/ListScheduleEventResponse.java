// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListScheduleEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduleEventResponseBody body;

    public static ListScheduleEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleEventResponse self = new ListScheduleEventResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduleEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduleEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduleEventResponse setBody(ListScheduleEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduleEventResponseBody getBody() {
        return this.body;
    }

}
