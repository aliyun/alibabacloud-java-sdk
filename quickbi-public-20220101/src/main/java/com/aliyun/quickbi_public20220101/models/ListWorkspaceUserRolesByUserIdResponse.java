// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceUserRolesByUserIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkspaceUserRolesByUserIdResponseBody body;

    public static ListWorkspaceUserRolesByUserIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceUserRolesByUserIdResponse self = new ListWorkspaceUserRolesByUserIdResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceUserRolesByUserIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceUserRolesByUserIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspaceUserRolesByUserIdResponse setBody(ListWorkspaceUserRolesByUserIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceUserRolesByUserIdResponseBody getBody() {
        return this.body;
    }

}
