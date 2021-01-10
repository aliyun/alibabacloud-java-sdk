// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunksExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryTSChunksExecutionResponseBody body;

    public static QueryTSChunksExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunksExecutionResponse self = new QueryTSChunksExecutionResponse();
        return TeaModel.build(map, self);
    }

    public QueryTSChunksExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryTSChunksExecutionResponse setBody(QueryTSChunksExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryTSChunksExecutionResponseBody getBody() {
        return this.body;
    }

}
