// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class PredImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PredImageResponseBody body;

    public static PredImageResponse build(java.util.Map<String, ?> map) throws Exception {
        PredImageResponse self = new PredImageResponse();
        return TeaModel.build(map, self);
    }

    public PredImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PredImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PredImageResponse setBody(PredImageResponseBody body) {
        this.body = body;
        return this;
    }
    public PredImageResponseBody getBody() {
        return this.body;
    }

}
