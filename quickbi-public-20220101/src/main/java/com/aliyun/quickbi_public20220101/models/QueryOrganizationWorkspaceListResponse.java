// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryOrganizationWorkspaceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryOrganizationWorkspaceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryOrganizationWorkspaceListResponse setBody(QueryOrganizationWorkspaceListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryOrganizationWorkspaceListResponseBody getBody() {
        return this.body;
    }

}
