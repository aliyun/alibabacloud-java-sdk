// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseUserRolesResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 账号信息。
    @NameInMap("TenantUser")
    public ModifyDatabaseUserRolesResponseBodyTenantUser tenantUser;

    public static ModifyDatabaseUserRolesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseUserRolesResponseBody self = new ModifyDatabaseUserRolesResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseUserRolesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyDatabaseUserRolesResponseBody setTenantUser(ModifyDatabaseUserRolesResponseBodyTenantUser tenantUser) {
        this.tenantUser = tenantUser;
        return this;
    }
    public ModifyDatabaseUserRolesResponseBodyTenantUser getTenantUser() {
        return this.tenantUser;
    }

    public static class ModifyDatabaseUserRolesResponseBodyTenantUserUsers extends TeaModel {
        // 账号赋予该库的角色权限。 对于MySQL模式，角色为数据库（Database）级别，其有以下几类： - ReadWrite：读写权限，包括ALL PRIVILEGES； - ReadOnly：只读权限，包括SELECT - DDL: DDL权限，包括CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW - DML: DML权限，包括SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
        @NameInMap("Role")
        public String role;

        // 账号名称。
        @NameInMap("UserName")
        public String userName;

        public static ModifyDatabaseUserRolesResponseBodyTenantUserUsers build(java.util.Map<String, ?> map) throws Exception {
            ModifyDatabaseUserRolesResponseBodyTenantUserUsers self = new ModifyDatabaseUserRolesResponseBodyTenantUserUsers();
            return TeaModel.build(map, self);
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUserUsers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUserUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class ModifyDatabaseUserRolesResponseBodyTenantUser extends TeaModel {
        // 数据库名称。
        @NameInMap("DatabaseName")
        public String databaseName;

        // 租户ID。
        @NameInMap("TenantId")
        public String tenantId;

        // 对数据库有赋权的账户信息
        @NameInMap("Users")
        public java.util.List<ModifyDatabaseUserRolesResponseBodyTenantUserUsers> users;

        public static ModifyDatabaseUserRolesResponseBodyTenantUser build(java.util.Map<String, ?> map) throws Exception {
            ModifyDatabaseUserRolesResponseBodyTenantUser self = new ModifyDatabaseUserRolesResponseBodyTenantUser();
            return TeaModel.build(map, self);
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUser setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUser setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ModifyDatabaseUserRolesResponseBodyTenantUser setUsers(java.util.List<ModifyDatabaseUserRolesResponseBodyTenantUserUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<ModifyDatabaseUserRolesResponseBodyTenantUserUsers> getUsers() {
            return this.users;
        }

    }

}
