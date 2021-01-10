// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisPythontaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisPythontaskResponseBody body;

    public static QueryHasDiagnosisPythontaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisPythontaskResponse self = new QueryHasDiagnosisPythontaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisPythontaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisPythontaskResponse setBody(QueryHasDiagnosisPythontaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisPythontaskResponseBody getBody() {
        return this.body;
    }

}
