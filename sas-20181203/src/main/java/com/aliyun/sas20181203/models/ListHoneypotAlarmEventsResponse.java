// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListHoneypotAlarmEventsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListHoneypotAlarmEventsResponseBody body;

    public static ListHoneypotAlarmEventsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHoneypotAlarmEventsResponse self = new ListHoneypotAlarmEventsResponse();
        return TeaModel.build(map, self);
    }

    public ListHoneypotAlarmEventsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHoneypotAlarmEventsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHoneypotAlarmEventsResponse setBody(ListHoneypotAlarmEventsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHoneypotAlarmEventsResponseBody getBody() {
        return this.body;
    }

}
