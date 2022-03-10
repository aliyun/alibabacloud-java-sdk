// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUsersRoleRequest extends TeaModel {
    @NameInMap("RoleId")
    public Long roleId;

    @NameInMap("UserIds")
    public String userIds;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceUsersRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUsersRoleRequest self = new UpdateWorkspaceUsersRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUsersRoleRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public UpdateWorkspaceUsersRoleRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public UpdateWorkspaceUsersRoleRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
