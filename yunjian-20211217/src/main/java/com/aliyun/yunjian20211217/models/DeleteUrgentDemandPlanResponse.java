// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class DeleteUrgentDemandPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUrgentDemandPlanResponseBody body;

    public static DeleteUrgentDemandPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUrgentDemandPlanResponse self = new DeleteUrgentDemandPlanResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUrgentDemandPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUrgentDemandPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUrgentDemandPlanResponse setBody(DeleteUrgentDemandPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUrgentDemandPlanResponseBody getBody() {
        return this.body;
    }

}
