// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryMemoryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMemoryListResponseBody body;

    public static QueryMemoryListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMemoryListResponse self = new QueryMemoryListResponse();
        return TeaModel.build(map, self);
    }

    public QueryMemoryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMemoryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMemoryListResponse setBody(QueryMemoryListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMemoryListResponseBody getBody() {
        return this.body;
    }

}
