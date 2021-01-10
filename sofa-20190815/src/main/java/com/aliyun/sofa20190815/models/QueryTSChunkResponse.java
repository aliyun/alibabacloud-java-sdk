// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSChunkResponseBody body;

    public static QueryTSChunkResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunkResponse self = new QueryTSChunkResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSChunkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSChunkResponse setBody(QueryTSChunkResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSChunkResponseBody getBody() {
        return this.body;
    }

}
