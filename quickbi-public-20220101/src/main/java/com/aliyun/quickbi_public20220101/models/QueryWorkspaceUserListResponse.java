// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorkspaceUserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryWorkspaceUserListResponseBody body;

    public static QueryWorkspaceUserListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceUserListResponse self = new QueryWorkspaceUserListResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceUserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorkspaceUserListResponse setBody(QueryWorkspaceUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorkspaceUserListResponseBody getBody() {
        return this.body;
    }

}
