// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasRequestTaskResponseBody body;

    public static QueryCasRequestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestTaskResponse self = new QueryCasRequestTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasRequestTaskResponse setBody(QueryCasRequestTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasRequestTaskResponseBody getBody() {
        return this.body;
    }

}
