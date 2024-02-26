// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QueryInstanceMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryInstanceMetricsResponseBody body;

    public static QueryInstanceMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceMetricsResponse self = new QueryInstanceMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryInstanceMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryInstanceMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryInstanceMetricsResponse setBody(QueryInstanceMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryInstanceMetricsResponseBody getBody() {
        return this.body;
    }

}
