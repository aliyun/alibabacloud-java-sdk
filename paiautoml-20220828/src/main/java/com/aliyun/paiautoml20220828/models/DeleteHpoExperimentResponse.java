// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class DeleteHpoExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHpoExperimentResponseBody body;

    public static DeleteHpoExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHpoExperimentResponse self = new DeleteHpoExperimentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHpoExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHpoExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHpoExperimentResponse setBody(DeleteHpoExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHpoExperimentResponseBody getBody() {
        return this.body;
    }

}
