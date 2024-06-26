// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPushRecordsResponseBody body;

    public static QueryPushRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushRecordsResponse self = new QueryPushRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPushRecordsResponse setBody(QueryPushRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushRecordsResponseBody getBody() {
        return this.body;
    }

}
