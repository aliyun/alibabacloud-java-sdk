// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryWorkspaceRoleConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QueryWorkspaceRoleConfigResponseBody body;

    public static QueryWorkspaceRoleConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceRoleConfigResponse self = new QueryWorkspaceRoleConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceRoleConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryWorkspaceRoleConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QueryWorkspaceRoleConfigResponse setBody(QueryWorkspaceRoleConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryWorkspaceRoleConfigResponseBody getBody() {
        return this.body;
    }

}
