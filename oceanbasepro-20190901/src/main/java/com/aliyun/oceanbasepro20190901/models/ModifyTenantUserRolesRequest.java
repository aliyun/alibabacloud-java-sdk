// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserRolesRequest extends TeaModel {
    /**
     * <p>The ID of the OceanBase cluster.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the privilege modification operation.   </p>
     * <p>Valid values:  </p>
     * <p>update: updates all privileges. This is the default value.  </p>
     * <p>add: adds a privilege.  </p>
     * <p>delete: deletes a privilege.</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The name of the database account.   </p>
     * <p>You cannot use reserved keywords, such as SYS and root.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The role of the database account.</p>
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
