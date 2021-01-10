// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisPlanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisPlanResponseBody body;

    public static QueryHasDiagnosisPlanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisPlanResponse self = new QueryHasDiagnosisPlanResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisPlanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisPlanResponse setBody(QueryHasDiagnosisPlanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisPlanResponseBody getBody() {
        return this.body;
    }

}
