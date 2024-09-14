// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateScheduledPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateScheduledPlanResponseBody body;

    public static CreateScheduledPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateScheduledPlanResponse self = new CreateScheduledPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateScheduledPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateScheduledPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateScheduledPlanResponse setBody(CreateScheduledPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateScheduledPlanResponseBody getBody() {
        return this.body;
    }

}
