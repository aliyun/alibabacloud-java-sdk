// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListAlarmEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAlarmEventResponseBody body;

    public static ListAlarmEventResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmEventResponse self = new ListAlarmEventResponse();
        return TeaModel.build(map, self);
    }

    public ListAlarmEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAlarmEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAlarmEventResponse setBody(ListAlarmEventResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAlarmEventResponseBody getBody() {
        return this.body;
    }

}
