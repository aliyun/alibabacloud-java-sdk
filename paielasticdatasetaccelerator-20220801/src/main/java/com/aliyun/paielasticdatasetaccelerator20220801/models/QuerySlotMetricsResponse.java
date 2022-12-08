// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paielasticdatasetaccelerator20220801.models;

import com.aliyun.tea.*;

public class QuerySlotMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QuerySlotMetricsResponseBody body;

    public static QuerySlotMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QuerySlotMetricsResponse self = new QuerySlotMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QuerySlotMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuerySlotMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuerySlotMetricsResponse setBody(QuerySlotMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QuerySlotMetricsResponseBody getBody() {
        return this.body;
    }

}
