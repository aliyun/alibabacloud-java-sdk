// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateABTestExperimentResponseBody body;

    public static UpdateABTestExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestExperimentResponse self = new UpdateABTestExperimentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateABTestExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateABTestExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateABTestExperimentResponse setBody(UpdateABTestExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateABTestExperimentResponseBody getBody() {
        return this.body;
    }

}
