// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelByDocResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PredictMTModelByDocResponseBody body;

    public static PredictMTModelByDocResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictMTModelByDocResponse self = new PredictMTModelByDocResponse();
        return TeaModel.build(map, self);
    }

    public PredictMTModelByDocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictMTModelByDocResponse setBody(PredictMTModelByDocResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictMTModelByDocResponseBody getBody() {
        return this.body;
    }

}
