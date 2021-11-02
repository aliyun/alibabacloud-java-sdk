// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryAppTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAppTasksResponseBody body;

    public static QueryAppTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppTasksResponse self = new QueryAppTasksResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAppTasksResponse setBody(QueryAppTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAppTasksResponseBody getBody() {
        return this.body;
    }

}
