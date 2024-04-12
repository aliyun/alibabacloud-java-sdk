// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DeleteDatabaseAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatabaseAccountResponseBody body;

    public static DeleteDatabaseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseAccountResponse self = new DeleteDatabaseAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatabaseAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatabaseAccountResponse setBody(DeleteDatabaseAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatabaseAccountResponseBody getBody() {
        return this.body;
    }

}
