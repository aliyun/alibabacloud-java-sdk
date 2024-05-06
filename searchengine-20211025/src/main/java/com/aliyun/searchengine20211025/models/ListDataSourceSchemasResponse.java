// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDataSourceSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDataSourceSchemasResponseBody body;

    public static ListDataSourceSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceSchemasResponse self = new ListDataSourceSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListDataSourceSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDataSourceSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDataSourceSchemasResponse setBody(ListDataSourceSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDataSourceSchemasResponseBody getBody() {
        return this.body;
    }

}
