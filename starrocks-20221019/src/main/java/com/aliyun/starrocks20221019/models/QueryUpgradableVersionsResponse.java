// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryUpgradableVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryUpgradableVersionsResponseBody body;

    public static QueryUpgradableVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUpgradableVersionsResponse self = new QueryUpgradableVersionsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUpgradableVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUpgradableVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryUpgradableVersionsResponse setBody(QueryUpgradableVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUpgradableVersionsResponseBody getBody() {
        return this.body;
    }

}
