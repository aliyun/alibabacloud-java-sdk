// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentContentResponseBody body;

    public static UpdateExperimentContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentContentResponse self = new UpdateExperimentContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentContentResponse setBody(UpdateExperimentContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentContentResponseBody getBody() {
        return this.body;
    }

}
