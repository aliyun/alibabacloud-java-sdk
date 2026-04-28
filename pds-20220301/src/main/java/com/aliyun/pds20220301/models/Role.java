// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Role extends TeaModel {
    /**
     * <p>The time when the role was created. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1703648502811</p>
     */
    @NameInMap("created_at")
    public Long createdAt;

    /**
     * <p>The ID of the user who created the role.</p>
     * 
     * <strong>example:</strong>
     * <p>a23***</p>
     */
    @NameInMap("creator")
    public String creator;

    /**
     * <p>The description of the role.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The type of the resource on which the role has permissions. Valid value: RT_File.</p>
     * 
     * <strong>example:</strong>
     * <p>RT_File</p>
     */
    @NameInMap("manage_resource_type")
    public String manageResourceType;

    /**
     * <p>The name of the role.</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The permissions.</p>
     */
    @NameInMap("permissions")
    public java.util.List<Permission> permissions;

    /**
     * <p>The ID of the role.</p>
     * 
     * <strong>example:</strong>
     * <p>f2a***</p>
     */
    @NameInMap("role_id")
    public String roleId;

    /**
     * <p>The status of the role.</p>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the role was modified. The value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>1703648502811</p>
     */
    @NameInMap("updated_at")
    public Long updatedAt;

    public static Role build(java.util.Map<String, ?> map) throws Exception {
        Role self = new Role();
        return TeaModel.build(map, self);
    }

    public Role setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Role setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Role setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Role setManageResourceType(String manageResourceType) {
        this.manageResourceType = manageResourceType;
        return this;
    }
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Role setPermissions(java.util.List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<Permission> getPermissions() {
        return this.permissions;
    }

    public Role setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

    public Role setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Role setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

}
