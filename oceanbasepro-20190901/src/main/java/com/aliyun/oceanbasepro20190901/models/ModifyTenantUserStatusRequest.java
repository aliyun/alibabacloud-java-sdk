// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserStatusRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 数据库账号名称。 不能使用某些预留关键字，如 SYS、root等。
    @NameInMap("UserName")
    public String userName;

    // 数据库账号的状态。 Locked：锁定 Normal：解锁
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
