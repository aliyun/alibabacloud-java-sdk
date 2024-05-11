// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperimentResponseBody body;

    public static DeleteExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentResponse self = new DeleteExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperimentResponse setBody(DeleteExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentResponseBody getBody() {
        return this.body;
    }

}
