// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class ProduceAikcertResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ProduceAikcertResponseBody body;

    public static ProduceAikcertResponse build(java.util.Map<String, ?> map) throws Exception {
        ProduceAikcertResponse self = new ProduceAikcertResponse();
        return TeaModel.build(map, self);
    }

    public ProduceAikcertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProduceAikcertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProduceAikcertResponse setBody(ProduceAikcertResponseBody body) {
        this.body = body;
        return this;
    }
    public ProduceAikcertResponseBody getBody() {
        return this.body;
    }

}
