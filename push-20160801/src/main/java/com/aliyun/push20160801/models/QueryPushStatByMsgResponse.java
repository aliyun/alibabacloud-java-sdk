// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByMsgResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPushStatByMsgResponseBody body;

    public static QueryPushStatByMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByMsgResponse self = new QueryPushStatByMsgResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushStatByMsgResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPushStatByMsgResponse setBody(QueryPushStatByMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushStatByMsgResponseBody getBody() {
        return this.body;
    }

}
