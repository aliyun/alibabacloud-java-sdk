// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PredictionWallLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public PredictionWallLineResponse setBody(PredictionWallLineResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictionWallLineResponseBody getBody() {
        return this.body;
    }

}
