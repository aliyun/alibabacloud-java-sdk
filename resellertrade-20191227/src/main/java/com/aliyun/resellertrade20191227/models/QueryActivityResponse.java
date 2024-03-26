// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227.models;

import com.aliyun.tea.*;

public class QueryActivityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryActivityResponseBody body;

    public static QueryActivityResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActivityResponse self = new QueryActivityResponse();
        return TeaModel.build(map, self);
    }

    public QueryActivityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryActivityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryActivityResponse setBody(QueryActivityResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryActivityResponseBody getBody() {
        return this.body;
    }

}
