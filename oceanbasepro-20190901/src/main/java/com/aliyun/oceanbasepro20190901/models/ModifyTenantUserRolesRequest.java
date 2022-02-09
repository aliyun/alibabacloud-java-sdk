// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserRolesRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 用户权限修改类型。 可支持以下几种方式： update：全量更新权限，默认值； add：新增权限； delete：删除权限。 默认值：update。
    @NameInMap("ModifyType")
    public String modifyType;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 数据库账号名称。 不能使用某些预留关键字，如 SYS、root等。
    @NameInMap("UserName")
    public String userName;

    // 数据库的账号角色信息。
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
