// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20191211.models;

import com.aliyun.tea.*;

public class QuerySessionByClientIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySessionByClientIdResponseBody body;

    public static QuerySessionByClientIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByClientIdResponse self = new QuerySessionByClientIdResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionByClientIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionByClientIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySessionByClientIdResponse setBody(QuerySessionByClientIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionByClientIdResponseBody getBody() {
        return this.body;
    }

}
