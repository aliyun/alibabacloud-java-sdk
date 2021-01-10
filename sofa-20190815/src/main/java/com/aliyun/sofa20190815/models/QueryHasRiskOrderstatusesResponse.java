// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskOrderstatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskOrderstatusesResponseBody body;

    public static QueryHasRiskOrderstatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskOrderstatusesResponse self = new QueryHasRiskOrderstatusesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskOrderstatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskOrderstatusesResponse setBody(QueryHasRiskOrderstatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskOrderstatusesResponseBody getBody() {
        return this.body;
    }

}
