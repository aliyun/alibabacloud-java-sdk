// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUserRoleRequest extends TeaModel {
    @NameInMap("RoleId")
    public Long roleId;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceUserRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUserRoleRequest self = new UpdateWorkspaceUserRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceUserRoleRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public UpdateWorkspaceUserRoleRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public UpdateWorkspaceUserRoleRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
