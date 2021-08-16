// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryPreCheckDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryPreCheckDatabaseResponseBody body;

    public static QueryPreCheckDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPreCheckDatabaseResponse self = new QueryPreCheckDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryPreCheckDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPreCheckDatabaseResponse setBody(QueryPreCheckDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPreCheckDatabaseResponseBody getBody() {
        return this.body;
    }

}
