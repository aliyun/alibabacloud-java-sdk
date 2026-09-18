// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class UpdateJobPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateJobPlanResponseBody body;

    public static UpdateJobPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobPlanResponse self = new UpdateJobPlanResponse();
        return TeaModel.build(map, self);
    }

    public UpdateJobPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateJobPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateJobPlanResponse setBody(UpdateJobPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateJobPlanResponseBody getBody() {
        return this.body;
    }

}
