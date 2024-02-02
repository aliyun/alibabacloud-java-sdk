// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20230313.models;

import com.aliyun.tea.*;

public class QueryLongTtsResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryLongTtsResultResponseBody body;

    public static QueryLongTtsResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLongTtsResultResponse self = new QueryLongTtsResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryLongTtsResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLongTtsResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryLongTtsResultResponse setBody(QueryLongTtsResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLongTtsResultResponseBody getBody() {
        return this.body;
    }

}
