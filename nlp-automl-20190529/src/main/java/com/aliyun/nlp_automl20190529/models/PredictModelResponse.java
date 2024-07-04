// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190529.models;

import com.aliyun.tea.*;

public class PredictModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PredictModelResponseBody body;

    public static PredictModelResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictModelResponse self = new PredictModelResponse();
        return TeaModel.build(map, self);
    }

    public PredictModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictModelResponse setBody(PredictModelResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictModelResponseBody getBody() {
        return this.body;
    }

}
