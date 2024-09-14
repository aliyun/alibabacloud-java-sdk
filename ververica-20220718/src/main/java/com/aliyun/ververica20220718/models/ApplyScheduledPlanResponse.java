// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ApplyScheduledPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyScheduledPlanResponseBody body;

    public static ApplyScheduledPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyScheduledPlanResponse self = new ApplyScheduledPlanResponse();
        return TeaModel.build(map, self);
    }

    public ApplyScheduledPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyScheduledPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyScheduledPlanResponse setBody(ApplyScheduledPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyScheduledPlanResponseBody getBody() {
        return this.body;
    }

}
