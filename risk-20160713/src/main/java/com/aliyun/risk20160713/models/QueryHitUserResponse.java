// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryHitUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHitUserResponseBody body;

    public static QueryHitUserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHitUserResponse self = new QueryHitUserResponse();
        return TeaModel.build(map, self);
    }

    public QueryHitUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHitUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryHitUserResponse setBody(QueryHitUserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHitUserResponseBody getBody() {
        return this.body;
    }

}
