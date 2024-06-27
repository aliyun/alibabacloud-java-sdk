// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class CreatePocEvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePocEvResponseBody body;

    public static CreatePocEvResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePocEvResponse self = new CreatePocEvResponse();
        return TeaModel.build(map, self);
    }

    public CreatePocEvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePocEvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePocEvResponse setBody(CreatePocEvResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePocEvResponseBody getBody() {
        return this.body;
    }

}
