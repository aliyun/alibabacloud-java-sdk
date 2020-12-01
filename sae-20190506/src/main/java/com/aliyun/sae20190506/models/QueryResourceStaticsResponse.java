// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class QueryResourceStaticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryResourceStaticsResponseBody body;

    public static QueryResourceStaticsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryResourceStaticsResponse self = new QueryResourceStaticsResponse();
        return TeaModel.build(map, self);
    }

    public QueryResourceStaticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryResourceStaticsResponse setBody(QueryResourceStaticsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryResourceStaticsResponseBody getBody() {
        return this.body;
    }

}
