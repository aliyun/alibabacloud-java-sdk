// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisAtomicofnodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisAtomicofnodeResponseBody body;

    public static QueryHasDiagnosisAtomicofnodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisAtomicofnodeResponse self = new QueryHasDiagnosisAtomicofnodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisAtomicofnodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisAtomicofnodeResponse setBody(QueryHasDiagnosisAtomicofnodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisAtomicofnodeResponseBody getBody() {
        return this.body;
    }

}
