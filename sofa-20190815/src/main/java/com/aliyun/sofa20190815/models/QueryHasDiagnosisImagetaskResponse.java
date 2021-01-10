// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisImagetaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisImagetaskResponseBody body;

    public static QueryHasDiagnosisImagetaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisImagetaskResponse self = new QueryHasDiagnosisImagetaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisImagetaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisImagetaskResponse setBody(QueryHasDiagnosisImagetaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisImagetaskResponseBody getBody() {
        return this.body;
    }

}
