// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class CreateCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCalendarResponseBody body;

    public static CreateCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCalendarResponse self = new CreateCalendarResponse();
        return TeaModel.build(map, self);
    }

    public CreateCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCalendarResponse setBody(CreateCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCalendarResponseBody getBody() {
        return this.body;
    }

}
