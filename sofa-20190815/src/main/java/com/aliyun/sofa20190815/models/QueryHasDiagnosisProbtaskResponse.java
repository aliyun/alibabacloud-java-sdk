// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisProbtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisProbtaskResponseBody body;

    public static QueryHasDiagnosisProbtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisProbtaskResponse self = new QueryHasDiagnosisProbtaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisProbtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisProbtaskResponse setBody(QueryHasDiagnosisProbtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisProbtaskResponseBody getBody() {
        return this.body;
    }

}
