// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryCasDatabaseQuotaResponseBody body;

    public static QueryCasDatabaseQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseQuotaResponse self = new QueryCasDatabaseQuotaResponse();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCasDatabaseQuotaResponse setBody(QueryCasDatabaseQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCasDatabaseQuotaResponseBody getBody() {
        return this.body;
    }

}
