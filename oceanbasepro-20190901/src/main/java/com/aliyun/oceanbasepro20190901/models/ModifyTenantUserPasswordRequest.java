// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyTenantUserPasswordRequest extends TeaModel {
    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 数据库账号名称。 不能使用某些预留关键字，如 SYS、root等。
    @NameInMap("UserName")
    public String userName;

    // 数据库账号访问密码。 必须包含大写英文字符、小写英文字符、数字、特殊字符占三种，长度为 10-32 位； 特殊字符为：!@#$%^&* ()_ +-=
    @NameInMap("UserPassword")
    public String userPassword;

    public static ModifyTenantUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTenantUserPasswordRequest self = new ModifyTenantUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTenantUserPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyTenantUserPasswordRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ModifyTenantUserPasswordRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyTenantUserPasswordRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

}
