// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperimentResponseBody body;

    public static CreateExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentResponse self = new CreateExperimentResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentResponse setBody(CreateExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentResponseBody getBody() {
        return this.body;
    }

}
