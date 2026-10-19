// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ScheduleWorkItemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScheduleWorkItemResponseBody body;

    public static ScheduleWorkItemResponse build(java.util.Map<String, ?> map) throws Exception {
        ScheduleWorkItemResponse self = new ScheduleWorkItemResponse();
        return TeaModel.build(map, self);
    }

    public ScheduleWorkItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScheduleWorkItemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScheduleWorkItemResponse setBody(ScheduleWorkItemResponseBody body) {
        this.body = body;
        return this;
    }
    public ScheduleWorkItemResponseBody getBody() {
        return this.body;
    }

}
