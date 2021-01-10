// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisNodereferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisNodereferenceResponseBody body;

    public static QueryHasDiagnosisNodereferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisNodereferenceResponse self = new QueryHasDiagnosisNodereferenceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisNodereferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisNodereferenceResponse setBody(QueryHasDiagnosisNodereferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisNodereferenceResponseBody getBody() {
        return this.body;
    }

}
