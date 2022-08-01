// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDatabaseResponseBody body;

    public static DeleteDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatabaseResponse self = new DeleteDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatabaseResponse setBody(DeleteDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatabaseResponseBody getBody() {
        return this.body;
    }

}
