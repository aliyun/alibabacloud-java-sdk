// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersResponseBody extends TeaModel {
    /**
     * <p>The name of the database account.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The type of the database account. Valid values:    </p>
     * <p>- Admin: the super administrator account.   </p>
     * <p>- NORMAL: a general account.</p>
     */
    @NameInMap("TenantUsers")
    public java.util.List<DescribeTenantUsersResponseBodyTenantUsers> tenantUsers;

    /**
     * <p>The role of the account.   </p>
     * <p>In Oracle mode, a role is a schema-level role. Valid values:  </p>
     * <p>- ReadWrite: a role that has the read and write privileges, including: CREATE TABLE, CREATE VIEW, CREATE PROCEDURE, CREATE SYNONYM, CREATE SEQUENCE, CREATE TRIGGER, CREATE TYPE, CREATE SESSION, EXECUTE ANY PROCEDURE, CREATE ANY OUTLINE, ALTER ANY OUTLINE, DROP ANY OUTLINE, CREATE ANY PROCEDURE, ALTER ANY PROCEDURE, DROP ANY PROCEDURE, CREATE ANY SEQUENCE, ALTER ANY SEQUENCE, DROP ANY SEQUENCE, CREATE ANY TYPE, ALTER ANY TYPE, DROP ANY TYPE, SYSKM, CREATE ANY TRIGGER, ALTER ANY TRIGGER, DROP ANY TRIGGER, CREATE PROFILE, ALTER PROFILE, and DROP PROFILE.  </p>
     * <p>- ReadOnly: a role that has only the read-only privilege SELECT.</p>
     * <p>In MySQL mode, a role is a database-level role. Valid values: </p>
     * <p>- ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.   </p>
     * <p>- ReadOnly: a role that has only the read-only privilege SELECT.   </p>
     * <p>- DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.   </p>
     * <p>- DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.   </p>
     * <br>
     * <p>> <br>By default, an Oracle account has the read and write privileges on its own schema, which are not listed here.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeTenantUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTenantUsersResponseBody self = new DescribeTenantUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTenantUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTenantUsersResponseBody setTenantUsers(java.util.List<DescribeTenantUsersResponseBodyTenantUsers> tenantUsers) {
        this.tenantUsers = tenantUsers;
        return this;
    }
    public java.util.List<DescribeTenantUsersResponseBodyTenantUsers> getTenantUsers() {
        return this.tenantUsers;
    }

    public DescribeTenantUsersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeTenantUsersResponseBodyTenantUsersDatabases extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("Role")
        public String role;

        @NameInMap("Table")
        public String table;

        public static DescribeTenantUsersResponseBodyTenantUsersDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantUsersResponseBodyTenantUsersDatabases self = new DescribeTenantUsersResponseBodyTenantUsersDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeTenantUsersResponseBodyTenantUsersDatabases setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeTenantUsersResponseBodyTenantUsersDatabases setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeTenantUsersResponseBodyTenantUsersDatabases setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeTenantUsersResponseBodyTenantUsers extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<DescribeTenantUsersResponseBodyTenantUsersDatabases> databases;

        @NameInMap("Description")
        public String description;

        /**
         * <p>所属集群Id</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>所属租户Id</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("UserStatus")
        public String userStatus;

        @NameInMap("UserType")
        public String userType;

        public static DescribeTenantUsersResponseBodyTenantUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeTenantUsersResponseBodyTenantUsers self = new DescribeTenantUsersResponseBodyTenantUsers();
            return TeaModel.build(map, self);
        }

        public DescribeTenantUsersResponseBodyTenantUsers setDatabases(java.util.List<DescribeTenantUsersResponseBodyTenantUsersDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<DescribeTenantUsersResponseBodyTenantUsersDatabases> getDatabases() {
            return this.databases;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setUserStatus(String userStatus) {
            this.userStatus = userStatus;
            return this;
        }
        public String getUserStatus() {
            return this.userStatus;
        }

        public DescribeTenantUsersResponseBodyTenantUsers setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

}
