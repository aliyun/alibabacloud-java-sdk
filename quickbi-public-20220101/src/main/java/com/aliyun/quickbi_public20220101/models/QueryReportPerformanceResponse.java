// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryReportPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryReportPerformanceResponseBody body;

    public static QueryReportPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReportPerformanceResponse self = new QueryReportPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryReportPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryReportPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryReportPerformanceResponse setBody(QueryReportPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryReportPerformanceResponseBody getBody() {
        return this.body;
    }

}
