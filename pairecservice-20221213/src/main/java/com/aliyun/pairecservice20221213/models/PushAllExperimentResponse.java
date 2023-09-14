// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class PushAllExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PushAllExperimentResponseBody body;

    public static PushAllExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAllExperimentResponse self = new PushAllExperimentResponse();
        return TeaModel.build(map, self);
    }

    public PushAllExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushAllExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushAllExperimentResponse setBody(PushAllExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public PushAllExperimentResponseBody getBody() {
        return this.body;
    }

}
