// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserToWorkspaceRequest extends TeaModel {
    /**
     * <p>The preset space role ID. Value range:</p>
     * <ul>
     * <li>25: Space Administrator</li>
     * <li>26: Space Developer</li>
     * <li>27: Space Analyst</li>
     * <li>30: Space Viewer</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    /**
     * <p>The ID of the Quick BI user to be added.</p>
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
