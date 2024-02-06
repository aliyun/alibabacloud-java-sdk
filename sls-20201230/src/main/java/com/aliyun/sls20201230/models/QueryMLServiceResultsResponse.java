// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class QueryMLServiceResultsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMLServiceResultsResponseBody body;

    public static QueryMLServiceResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMLServiceResultsResponse self = new QueryMLServiceResultsResponse();
        return TeaModel.build(map, self);
    }

    public QueryMLServiceResultsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMLServiceResultsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMLServiceResultsResponse setBody(QueryMLServiceResultsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMLServiceResultsResponseBody getBody() {
        return this.body;
    }

}
