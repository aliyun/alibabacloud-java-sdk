// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisShelltaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisShelltaskResponseBody body;

    public static QueryHasDiagnosisShelltaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisShelltaskResponse self = new QueryHasDiagnosisShelltaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisShelltaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisShelltaskResponse setBody(QueryHasDiagnosisShelltaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisShelltaskResponseBody getBody() {
        return this.body;
    }

}
