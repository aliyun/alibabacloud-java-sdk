// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUsersRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateWorkspaceUsersRoleResponseBody body;

    public static UpdateWorkspaceUsersRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUsersRoleResponse self = new UpdateWorkspaceUsersRoleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUsersRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWorkspaceUsersRoleResponse setBody(UpdateWorkspaceUsersRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWorkspaceUsersRoleResponseBody getBody() {
        return this.body;
    }

}
