// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ListDatabaseDataVersionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListDatabaseDataVersionsResponseBody body;

    public static ListDatabaseDataVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseDataVersionsResponse self = new ListDatabaseDataVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabaseDataVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDatabaseDataVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListDatabaseDataVersionsResponse setBody(ListDatabaseDataVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDatabaseDataVersionsResponseBody getBody() {
        return this.body;
    }

}
