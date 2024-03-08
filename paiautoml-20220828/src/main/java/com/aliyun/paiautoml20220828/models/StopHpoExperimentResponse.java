// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class StopHpoExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopHpoExperimentResponseBody body;

    public static StopHpoExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        StopHpoExperimentResponse self = new StopHpoExperimentResponse();
        return TeaModel.build(map, self);
    }

    public StopHpoExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopHpoExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopHpoExperimentResponse setBody(StopHpoExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public StopHpoExperimentResponseBody getBody() {
        return this.body;
    }

}
