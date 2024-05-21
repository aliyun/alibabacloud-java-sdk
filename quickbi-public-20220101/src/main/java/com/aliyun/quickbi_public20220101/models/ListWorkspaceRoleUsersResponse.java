// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceRoleUsersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkspaceRoleUsersResponseBody body;

    public static ListWorkspaceRoleUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRoleUsersResponse self = new ListWorkspaceRoleUsersResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRoleUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceRoleUsersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspaceRoleUsersResponse setBody(ListWorkspaceRoleUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceRoleUsersResponseBody getBody() {
        return this.body;
    }

}
