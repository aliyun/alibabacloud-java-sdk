// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushRecordsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPushRecordsResponseBody body;

    public static QueryPushRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushRecordsResponse self = new QueryPushRecordsResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushRecordsResponse setBody(QueryPushRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushRecordsResponseBody getBody() {
        return this.body;
    }

}
