// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPushStatByAppResponseBody body;

    public static QueryPushStatByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByAppResponse self = new QueryPushStatByAppResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushStatByAppResponse setBody(QueryPushStatByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushStatByAppResponseBody getBody() {
        return this.body;
    }

}
