// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDWSTaskResponseBody body;

    public static QueryDWSTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSTaskResponse self = new QueryDWSTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryDWSTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDWSTaskResponse setBody(QueryDWSTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDWSTaskResponseBody getBody() {
        return this.body;
    }

}
