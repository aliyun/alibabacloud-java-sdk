// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class QueryMetricResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryMetricResponseBody body;

    public static QueryMetricResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetricResponse self = new QueryMetricResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetricResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryMetricResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryMetricResponse setBody(QueryMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricResponseBody getBody() {
        return this.body;
    }

}
