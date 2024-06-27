// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePocResponseBody body;

    public static CreatePocResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePocResponse self = new CreatePocResponse();
        return TeaModel.build(map, self);
    }

    public CreatePocResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePocResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePocResponse setBody(CreatePocResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePocResponseBody getBody() {
        return this.body;
    }

}
