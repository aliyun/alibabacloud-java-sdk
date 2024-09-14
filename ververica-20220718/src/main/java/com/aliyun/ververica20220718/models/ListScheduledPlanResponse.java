// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ListScheduledPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListScheduledPlanResponseBody body;

    public static ListScheduledPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ListScheduledPlanResponse self = new ListScheduledPlanResponse();
        return TeaModel.build(map, self);
    }

    public ListScheduledPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListScheduledPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListScheduledPlanResponse setBody(ListScheduledPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ListScheduledPlanResponseBody getBody() {
        return this.body;
    }

}
