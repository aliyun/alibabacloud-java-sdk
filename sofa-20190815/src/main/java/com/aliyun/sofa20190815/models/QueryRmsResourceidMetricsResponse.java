// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsResourceidMetricsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryRmsResourceidMetricsResponseBody body;

    public static QueryRmsResourceidMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsResourceidMetricsResponse self = new QueryRmsResourceidMetricsResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsResourceidMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryRmsResourceidMetricsResponse setBody(QueryRmsResourceidMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryRmsResourceidMetricsResponseBody getBody() {
        return this.body;
    }

}
