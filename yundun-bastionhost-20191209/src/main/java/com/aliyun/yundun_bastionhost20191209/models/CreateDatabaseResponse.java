// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatabaseResponseBody body;

    public static CreateDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseResponse self = new CreateDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatabaseResponse setBody(CreateDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatabaseResponseBody getBody() {
        return this.body;
    }

}
