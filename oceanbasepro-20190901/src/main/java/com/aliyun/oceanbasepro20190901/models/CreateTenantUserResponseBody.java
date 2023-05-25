// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTenantUserResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of database accounts in the tenant.</p>
     */
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
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The role of the account.  In Oracle mode, a role is a schema-level role. Valid values: - ReadWrite: a role that has the read and write privileges, including CREATE TABLE, CREATE VIEW, CREATE PROCEDURE, CREATE SYNONYM, CREATE SEQUENCE, CREATE TRIGGER, CREATE TYPE, CREATE SESSION, EXECUTE ANY PROCEDURE, CREATE ANY OUTLINE, ALTER ANY OUTLINE, DROP ANY OUTLINE, CREATE ANY PROCEDURE, ALTER ANY PROCEDURE, DROP ANY PROCEDURE, CREATE ANY SEQUENCE, ALTER ANY SEQUENCE, DROP ANY SEQUENCE, CREATE ANY TYPE, ALTER ANY TYPE, DROP ANY TYPE, SYSKM, CREATE ANY TRIGGER, ALTER ANY TRIGGER, DROP ANY TRIGGER, CREATE PROFILE, ALTER PROFILE, and DROP PROFILE. - ReadOnly: a role that has only the read-only privilege SELECT.</p>
         * <p>In MySQL mode, a role is a database-level role. Valid values: - ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES. - ReadOnly: a role that has only the read-only privilege SELECT. - DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW. - DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW. </p>
         * <p>* By default, an Oracle account has the read and write privileges on its own schema, which are not listed here.</p>
         */
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
        /**
         * <p>The roles of the accounts.</p>
         */
        @NameInMap("Roles")
        public java.util.List<CreateTenantUserResponseBodyTenantUserRoles> roles;

        /**
         * <p>The name of the database account.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The status of the database account. Valid values:  - Locked: The account is locked. - ONLINE: The account is unlocked. The default status of a new account is ONLINE after it is created.</p>
         */
        @NameInMap("UserStatus")
        public String userStatus;

        /**
         * <p>The type of the database account. Valid values:  - Admin: the super administrator account. - Normal: a general account.</p>
         */
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
