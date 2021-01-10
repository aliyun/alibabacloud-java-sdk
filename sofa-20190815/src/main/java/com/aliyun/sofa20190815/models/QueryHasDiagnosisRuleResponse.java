// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRuleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisRuleResponseBody body;

    public static QueryHasDiagnosisRuleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRuleResponse self = new QueryHasDiagnosisRuleResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisRuleResponse setBody(QueryHasDiagnosisRuleResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisRuleResponseBody getBody() {
        return this.body;
    }

}
