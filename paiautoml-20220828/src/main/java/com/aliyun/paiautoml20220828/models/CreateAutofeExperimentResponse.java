// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateAutofeExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAutofeExperimentResponseBody body;

    public static CreateAutofeExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAutofeExperimentResponse self = new CreateAutofeExperimentResponse();
        return TeaModel.build(map, self);
    }

    public CreateAutofeExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAutofeExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAutofeExperimentResponse setBody(CreateAutofeExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAutofeExperimentResponseBody getBody() {
        return this.body;
    }

}
