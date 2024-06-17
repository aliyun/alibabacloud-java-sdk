// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListSchemasResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSchemasResponseBody body;

    public static ListSchemasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSchemasResponse self = new ListSchemasResponse();
        return TeaModel.build(map, self);
    }

    public ListSchemasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSchemasResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSchemasResponse setBody(ListSchemasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSchemasResponseBody getBody() {
        return this.body;
    }

}
