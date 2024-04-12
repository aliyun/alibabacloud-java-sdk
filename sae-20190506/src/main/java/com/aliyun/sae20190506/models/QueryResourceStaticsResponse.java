// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryResourceStaticsResponseBody body;

    public static QueryResourceStaticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceStaticsResponse self = new QueryResourceStaticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceStaticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResourceStaticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryResourceStaticsResponse setBody(QueryResourceStaticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResourceStaticsResponseBody getBody() {
        return this.body;
    }

}
