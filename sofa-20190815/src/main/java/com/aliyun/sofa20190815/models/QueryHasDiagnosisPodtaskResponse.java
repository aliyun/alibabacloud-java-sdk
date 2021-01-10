// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisPodtaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisPodtaskResponseBody body;

    public static QueryHasDiagnosisPodtaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisPodtaskResponse self = new QueryHasDiagnosisPodtaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisPodtaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisPodtaskResponse setBody(QueryHasDiagnosisPodtaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisPodtaskResponseBody getBody() {
        return this.body;
    }

}
