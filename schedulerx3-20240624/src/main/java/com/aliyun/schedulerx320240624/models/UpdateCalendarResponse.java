// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class UpdateCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCalendarResponseBody body;

    public static UpdateCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCalendarResponse self = new UpdateCalendarResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCalendarResponse setBody(UpdateCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCalendarResponseBody getBody() {
        return this.body;
    }

}
