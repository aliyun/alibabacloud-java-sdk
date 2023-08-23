// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryAttackCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryAttackCountResponseBody body;

    public static QueryAttackCountResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAttackCountResponse self = new QueryAttackCountResponse();
        return TeaModel.build(map, self);
    }

    public QueryAttackCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAttackCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAttackCountResponse setBody(QueryAttackCountResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAttackCountResponseBody getBody() {
        return this.body;
    }

}
