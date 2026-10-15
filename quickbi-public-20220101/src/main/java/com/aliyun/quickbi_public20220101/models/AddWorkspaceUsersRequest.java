// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddWorkspaceUsersRequest extends TeaModel {
    /**
     * <p>The ID of the preset workspace role. Valid values:</p>
     * <ul>
     * <li>25: storage management administrator</li>
     * <li>26: workspace developer</li>
     * <li>27: storage analysis analyst</li>
     * <li>30: workspace viewer</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("RoleId")
    public Long roleId;

    /**
     * <p>The user IDs. These are Quick BI user IDs, not Alibaba Cloud UIDs.</p>
     * <ul>
     * <li>You can pass multiple user IDs separated by commas (,).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>de4bc5f9429141cc8091cdd1c15b****</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    /**
     * <p>The workspace ID.</p>
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
