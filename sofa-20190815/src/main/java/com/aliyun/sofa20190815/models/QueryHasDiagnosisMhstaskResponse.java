// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDiagnosisMhstaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDiagnosisMhstaskResponseBody body;

    public static QueryHasDiagnosisMhstaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDiagnosisMhstaskResponse self = new QueryHasDiagnosisMhstaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDiagnosisMhstaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDiagnosisMhstaskResponse setBody(QueryHasDiagnosisMhstaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDiagnosisMhstaskResponseBody getBody() {
        return this.body;
    }

}
