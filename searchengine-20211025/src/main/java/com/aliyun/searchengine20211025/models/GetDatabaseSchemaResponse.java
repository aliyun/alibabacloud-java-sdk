// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDatabaseSchemaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatabaseSchemaResponseBody body;

    public static GetDatabaseSchemaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseSchemaResponse self = new GetDatabaseSchemaResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseSchemaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseSchemaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabaseSchemaResponse setBody(GetDatabaseSchemaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatabaseSchemaResponseBody getBody() {
        return this.body;
    }

}
