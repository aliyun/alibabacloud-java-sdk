// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryOrganizationWorkspaceListResponseBody body;

    public static QueryOrganizationWorkspaceListResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOrganizationWorkspaceListResponse self = new QueryOrganizationWorkspaceListResponse();
        return TeaModel.build(map, self);
    }

    public QueryOrganizationWorkspaceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryOrganizationWorkspaceListResponse setBody(QueryOrganizationWorkspaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrganizationWorkspaceListResponseBody getBody() {
        return this.body;
    }

}
