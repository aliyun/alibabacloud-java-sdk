// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisMonitortaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisMonitortaskResponseBody body;

    public static QueryHasDiagnosisMonitortaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisMonitortaskResponse self = new QueryHasDiagnosisMonitortaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisMonitortaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisMonitortaskResponse setBody(QueryHasDiagnosisMonitortaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisMonitortaskResponseBody getBody() {
        return this.body;
    }

}
