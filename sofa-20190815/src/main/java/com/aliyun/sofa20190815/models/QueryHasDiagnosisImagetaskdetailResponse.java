// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisImagetaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisImagetaskdetailResponseBody body;

    public static QueryHasDiagnosisImagetaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisImagetaskdetailResponse self = new QueryHasDiagnosisImagetaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisImagetaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisImagetaskdetailResponse setBody(QueryHasDiagnosisImagetaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisImagetaskdetailResponseBody getBody() {
        return this.body;
    }

}
