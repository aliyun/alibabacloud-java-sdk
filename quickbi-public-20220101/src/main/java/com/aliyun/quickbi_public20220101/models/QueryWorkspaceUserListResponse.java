// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorkspaceUserListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public QueryWorkspaceUserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorkspaceUserListResponse setBody(QueryWorkspaceUserListResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorkspaceUserListResponseBody getBody() {
        return this.body;
    }

}
