// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class OnlineExperimentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnlineExperimentResponseBody body;

    public static OnlineExperimentResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineExperimentResponse self = new OnlineExperimentResponse();
        return TeaModel.build(map, self);
    }

    public OnlineExperimentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineExperimentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnlineExperimentResponse setBody(OnlineExperimentResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineExperimentResponseBody getBody() {
        return this.body;
    }

}
