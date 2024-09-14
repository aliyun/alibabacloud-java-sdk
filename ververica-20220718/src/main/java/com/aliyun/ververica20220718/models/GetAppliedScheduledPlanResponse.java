// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetAppliedScheduledPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppliedScheduledPlanResponseBody body;

    public static GetAppliedScheduledPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppliedScheduledPlanResponse self = new GetAppliedScheduledPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetAppliedScheduledPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppliedScheduledPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppliedScheduledPlanResponse setBody(GetAppliedScheduledPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppliedScheduledPlanResponseBody getBody() {
        return this.body;
    }

}
