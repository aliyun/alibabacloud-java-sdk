// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRiskStatusesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRiskStatusesResponseBody body;

    public static QueryHasRiskStatusesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRiskStatusesResponse self = new QueryHasRiskStatusesResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRiskStatusesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRiskStatusesResponse setBody(QueryHasRiskStatusesResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRiskStatusesResponseBody getBody() {
        return this.body;
    }

}
