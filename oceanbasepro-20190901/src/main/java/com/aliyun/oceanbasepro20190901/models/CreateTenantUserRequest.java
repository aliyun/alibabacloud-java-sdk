// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantUserRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Roles")
    public String roles;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("UserPassword")
    public String userPassword;

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
