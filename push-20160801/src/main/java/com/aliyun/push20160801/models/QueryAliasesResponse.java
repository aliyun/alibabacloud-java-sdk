// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class QueryAliasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryAliasesResponse setBody(QueryAliasesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryAliasesResponseBody getBody() {
        return this.body;
    }

}
