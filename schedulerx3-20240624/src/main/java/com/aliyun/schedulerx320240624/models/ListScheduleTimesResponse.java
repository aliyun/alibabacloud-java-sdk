// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.schedulerx320240624.models;

import com.aliyun.tea.*;

public class ListScheduleTimesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduleTimesResponseBody body;

    public static ListScheduleTimesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduleTimesResponse self = new ListScheduleTimesResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduleTimesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduleTimesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduleTimesResponse setBody(ListScheduleTimesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduleTimesResponseBody getBody() {
        return this.body;
    }

}
