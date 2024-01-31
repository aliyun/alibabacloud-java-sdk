// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescibeImportsFromDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescibeImportsFromDatabaseResponseBody body;

    public static DescibeImportsFromDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        DescibeImportsFromDatabaseResponse self = new DescibeImportsFromDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public DescibeImportsFromDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescibeImportsFromDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescibeImportsFromDatabaseResponse setBody(DescibeImportsFromDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public DescibeImportsFromDatabaseResponseBody getBody() {
        return this.body;
    }

}
