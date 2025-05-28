// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteUserFromWorkspaceRequest extends TeaModel {
    /**
     * <p>The ID of the user to be deleted. Note that this UserID is for Quick BI, not the Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de4bc5f9429141cc8091cdd1c15b****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the workspace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
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
