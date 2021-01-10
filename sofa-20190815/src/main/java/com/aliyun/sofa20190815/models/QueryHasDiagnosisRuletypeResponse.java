// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRuletypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisRuletypeResponseBody body;

    public static QueryHasDiagnosisRuletypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRuletypeResponse self = new QueryHasDiagnosisRuletypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRuletypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisRuletypeResponse setBody(QueryHasDiagnosisRuletypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisRuletypeResponseBody getBody() {
        return this.body;
    }

}
