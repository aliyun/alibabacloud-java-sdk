// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryUserRoleInfoInWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryUserRoleInfoInWorkspaceResponseBody body;

    public static QueryUserRoleInfoInWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUserRoleInfoInWorkspaceResponse self = new QueryUserRoleInfoInWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryUserRoleInfoInWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryUserRoleInfoInWorkspaceResponse setBody(QueryUserRoleInfoInWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryUserRoleInfoInWorkspaceResponseBody getBody() {
        return this.body;
    }

}
