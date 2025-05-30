// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class SubmitUrgentDemandPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitUrgentDemandPlanResponseBody body;

    public static SubmitUrgentDemandPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitUrgentDemandPlanResponse self = new SubmitUrgentDemandPlanResponse();
        return TeaModel.build(map, self);
    }

    public SubmitUrgentDemandPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitUrgentDemandPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitUrgentDemandPlanResponse setBody(SubmitUrgentDemandPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitUrgentDemandPlanResponseBody getBody() {
        return this.body;
    }

}
