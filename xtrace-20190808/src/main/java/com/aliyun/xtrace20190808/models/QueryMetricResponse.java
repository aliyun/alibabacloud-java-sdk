// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class QueryMetricResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public QueryMetricResponse setBody(QueryMetricResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryMetricResponseBody getBody() {
        return this.body;
    }

}
