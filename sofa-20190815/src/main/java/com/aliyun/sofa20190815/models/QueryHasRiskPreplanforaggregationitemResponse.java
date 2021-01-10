// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskPreplanforaggregationitemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskPreplanforaggregationitemResponseBody body;

    public static QueryHasRiskPreplanforaggregationitemResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskPreplanforaggregationitemResponse self = new QueryHasRiskPreplanforaggregationitemResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskPreplanforaggregationitemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskPreplanforaggregationitemResponse setBody(QueryHasRiskPreplanforaggregationitemResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskPreplanforaggregationitemResponseBody getBody() {
        return this.body;
    }

}
