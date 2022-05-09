// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PredictionWallLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PredictionWallLineResponseBody body;

    public static PredictionWallLineResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictionWallLineResponse self = new PredictionWallLineResponse();
        return TeaModel.build(map, self);
    }

    public PredictionWallLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictionWallLineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictionWallLineResponse setBody(PredictionWallLineResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictionWallLineResponseBody getBody() {
        return this.body;
    }

}
