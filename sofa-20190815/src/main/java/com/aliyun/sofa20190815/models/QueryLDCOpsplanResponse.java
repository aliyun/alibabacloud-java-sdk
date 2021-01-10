// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLDCOpsplanResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLDCOpsplanResponseBody body;

    public static QueryLDCOpsplanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLDCOpsplanResponse self = new QueryLDCOpsplanResponse();
        return TeaModel.build(map, self);
    }

    public QueryLDCOpsplanResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLDCOpsplanResponse setBody(QueryLDCOpsplanResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLDCOpsplanResponseBody getBody() {
        return this.body;
    }

}
