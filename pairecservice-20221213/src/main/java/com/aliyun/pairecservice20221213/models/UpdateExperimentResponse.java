// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class UpdateExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateExperimentResponseBody body;

    public static UpdateExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentResponse self = new UpdateExperimentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentResponse setBody(UpdateExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentResponseBody getBody() {
        return this.body;
    }

}
