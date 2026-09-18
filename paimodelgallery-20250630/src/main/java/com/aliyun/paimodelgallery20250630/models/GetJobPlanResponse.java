// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paimodelgallery20250630.models;

import com.aliyun.tea.*;

public class GetJobPlanResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetJobPlanResponseBody body;

    public static GetJobPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        GetJobPlanResponse self = new GetJobPlanResponse();
        return TeaModel.build(map, self);
    }

    public GetJobPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetJobPlanResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetJobPlanResponse setBody(GetJobPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public GetJobPlanResponseBody getBody() {
        return this.body;
    }

}
