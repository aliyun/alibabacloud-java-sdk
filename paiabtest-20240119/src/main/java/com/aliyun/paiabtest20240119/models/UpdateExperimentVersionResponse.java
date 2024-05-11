// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class UpdateExperimentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateExperimentVersionResponseBody body;

    public static UpdateExperimentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentVersionResponse self = new UpdateExperimentVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateExperimentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateExperimentVersionResponse setBody(UpdateExperimentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateExperimentVersionResponseBody getBody() {
        return this.body;
    }

}
