// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class DeleteCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCalendarResponseBody body;

    public static DeleteCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCalendarResponse self = new DeleteCalendarResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCalendarResponse setBody(DeleteCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCalendarResponseBody getBody() {
        return this.body;
    }

}
