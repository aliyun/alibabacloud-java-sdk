// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisTaskResponseBody body;

    public static QueryHasDiagnosisTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisTaskResponse self = new QueryHasDiagnosisTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisTaskResponse setBody(QueryHasDiagnosisTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisTaskResponseBody getBody() {
        return this.body;
    }

}
