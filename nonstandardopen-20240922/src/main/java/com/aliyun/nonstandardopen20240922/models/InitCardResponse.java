// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922.models;

import com.aliyun.tea.*;

public class InitCardResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InitCardResponseBody body;

    public static InitCardResponse build(java.util.Map<String, ?> map) throws Exception {
        InitCardResponse self = new InitCardResponse();
        return TeaModel.build(map, self);
    }

    public InitCardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitCardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitCardResponse setBody(InitCardResponseBody body) {
        this.body = body;
        return this;
    }
    public InitCardResponseBody getBody() {
        return this.body;
    }

}
