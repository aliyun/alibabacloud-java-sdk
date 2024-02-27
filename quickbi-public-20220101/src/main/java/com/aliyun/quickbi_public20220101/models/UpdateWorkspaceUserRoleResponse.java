// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUserRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWorkspaceUserRoleResponseBody body;

    public static UpdateWorkspaceUserRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUserRoleResponse self = new UpdateWorkspaceUserRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUserRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceUserRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWorkspaceUserRoleResponse setBody(UpdateWorkspaceUserRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceUserRoleResponseBody getBody() {
        return this.body;
    }

}
