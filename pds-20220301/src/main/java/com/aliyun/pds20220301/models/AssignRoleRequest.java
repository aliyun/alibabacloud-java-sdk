// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class AssignRoleRequest extends TeaModel {
    @NameInMap("identity")
    public Identity identity;

    @NameInMap("manage_resource_id")
    public String manageResourceId;

    @NameInMap("manage_resource_type")
    public String manageResourceType;

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
