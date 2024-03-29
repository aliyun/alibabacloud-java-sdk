// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpdatePostgresExtensionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdatePostgresExtensionsResponseBody body;

    public static UpdatePostgresExtensionsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostgresExtensionsResponse self = new UpdatePostgresExtensionsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePostgresExtensionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePostgresExtensionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdatePostgresExtensionsResponse setBody(UpdatePostgresExtensionsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePostgresExtensionsResponseBody getBody() {
        return this.body;
    }

}
