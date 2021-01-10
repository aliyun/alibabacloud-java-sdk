// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCASUserResponseBody body;

    public static QueryCASUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCASUserResponse self = new QueryCASUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryCASUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCASUserResponse setBody(QueryCASUserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCASUserResponseBody getBody() {
        return this.body;
    }

}
