// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryPushStatByMsgResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPushStatByMsgResponseBody body;

    public static QueryPushStatByMsgResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPushStatByMsgResponse self = new QueryPushStatByMsgResponse();
        return TeaModel.build(map, self);
    }

    public QueryPushStatByMsgResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPushStatByMsgResponse setBody(QueryPushStatByMsgResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPushStatByMsgResponseBody getBody() {
        return this.body;
    }

}
