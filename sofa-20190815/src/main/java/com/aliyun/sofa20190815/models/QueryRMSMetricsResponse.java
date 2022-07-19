// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRMSMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRMSMetricsResponseBody body;

    public static QueryRMSMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRMSMetricsResponse self = new QueryRMSMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRMSMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRMSMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryRMSMetricsResponse setBody(QueryRMSMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRMSMetricsResponseBody getBody() {
        return this.body;
    }

}
