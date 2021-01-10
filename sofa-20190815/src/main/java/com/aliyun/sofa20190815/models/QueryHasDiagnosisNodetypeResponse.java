// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisNodetypeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisNodetypeResponseBody body;

    public static QueryHasDiagnosisNodetypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisNodetypeResponse self = new QueryHasDiagnosisNodetypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisNodetypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisNodetypeResponse setBody(QueryHasDiagnosisNodetypeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisNodetypeResponseBody getBody() {
        return this.body;
    }

}
