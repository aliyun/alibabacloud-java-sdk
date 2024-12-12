// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20240820.models;

import com.aliyun.tea.*;

public class PredictResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PredictResponseBody body;

    public static PredictResponse build(java.util.Map<String, ?> map) throws Exception {
        PredictResponse self = new PredictResponse();
        return TeaModel.build(map, self);
    }

    public PredictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredictResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredictResponse setBody(PredictResponseBody body) {
        this.body = body;
        return this;
    }
    public PredictResponseBody getBody() {
        return this.body;
    }

}
