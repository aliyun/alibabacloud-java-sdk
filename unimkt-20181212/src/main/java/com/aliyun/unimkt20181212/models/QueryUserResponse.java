// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserResponseBody body;

    public static QueryUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserResponse self = new QueryUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserResponse setBody(QueryUserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserResponseBody getBody() {
        return this.body;
    }

}
