// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreatePersonalTextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePersonalTextResponseBody body;

    public static CreatePersonalTextResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePersonalTextResponse self = new CreatePersonalTextResponse();
        return TeaModel.build(map, self);
    }

    public CreatePersonalTextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePersonalTextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePersonalTextResponse setBody(CreatePersonalTextResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePersonalTextResponseBody getBody() {
        return this.body;
    }

}
