// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyDatabaseUserRolesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The account information.</p>
     */
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
        /**
         * <p>The role of the account.   </p>
         * <p>In MySQL mode, a role is a database-level role. Valid values:</p>
         * <p>- ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.</p>
         * <p>- ReadOnly: a role that has only the read-only privilege SELECT. </p>
         * <p>- DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW. </p>
         * <p>- DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The name of the account.</p>
         */
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
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The ID of the tenant.</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The accounts that have privileges on the database.</p>
         */
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
