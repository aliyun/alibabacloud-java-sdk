// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTableResponseBody body;

    public static CreateTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTableResponse self = new CreateTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTableResponse setBody(CreateTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTableResponseBody getBody() {
        return this.body;
    }

}
