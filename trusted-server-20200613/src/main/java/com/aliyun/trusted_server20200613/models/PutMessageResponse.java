// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trusted_server20200613.models;

import com.aliyun.tea.*;

public class PutMessageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PutMessageResponseBody body;

    public static PutMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        PutMessageResponse self = new PutMessageResponse();
        return TeaModel.build(map, self);
    }

    public PutMessageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutMessageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutMessageResponse setBody(PutMessageResponseBody body) {
        this.body = body;
        return this;
    }
    public PutMessageResponseBody getBody() {
        return this.body;
    }

}
