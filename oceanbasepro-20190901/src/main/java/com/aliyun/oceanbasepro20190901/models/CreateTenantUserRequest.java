// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantUserRequest extends TeaModel {
    // 数据库描述信息。
    @NameInMap("Description")
    public String description;

    // Oceanbase集群ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 用户的角色信息。 对于Oracle模式：无需填写。 对于MySQL模式：超级账户默认为ALL PRIVILEGES，无需填写。 普通用户填写账户的信息，其为Json格式的字符串，默认为一个数组，数组内包含schema（Oracle模式）或Database（MySQL模式)信息和角色信息（Role）。 角色包含以下几类： 读写权限（ReadWrite）：ALL PRIVILEGES ； 只读权限（ReadOnly）：SELECT DDL权限（DDL）：CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW DML权限：SELECT,INSERT,UPDATE,DELETE,SHOW VIEW； DML权限（DML）：SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
    @NameInMap("Roles")
    public String roles;

    // 租户ID。
    @NameInMap("TenantId")
    public String tenantId;

    // 数据库账号名称。 不能使用某些预留关键字，如 SYS、root等。
    @NameInMap("UserName")
    public String userName;

    // 数据库账号访问密码。 必须包含大写英文字符、小写英文字符、数字、特殊字符占三种，长度为 10-32 位； 特殊字符为：!@#$%^&* ()_ +-=
    @NameInMap("UserPassword")
    public String userPassword;

    // 数据库账户的类型 Admin：超级账户 Normal：普通账户
    @NameInMap("UserType")
    public String userType;

    public static CreateTenantUserRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantUserRequest self = new CreateTenantUserRequest();
        return TeaModel.build(map, self);
    }

    public CreateTenantUserRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTenantUserRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateTenantUserRequest setRoles(String roles) {
        this.roles = roles;
        return this;
    }
    public String getRoles() {
        return this.roles;
    }

    public CreateTenantUserRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateTenantUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CreateTenantUserRequest setUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }
    public String getUserPassword() {
        return this.userPassword;
    }

    public CreateTenantUserRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

}
