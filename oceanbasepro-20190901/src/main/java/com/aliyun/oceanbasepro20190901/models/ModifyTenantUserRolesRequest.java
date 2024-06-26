// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserRolesRequest extends TeaModel {
    /**
     * <p>The type of the privilege modification operation.<br>Valid values:<br>update: updates all privileges. This is the default value.<br>add: adds a privilege.<br>delete: deletes a privilege.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob317v4uif****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>update</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The operation that you want to perform.<br>Set the value to <strong>ModifyTenantUserRoles</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ob2mr3oae0****</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The role of the database account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pay_test</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The type of the account. Valid values:   </p>
     * <ul>
     * <li>Admin: the super administrator account.   </li>
     * <li>Normal: a general account.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Database&quot;:&quot;20210824160559&quot;,&quot;Role&quot;:&quot;readwrite&quot;}]</p>
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
