// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListCalendarNamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCalendarNamesResponseBody body;

    public static ListCalendarNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCalendarNamesResponse self = new ListCalendarNamesResponse();
        return TeaModel.build(map, self);
    }

    public ListCalendarNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCalendarNamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCalendarNamesResponse setBody(ListCalendarNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCalendarNamesResponseBody getBody() {
        return this.body;
    }

}
