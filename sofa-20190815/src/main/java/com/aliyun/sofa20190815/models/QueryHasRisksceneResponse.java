// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasRisksceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasRisksceneResponseBody body;

    public static QueryHasRisksceneResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasRisksceneResponse self = new QueryHasRisksceneResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasRisksceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasRisksceneResponse setBody(QueryHasRisksceneResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasRisksceneResponseBody getBody() {
        return this.body;
    }

}
