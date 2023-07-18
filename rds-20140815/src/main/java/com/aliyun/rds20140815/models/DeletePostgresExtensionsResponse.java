// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeletePostgresExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeletePostgresExtensionsResponseBody body;

    public static DeletePostgresExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePostgresExtensionsResponse self = new DeletePostgresExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePostgresExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePostgresExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePostgresExtensionsResponse setBody(DeletePostgresExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePostgresExtensionsResponseBody getBody() {
        return this.body;
    }

}
