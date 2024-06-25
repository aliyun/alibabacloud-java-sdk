// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListDatabasesResponseBody body;

    public static ListDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponse self = new ListDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabasesResponse setBody(ListDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabasesResponseBody getBody() {
        return this.body;
    }

}
