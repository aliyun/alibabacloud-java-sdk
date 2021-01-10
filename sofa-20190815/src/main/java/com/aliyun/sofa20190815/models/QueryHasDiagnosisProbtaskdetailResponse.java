// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisProbtaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisProbtaskdetailResponseBody body;

    public static QueryHasDiagnosisProbtaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisProbtaskdetailResponse self = new QueryHasDiagnosisProbtaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisProbtaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisProbtaskdetailResponse setBody(QueryHasDiagnosisProbtaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisProbtaskdetailResponseBody getBody() {
        return this.body;
    }

}
