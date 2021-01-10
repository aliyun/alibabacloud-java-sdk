// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasInspectPythontaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasInspectPythontaskResponseBody body;

    public static QueryHasInspectPythontaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasInspectPythontaskResponse self = new QueryHasInspectPythontaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasInspectPythontaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasInspectPythontaskResponse setBody(QueryHasInspectPythontaskResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasInspectPythontaskResponseBody getBody() {
        return this.body;
    }

}
