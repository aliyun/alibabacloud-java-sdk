// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class StartExperimentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartExperimentResponseBody body;

    public static StartExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        StartExperimentResponse self = new StartExperimentResponse();
        return TeaModel.build(map, self);
    }

    public StartExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartExperimentResponse setBody(StartExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public StartExperimentResponseBody getBody() {
        return this.body;
    }

}
