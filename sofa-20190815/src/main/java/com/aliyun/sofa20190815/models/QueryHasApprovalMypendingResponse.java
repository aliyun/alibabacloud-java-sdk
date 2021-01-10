// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalMypendingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasApprovalMypendingResponseBody body;

    public static QueryHasApprovalMypendingResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalMypendingResponse self = new QueryHasApprovalMypendingResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalMypendingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasApprovalMypendingResponse setBody(QueryHasApprovalMypendingResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasApprovalMypendingResponseBody getBody() {
        return this.body;
    }

}
