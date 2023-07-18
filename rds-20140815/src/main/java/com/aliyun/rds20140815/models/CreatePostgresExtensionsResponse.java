// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreatePostgresExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePostgresExtensionsResponseBody body;

    public static CreatePostgresExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePostgresExtensionsResponse self = new CreatePostgresExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public CreatePostgresExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePostgresExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePostgresExtensionsResponse setBody(CreatePostgresExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePostgresExtensionsResponseBody getBody() {
        return this.body;
    }

}
