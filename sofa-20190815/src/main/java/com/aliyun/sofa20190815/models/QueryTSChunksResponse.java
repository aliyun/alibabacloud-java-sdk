// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSChunksResponseBody body;

    public static QueryTSChunksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunksResponse self = new QueryTSChunksResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSChunksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSChunksResponse setBody(QueryTSChunksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSChunksResponseBody getBody() {
        return this.body;
    }

}
