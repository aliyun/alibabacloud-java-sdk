// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskAggregationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskAggregationResponseBody body;

    public static QueryHasRiskAggregationResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskAggregationResponse self = new QueryHasRiskAggregationResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskAggregationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskAggregationResponse setBody(QueryHasRiskAggregationResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskAggregationResponseBody getBody() {
        return this.body;
    }

}
