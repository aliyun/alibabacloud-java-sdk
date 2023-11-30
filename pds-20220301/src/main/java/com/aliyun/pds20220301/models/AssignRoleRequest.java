// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AssignRoleRequest extends TeaModel {
    /**
     * <p>The unique identifier of a user. The group administrator role can only be assigned to a user.</p>
     */
    @NameInMap("identity")
    public Identity identity;

    /**
     * <p>The ID of the resource that the role can manage. You can only set this parameter to the ID of a group.</p>
     */
    @NameInMap("manage_resource_id")
    public String manageResourceId;

    /**
     * <p>The type of the resource that the role can manage. Valid value: RT_Group.</p>
     */
    @NameInMap("manage_resource_type")
    public String manageResourceType;

    /**
     * <p>The ID of the role that is assigned to a user. Valid value: SystemGroupAdmin.</p>
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
