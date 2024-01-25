// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreRegionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAiStoreRegionsResponseBody body;

    public static QueryAiStoreRegionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreRegionsResponse self = new QueryAiStoreRegionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreRegionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiStoreRegionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAiStoreRegionsResponse setBody(QueryAiStoreRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiStoreRegionsResponseBody getBody() {
        return this.body;
    }

}
