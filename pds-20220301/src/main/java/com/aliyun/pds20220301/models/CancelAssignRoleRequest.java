// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CancelAssignRoleRequest extends TeaModel {
    @NameInMap("identity")
    public Identity identity;

    @NameInMap("manage_resource_id")
    public String manageResourceId;

    @NameInMap("manage_resource_type")
    public String manageResourceType;

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
