// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class QueryPenetrationTestDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryPenetrationTestDetailResponseBody body;

    public static QueryPenetrationTestDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPenetrationTestDetailResponse self = new QueryPenetrationTestDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryPenetrationTestDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryPenetrationTestDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryPenetrationTestDetailResponse setBody(QueryPenetrationTestDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryPenetrationTestDetailResponseBody getBody() {
        return this.body;
    }

}
