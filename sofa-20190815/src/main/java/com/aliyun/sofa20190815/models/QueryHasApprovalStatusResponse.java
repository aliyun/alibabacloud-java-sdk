// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasApprovalStatusResponseBody body;

    public static QueryHasApprovalStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalStatusResponse self = new QueryHasApprovalStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasApprovalStatusResponse setBody(QueryHasApprovalStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasApprovalStatusResponseBody getBody() {
        return this.body;
    }

}
