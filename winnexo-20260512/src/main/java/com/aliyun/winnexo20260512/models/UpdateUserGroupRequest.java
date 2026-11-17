// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
    /**
     * <p>The new description of the user group. If this parameter is not specified, the description is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to move the user group to the root node. This parameter cannot be set at the same time as a non-null parentId.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("moveToRoot")
    public Boolean moveToRoot;

    /**
     * <p>The ID of the new parent user group. If this parameter is not specified, the user group is not moved. If it is explicitly set to null, the user group is moved to the root node.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>The tenant ID. This is a common parameter. In winnexo-cli, it is explicitly passed by using --tenant-id.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the target user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userGroupId")
    public String userGroupId;

    /**
     * <p>The new name of the user group. If this parameter is not specified, the name is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("userGroupName")
    public String userGroupName;

    public static UpdateUserGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGroupRequest self = new UpdateUserGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateUserGroupRequest setMoveToRoot(Boolean moveToRoot) {
        this.moveToRoot = moveToRoot;
        return this;
    }
    public Boolean getMoveToRoot() {
        return this.moveToRoot;
    }

    public UpdateUserGroupRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public UpdateUserGroupRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UpdateUserGroupRequest setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public UpdateUserGroupRequest setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }
    public String getUserGroupName() {
        return this.userGroupName;
    }

}
