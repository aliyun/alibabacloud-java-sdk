// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserRolesRequest extends TeaModel {
    /**
     * <p>The type of the privilege modification operation.   </p>
     * <p>Valid values:  </p>
     * <p>update: updates all privileges. This is the default value.  </p>
     * <p>add: adds a privilege.  </p>
     * <p>delete: deletes a privilege.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the table.</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **ModifyTenantUserRoles**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The role of the database account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The type of the account. Valid values:   </p>
     * <p>- Admin: the super administrator account.   </p>
     * <p>- Normal: a general account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserRole")
    public String userRole;

    public static ModifyTenantUserRolesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserRolesRequest self = new ModifyTenantUserRolesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserRolesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantUserRolesRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public ModifyTenantUserRolesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantUserRolesRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyTenantUserRolesRequest setUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }
    public String getUserRole() {
        return this.userRole;
    }

}
