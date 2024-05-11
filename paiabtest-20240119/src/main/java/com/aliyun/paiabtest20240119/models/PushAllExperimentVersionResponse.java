// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiabtest20240119.models;

import com.aliyun.tea.*;

public class PushAllExperimentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushAllExperimentVersionResponseBody body;

    public static PushAllExperimentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAllExperimentVersionResponse self = new PushAllExperimentVersionResponse();
        return TeaModel.build(map, self);
    }

    public PushAllExperimentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushAllExperimentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushAllExperimentVersionResponse setBody(PushAllExperimentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public PushAllExperimentVersionResponseBody getBody() {
        return this.body;
    }

}
