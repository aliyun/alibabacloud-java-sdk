// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisNodeResponseBody body;

    public static QueryHasDiagnosisNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisNodeResponse self = new QueryHasDiagnosisNodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisNodeResponse setBody(QueryHasDiagnosisNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisNodeResponseBody getBody() {
        return this.body;
    }

}
