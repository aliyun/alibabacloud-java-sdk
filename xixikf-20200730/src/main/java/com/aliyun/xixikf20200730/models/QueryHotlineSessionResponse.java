// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xixikf20200730.models;

import com.aliyun.tea.*;

public class QueryHotlineSessionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotlineSessionResponseBody body;

    public static QueryHotlineSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineSessionResponse self = new QueryHotlineSessionResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotlineSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotlineSessionResponse setBody(QueryHotlineSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotlineSessionResponseBody getBody() {
        return this.body;
    }

}
