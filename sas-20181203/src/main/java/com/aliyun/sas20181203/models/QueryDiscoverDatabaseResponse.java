// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class QueryDiscoverDatabaseResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryDiscoverDatabaseResponseBody body;

    public static QueryDiscoverDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDiscoverDatabaseResponse self = new QueryDiscoverDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public QueryDiscoverDatabaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDiscoverDatabaseResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryDiscoverDatabaseResponse setBody(QueryDiscoverDatabaseResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDiscoverDatabaseResponseBody getBody() {
        return this.body;
    }

}
