// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class PopObjectRetrievalResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PopObjectRetrievalResponseBody body;

    public static PopObjectRetrievalResponse build(java.util.Map<String, ?> map) throws Exception {
        PopObjectRetrievalResponse self = new PopObjectRetrievalResponse();
        return TeaModel.build(map, self);
    }

    public PopObjectRetrievalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PopObjectRetrievalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PopObjectRetrievalResponse setBody(PopObjectRetrievalResponseBody body) {
        this.body = body;
        return this;
    }
    public PopObjectRetrievalResponseBody getBody() {
        return this.body;
    }

}
