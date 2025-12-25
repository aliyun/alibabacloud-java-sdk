// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class GetCalendarResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCalendarResponseBody body;

    public static GetCalendarResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCalendarResponse self = new GetCalendarResponse();
        return TeaModel.build(map, self);
    }

    public GetCalendarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCalendarResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCalendarResponse setBody(GetCalendarResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCalendarResponseBody getBody() {
        return this.body;
    }

}
