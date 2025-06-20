// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryBlockEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryBlockEventResponseBody body;

    public static QueryBlockEventResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockEventResponse self = new QueryBlockEventResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryBlockEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryBlockEventResponse setBody(QueryBlockEventResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryBlockEventResponseBody getBody() {
        return this.body;
    }

}
