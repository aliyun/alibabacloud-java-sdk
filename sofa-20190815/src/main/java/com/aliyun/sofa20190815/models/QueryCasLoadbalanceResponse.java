// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasLoadbalanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasLoadbalanceResponseBody body;

    public static QueryCasLoadbalanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasLoadbalanceResponse self = new QueryCasLoadbalanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasLoadbalanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasLoadbalanceResponse setBody(QueryCasLoadbalanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasLoadbalanceResponseBody getBody() {
        return this.body;
    }

}
