// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUnionTaskListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUnionTaskListResponseBody body;

    public static QueryUnionTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUnionTaskListResponse self = new QueryUnionTaskListResponse();
        return TeaModel.build(map, self);
    }

    public QueryUnionTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUnionTaskListResponse setBody(QueryUnionTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUnionTaskListResponseBody getBody() {
        return this.body;
    }

}
