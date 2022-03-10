// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserFromWorkspaceRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DeleteUserFromWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserFromWorkspaceRequest self = new DeleteUserFromWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserFromWorkspaceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DeleteUserFromWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
