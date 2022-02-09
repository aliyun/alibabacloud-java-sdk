// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantUserResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 租户中的数据库账号信息
    @NameInMap("TenantUser")
    public java.util.List<CreateTenantUserResponseBodyTenantUser> tenantUser;

    public static CreateTenantUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTenantUserResponseBody self = new CreateTenantUserResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTenantUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTenantUserResponseBody setTenantUser(java.util.List<CreateTenantUserResponseBodyTenantUser> tenantUser) {
        this.tenantUser = tenantUser;
        return this;
    }
    public java.util.List<CreateTenantUserResponseBodyTenantUser> getTenantUser() {
        return this.tenantUser;
    }

    public static class CreateTenantUserResponseBodyTenantUserRoles extends TeaModel {
        // 数据库名称
        @NameInMap("Database")
        public String database;

        // 拥有的角色。 对于Oracle模式，角色为schema级别，其可分为 - ReadWrite：读写权限，包括CREATE TABLE CREATE VIEW CREATE PROCEDURE CREATE SYNONYM CREATE SEQUENCE CREATE TRIGGER CREATE TYPE CREATE SESSION EXECUTE ANY PROCEDURE CREATE ANY OUTLINE ALTER ANY OUTLINE DROP ANY OUTLINE CREATE ANY PROCEDURE ALTER ANY PROCEDURE DROP ANY PROCEDURE CREATE ANY SEQUENCE ALTER ANY SEQUENCE DROP ANY SEQUENCE CREATE ANY TYPE ALTER ANY TYPE DROP ANY TYPE SYSKM CREATE ANY TRIGGER ALTER ANY TRIGGER DROP ANY TRIGGER CREATE PROFILE ALTER PROFILE DROP PROFILE； - ReadOnly：只读权限，SELECT
        // 对于MySQL模式，角色为数据库（Database）级别，其有以下几类： - ReadWrite：读写权限，包括ALL PRIVILEGES； - ReadOnly：只读权限，包括SELECT - DDL: DDL权限，包括CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW - DML: DML权限，包括SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
        // * 另外Oracle账户对自己的schema有默认的读写权限，这里不会列出。
        @NameInMap("Role")
        public String role;

        public static CreateTenantUserResponseBodyTenantUserRoles build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantUserResponseBodyTenantUserRoles self = new CreateTenantUserResponseBodyTenantUserRoles();
            return TeaModel.build(map, self);
        }

        public CreateTenantUserResponseBodyTenantUserRoles setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public CreateTenantUserResponseBodyTenantUserRoles setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

    public static class CreateTenantUserResponseBodyTenantUser extends TeaModel {
        // 账户对应的角色权限信息
        @NameInMap("Roles")
        public java.util.List<CreateTenantUserResponseBodyTenantUserRoles> roles;

        // 数据库账号名称。
        @NameInMap("UserName")
        public String userName;

        // 数据库账号的状态。 - Locked：锁定 - ONLINE：解锁 创建完的账户默认为ONLINE状态
        @NameInMap("UserStatus")
        public String userStatus;

        // 数据库账号类型。 - Admin：超级账户 - Normal：普通账户
        @NameInMap("UserType")
        public String userType;

        public static CreateTenantUserResponseBodyTenantUser build(java.util.Map<String, ?> map) throws Exception {
            CreateTenantUserResponseBodyTenantUser self = new CreateTenantUserResponseBodyTenantUser();
            return TeaModel.build(map, self);
        }

        public CreateTenantUserResponseBodyTenantUser setRoles(java.util.List<CreateTenantUserResponseBodyTenantUserRoles> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<CreateTenantUserResponseBodyTenantUserRoles> getRoles() {
            return this.roles;
        }

        public CreateTenantUserResponseBodyTenantUser setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public CreateTenantUserResponseBodyTenantUser setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

        public CreateTenantUserResponseBodyTenantUser setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
