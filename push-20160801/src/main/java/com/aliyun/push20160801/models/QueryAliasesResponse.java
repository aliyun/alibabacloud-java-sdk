// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryAliasesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryAliasesResponseBody body;

    public static QueryAliasesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAliasesResponse self = new QueryAliasesResponse();
        return TeaModel.build(map, self);
    }

    public QueryAliasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryAliasesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryAliasesResponse setBody(QueryAliasesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAliasesResponseBody getBody() {
        return this.body;
    }

}
