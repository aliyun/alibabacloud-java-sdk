// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySyncResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuerySyncResultResponseBody body;

    public static QuerySyncResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncResultResponse self = new QuerySyncResultResponse();
        return TeaModel.build(map, self);
    }

    public QuerySyncResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySyncResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySyncResultResponse setBody(QuerySyncResultResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySyncResultResponseBody getBody() {
        return this.body;
    }

}
