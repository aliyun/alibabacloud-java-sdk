// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceUserRoleRequest extends TeaModel {
    /**
     * <p>Preset workspace role ID, existing roles will be overwritten. Value range:</p>
     * <ul>
     * <li>25: Workspace Administrator</li>
     * <li>26: Workspace Developer</li>
     * <li>27: Workspace Analyst</li>
     * <li>30: Workspace Viewer</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RoleId")
    @Deprecated
    public Long roleId;

    /**
     * <p>Multiple workspace role IDs, separated by commas. If this value is provided, it takes precedence.</p>
     * <blockquote>
     * <p>Notice: roleId and roleIds cannot both be empty</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>25,26</p>
     */
    @NameInMap("RoleIds")
    public String roleIds;

    /**
     * <p>Quick BI user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f5698bedeb384b1986afccd9e434****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateWorkspaceUserRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceUserRoleRequest self = new UpdateWorkspaceUserRoleRequest();
        return TeaModel.build(map, self);
    }

    @Deprecated
    public UpdateWorkspaceUserRoleRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public UpdateWorkspaceUserRoleRequest setRoleIds(String roleIds) {
        this.roleIds = roleIds;
        return this;
    }
    public String getRoleIds() {
        return this.roleIds;
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
