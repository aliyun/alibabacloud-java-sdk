// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nlp_automl20190701.models;

import com.aliyun.tea.*;

public class PredictMTModelByDocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public PredictMTModelByDocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictMTModelByDocResponse setBody(PredictMTModelByDocResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictMTModelByDocResponseBody getBody() {
        return this.body;
    }

}
