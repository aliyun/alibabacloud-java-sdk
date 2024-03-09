// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class UpdateHpoExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHpoExperimentResponseBody body;

    public static UpdateHpoExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHpoExperimentResponse self = new UpdateHpoExperimentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHpoExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHpoExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHpoExperimentResponse setBody(UpdateHpoExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHpoExperimentResponseBody getBody() {
        return this.body;
    }

}
