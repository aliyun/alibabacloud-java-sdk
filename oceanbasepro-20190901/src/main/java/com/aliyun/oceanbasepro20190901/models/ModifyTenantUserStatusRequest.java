// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserStatusRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform.   </p>
     * <p>Set the value to **ModifyTenantUserStatus**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the tenant.</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    /**
     * <p>The list of database accounts in the tenant.</p>
     */
    @NameInMap("UserName")
    public String userName;

    /**
     * <p>The status of the database account. Valid values:   </p>
     * <p>- Locked: The account is locked. </p>
     * <p>- Online: The account is unlocked.</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static ModifyTenantUserStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserStatusRequest self = new ModifyTenantUserStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantUserStatusRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantUserStatusRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyTenantUserStatusRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
