// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class Role extends TeaModel {
    @NameInMap("created_at")
    public Long createdAt;

    @NameInMap("creator")
    public String creator;

    @NameInMap("description")
    public String description;

    @NameInMap("manage_resource_type")
    public String manageResourceType;

    @NameInMap("name")
    public String name;

    @NameInMap("permissions")
    public java.util.List<Permission> permissions;

    @NameInMap("role_id")
    public String roleId;

    @NameInMap("status")
    public String status;

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
