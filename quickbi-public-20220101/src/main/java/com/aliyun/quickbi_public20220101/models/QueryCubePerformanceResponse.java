// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryCubePerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryCubePerformanceResponseBody body;

    public static QueryCubePerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCubePerformanceResponse self = new QueryCubePerformanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryCubePerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryCubePerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryCubePerformanceResponse setBody(QueryCubePerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryCubePerformanceResponseBody getBody() {
        return this.body;
    }

}
