// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AssignRoleRequest extends TeaModel {
    /**
     * <p>The unique identifier of the user.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("identity")
    public Identity identity;

    /**
     * <p>The resource ID to manage. Currently, only a group ID is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>105***b82</p>
     */
    @NameInMap("manage_resource_id")
    public String manageResourceId;

    /**
     * <p>The resource type to manage. Currently, only <code>RT_Group</code> (group) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RT_Group</p>
     */
    @NameInMap("manage_resource_type")
    public String manageResourceType;

    /**
     * <p>The role ID to assign to the user. Currently, only <code>SystemGroupAdmin</code> (team administrator) is supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemGroupAdmin</p>
     */
    @NameInMap("role_id")
    public String roleId;

    public static AssignRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        AssignRoleRequest self = new AssignRoleRequest();
        return TeaModel.build(map, self);
    }

    public AssignRoleRequest setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public AssignRoleRequest setManageResourceId(String manageResourceId) {
        this.manageResourceId = manageResourceId;
        return this;
    }
    public String getManageResourceId() {
        return this.manageResourceId;
    }

    public AssignRoleRequest setManageResourceType(String manageResourceType) {
        this.manageResourceType = manageResourceType;
        return this;
    }
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    public AssignRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
