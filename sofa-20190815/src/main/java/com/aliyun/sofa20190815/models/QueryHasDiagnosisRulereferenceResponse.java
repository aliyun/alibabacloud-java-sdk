// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRulereferenceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisRulereferenceResponseBody body;

    public static QueryHasDiagnosisRulereferenceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRulereferenceResponse self = new QueryHasDiagnosisRulereferenceResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRulereferenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisRulereferenceResponse setBody(QueryHasDiagnosisRulereferenceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisRulereferenceResponseBody getBody() {
        return this.body;
    }

}
