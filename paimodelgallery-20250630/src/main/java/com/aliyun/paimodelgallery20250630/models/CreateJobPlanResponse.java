// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class CreateJobPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateJobPlanResponseBody body;

    public static CreateJobPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateJobPlanResponse self = new CreateJobPlanResponse();
        return TeaModel.build(map, self);
    }

    public CreateJobPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateJobPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateJobPlanResponse setBody(CreateJobPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateJobPlanResponseBody getBody() {
        return this.body;
    }

}
