// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateUserGroupRequest extends TeaModel {
    /**
     * <p>The new description of the user group. If not specified, the description is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>South China Sales Organization</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>Specifies whether to move the user group to the root node. This parameter cannot be set together with parentId.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("moveToRoot")
    public Boolean moveToRoot;

    /**
     * <p>The ID of the new parent user group. If not specified, the user group is not moved.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
     */
    @NameInMap("parentId")
    public String parentId;

    /**
     * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    /**
     * <p>The ID of the target user group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7ea8973f-7a5c-4e8a-956b-4fe0e7e2eb11</p>
     */
    @NameInMap("userGroupId")
    public String userGroupId;

    /**
     * <p>The new name of the user group. If not specified, the name is not modified.</p>
     * 
     * <strong>example:</strong>
     * <p>South China Sales</p>
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
