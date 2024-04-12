// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class CreateDatabaseAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDatabaseAccountResponseBody body;

    public static CreateDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseAccountResponse self = new CreateDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDatabaseAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDatabaseAccountResponse setBody(CreateDatabaseAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDatabaseAccountResponseBody getBody() {
        return this.body;
    }

}
