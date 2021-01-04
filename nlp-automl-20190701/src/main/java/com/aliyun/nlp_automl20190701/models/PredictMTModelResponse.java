// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PredictMTModelResponseBody body;

    public static PredictMTModelResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictMTModelResponse self = new PredictMTModelResponse();
        return TeaModel.build(map, self);
    }

    public PredictMTModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictMTModelResponse setBody(PredictMTModelResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictMTModelResponseBody getBody() {
        return this.body;
    }

}
