// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResponseBody body;

    public static QueryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResponse self = new QueryResponse();
        return TeaModel.build(map, self);
    }

    public QueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResponse setBody(QueryResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResponseBody getBody() {
        return this.body;
    }

}
