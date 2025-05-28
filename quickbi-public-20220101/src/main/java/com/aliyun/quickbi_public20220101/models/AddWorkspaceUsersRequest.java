// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUsersRequest extends TeaModel {
    /**
     * <p>Preset space role ID. Value range:</p>
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
     * <p>User ID. This is the UserID for Quick BI, not the Alibaba Cloud UID.</p>
     * <ul>
     * <li>Supports batch parameters, with user IDs separated by commas (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de4bc5f9429141cc8091cdd1c15b****</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    /**
     * <p>Workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static AddWorkspaceUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddWorkspaceUsersRequest self = new AddWorkspaceUsersRequest();
        return TeaModel.build(map, self);
    }

    public AddWorkspaceUsersRequest setRoleId(Long roleId) {
        this.roleId = roleId;
        return this;
    }
    public Long getRoleId() {
        return this.roleId;
    }

    public AddWorkspaceUsersRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public AddWorkspaceUsersRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
