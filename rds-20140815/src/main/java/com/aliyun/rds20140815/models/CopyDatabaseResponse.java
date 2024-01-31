// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CopyDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CopyDatabaseResponseBody body;

    public static CopyDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyDatabaseResponse self = new CopyDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public CopyDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CopyDatabaseResponse setBody(CopyDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyDatabaseResponseBody getBody() {
        return this.body;
    }

}
