// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class DeleteExperimentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteExperimentVersionResponseBody body;

    public static DeleteExperimentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExperimentVersionResponse self = new DeleteExperimentVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExperimentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExperimentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteExperimentVersionResponse setBody(DeleteExperimentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExperimentVersionResponseBody getBody() {
        return this.body;
    }

}
