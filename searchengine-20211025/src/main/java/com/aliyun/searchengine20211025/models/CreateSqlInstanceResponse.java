// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class CreateSqlInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSqlInstanceResponseBody body;

    public static CreateSqlInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlInstanceResponse self = new CreateSqlInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateSqlInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSqlInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSqlInstanceResponse setBody(CreateSqlInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSqlInstanceResponseBody getBody() {
        return this.body;
    }

}
