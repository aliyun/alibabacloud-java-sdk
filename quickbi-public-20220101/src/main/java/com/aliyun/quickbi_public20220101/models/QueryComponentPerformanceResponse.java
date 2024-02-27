// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryComponentPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryComponentPerformanceResponseBody body;

    public static QueryComponentPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComponentPerformanceResponse self = new QueryComponentPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryComponentPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryComponentPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryComponentPerformanceResponse setBody(QueryComponentPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryComponentPerformanceResponseBody getBody() {
        return this.body;
    }

}
