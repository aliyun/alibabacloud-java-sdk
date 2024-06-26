// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPushStatByAppResponseBody body;

    public static QueryPushStatByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByAppResponse self = new QueryPushStatByAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushStatByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPushStatByAppResponse setBody(QueryPushStatByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushStatByAppResponseBody getBody() {
        return this.body;
    }

}
