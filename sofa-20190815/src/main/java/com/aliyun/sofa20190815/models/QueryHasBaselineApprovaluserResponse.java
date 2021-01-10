// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasBaselineApprovaluserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasBaselineApprovaluserResponseBody body;

    public static QueryHasBaselineApprovaluserResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasBaselineApprovaluserResponse self = new QueryHasBaselineApprovaluserResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasBaselineApprovaluserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasBaselineApprovaluserResponse setBody(QueryHasBaselineApprovaluserResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasBaselineApprovaluserResponseBody getBody() {
        return this.body;
    }

}
