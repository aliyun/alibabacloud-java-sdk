// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserToWorkspaceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddUserToWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserToWorkspaceRequest self = new AddUserToWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public AddUserToWorkspaceRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public AddUserToWorkspaceRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public AddUserToWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
