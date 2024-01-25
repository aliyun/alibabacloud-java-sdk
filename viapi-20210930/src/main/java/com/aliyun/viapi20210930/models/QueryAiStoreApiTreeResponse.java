// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreApiTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAiStoreApiTreeResponseBody body;

    public static QueryAiStoreApiTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAiStoreApiTreeResponse self = new QueryAiStoreApiTreeResponse();
        return TeaModel.build(map, self);
    }

    public QueryAiStoreApiTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAiStoreApiTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAiStoreApiTreeResponse setBody(QueryAiStoreApiTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiStoreApiTreeResponseBody getBody() {
        return this.body;
    }

}
