// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20240820.models;

import com.aliyun.tea.*;

public class PredictSseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PredictSseResponseBody body;

    public static PredictSseResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictSseResponse self = new PredictSseResponse();
        return TeaModel.build(map, self);
    }

    public PredictSseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictSseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictSseResponse setBody(PredictSseResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictSseResponseBody getBody() {
        return this.body;
    }

}
