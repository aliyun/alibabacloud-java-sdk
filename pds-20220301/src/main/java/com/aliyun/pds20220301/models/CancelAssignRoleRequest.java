// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CancelAssignRoleRequest extends TeaModel {
    /**
     * <p>The identity whose role is to be revoked. Currently, this must be a user.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("identity")
    public Identity identity;

    /**
     * <p>The ID of the managed resource. This must be a Group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>105***b82</p>
     */
    @NameInMap("manage_resource_id")
    public String manageResourceId;

    /**
     * <p>The resource type of the managed resource. This must be set to <code>RT_Group</code> (team).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RT_Group</p>
     */
    @NameInMap("manage_resource_type")
    public String manageResourceType;

    /**
     * <p>The ID of the role to revoke. This must be set to <code>SystemGroupAdmin</code> (team administrator).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemGroupAdmin</p>
     */
    @NameInMap("role_id")
    public String roleId;

    public static CancelAssignRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelAssignRoleRequest self = new CancelAssignRoleRequest();
        return TeaModel.build(map, self);
    }

    public CancelAssignRoleRequest setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

    public CancelAssignRoleRequest setManageResourceId(String manageResourceId) {
        this.manageResourceId = manageResourceId;
        return this;
    }
    public String getManageResourceId() {
        return this.manageResourceId;
    }

    public CancelAssignRoleRequest setManageResourceType(String manageResourceType) {
        this.manageResourceType = manageResourceType;
        return this;
    }
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    public CancelAssignRoleRequest setRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }
    public String getRoleId() {
        return this.roleId;
    }

}
