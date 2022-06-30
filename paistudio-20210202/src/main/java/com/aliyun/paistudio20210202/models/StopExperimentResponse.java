// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class StopExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StopExperimentResponseBody body;

    public static StopExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        StopExperimentResponse self = new StopExperimentResponse();
        return TeaModel.build(map, self);
    }

    public StopExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopExperimentResponse setBody(StopExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public StopExperimentResponseBody getBody() {
        return this.body;
    }

}
