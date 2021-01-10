// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRisktreatmentorderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRisktreatmentorderResponseBody body;

    public static QueryHasRisktreatmentorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRisktreatmentorderResponse self = new QueryHasRisktreatmentorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRisktreatmentorderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRisktreatmentorderResponse setBody(QueryHasRisktreatmentorderResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRisktreatmentorderResponseBody getBody() {
        return this.body;
    }

}
