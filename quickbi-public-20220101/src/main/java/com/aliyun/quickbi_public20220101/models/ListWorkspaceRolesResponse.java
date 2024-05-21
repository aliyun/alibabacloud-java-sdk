// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListWorkspaceRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWorkspaceRolesResponseBody body;

    public static ListWorkspaceRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceRolesResponse self = new ListWorkspaceRolesResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWorkspaceRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWorkspaceRolesResponse setBody(ListWorkspaceRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWorkspaceRolesResponseBody getBody() {
        return this.body;
    }

}
