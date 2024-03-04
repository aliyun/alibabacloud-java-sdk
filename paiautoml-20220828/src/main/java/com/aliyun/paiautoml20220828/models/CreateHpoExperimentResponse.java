// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class CreateHpoExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHpoExperimentResponseBody body;

    public static CreateHpoExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHpoExperimentResponse self = new CreateHpoExperimentResponse();
        return TeaModel.build(map, self);
    }

    public CreateHpoExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHpoExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHpoExperimentResponse setBody(CreateHpoExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHpoExperimentResponseBody getBody() {
        return this.body;
    }

}
