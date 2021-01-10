// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasApprovalMysubmitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasApprovalMysubmitResponseBody body;

    public static QueryHasApprovalMysubmitResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasApprovalMysubmitResponse self = new QueryHasApprovalMysubmitResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasApprovalMysubmitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasApprovalMysubmitResponse setBody(QueryHasApprovalMysubmitResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasApprovalMysubmitResponseBody getBody() {
        return this.body;
    }

}
