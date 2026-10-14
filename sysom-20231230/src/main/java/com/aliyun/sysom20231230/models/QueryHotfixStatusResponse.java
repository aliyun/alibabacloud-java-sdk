// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class QueryHotfixStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryHotfixStatusResponseBody body;

    public static QueryHotfixStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotfixStatusResponse self = new QueryHotfixStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotfixStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotfixStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHotfixStatusResponse setBody(QueryHotfixStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotfixStatusResponseBody getBody() {
        return this.body;
    }

}
