// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisRuleofnodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisRuleofnodeResponseBody body;

    public static QueryHasDiagnosisRuleofnodeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisRuleofnodeResponse self = new QueryHasDiagnosisRuleofnodeResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisRuleofnodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisRuleofnodeResponse setBody(QueryHasDiagnosisRuleofnodeResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisRuleofnodeResponseBody getBody() {
        return this.body;
    }

}
