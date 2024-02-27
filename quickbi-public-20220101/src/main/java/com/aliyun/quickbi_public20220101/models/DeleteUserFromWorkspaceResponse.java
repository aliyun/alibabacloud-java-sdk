// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserFromWorkspaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteUserFromWorkspaceResponseBody body;

    public static DeleteUserFromWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserFromWorkspaceResponse self = new DeleteUserFromWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserFromWorkspaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserFromWorkspaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserFromWorkspaceResponse setBody(DeleteUserFromWorkspaceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserFromWorkspaceResponseBody getBody() {
        return this.body;
    }

}
