// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class QuerySessionByClientIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySessionByClientIdResponseBody body;

    public static QuerySessionByClientIdResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySessionByClientIdResponse self = new QuerySessionByClientIdResponse();
        return TeaModel.build(map, self);
    }

    public QuerySessionByClientIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySessionByClientIdResponse setBody(QuerySessionByClientIdResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySessionByClientIdResponseBody getBody() {
        return this.body;
    }

}
