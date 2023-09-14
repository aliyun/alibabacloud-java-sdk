// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CloneExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CloneExperimentResponseBody body;

    public static CloneExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        CloneExperimentResponse self = new CloneExperimentResponse();
        return TeaModel.build(map, self);
    }

    public CloneExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloneExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CloneExperimentResponse setBody(CloneExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public CloneExperimentResponseBody getBody() {
        return this.body;
    }

}
