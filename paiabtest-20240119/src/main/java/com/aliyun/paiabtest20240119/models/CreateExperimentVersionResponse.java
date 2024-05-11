// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class CreateExperimentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateExperimentVersionResponseBody body;

    public static CreateExperimentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateExperimentVersionResponse self = new CreateExperimentVersionResponse();
        return TeaModel.build(map, self);
    }

    public CreateExperimentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateExperimentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateExperimentVersionResponse setBody(CreateExperimentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateExperimentVersionResponseBody getBody() {
        return this.body;
    }

}
