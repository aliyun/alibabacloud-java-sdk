// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryHotlineDashboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHotlineDashboardResponseBody body;

    public static QueryHotlineDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHotlineDashboardResponse self = new QueryHotlineDashboardResponse();
        return TeaModel.build(map, self);
    }

    public QueryHotlineDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHotlineDashboardResponse setBody(QueryHotlineDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHotlineDashboardResponseBody getBody() {
        return this.body;
    }

}
