// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppDatabaseTableSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppDatabaseTableSchemasResponseBody body;

    public static GetAppDatabaseTableSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppDatabaseTableSchemasResponse self = new GetAppDatabaseTableSchemasResponse();
        return TeaModel.build(map, self);
    }

    public GetAppDatabaseTableSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppDatabaseTableSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppDatabaseTableSchemasResponse setBody(GetAppDatabaseTableSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppDatabaseTableSchemasResponseBody getBody() {
        return this.body;
    }

}
