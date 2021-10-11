// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class QueryAiStoreRegionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryAiStoreRegionsResponse setBody(QueryAiStoreRegionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAiStoreRegionsResponseBody getBody() {
        return this.body;
    }

}
