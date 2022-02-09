// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeTenantUsersResponseBody extends TeaModel {
    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 租户中的数据库账号信息
    @NameInMap("TenantUsers")
    public java.util.List<DescribeTenantUsersResponseBodyTenantUsers> tenantUsers;

    // 租户中的数据库账号总数。
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
        // 数据库(schema)名称
        @NameInMap("Database")
        public String database;

        // 拥有的角色。 对于Oracle模式，角色为schema级别，其可分为 - ReadWrite：读写权限，包括CREATE TABLE CREATE VIEW CREATE PROCEDURE CREATE SYNONYM CREATE SEQUENCE CREATE TRIGGER CREATE TYPE CREATE SESSION EXECUTE ANY PROCEDURE CREATE ANY OUTLINE ALTER ANY OUTLINE DROP ANY OUTLINE CREATE ANY PROCEDURE ALTER ANY PROCEDURE DROP ANY PROCEDURE CREATE ANY SEQUENCE ALTER ANY SEQUENCE DROP ANY SEQUENCE CREATE ANY TYPE ALTER ANY TYPE DROP ANY TYPE SYSKM CREATE ANY TRIGGER ALTER ANY TRIGGER DROP ANY TRIGGER CREATE PROFILE ALTER PROFILE DROP PROFILE； - ReadOnly：只读权限，SELECT
        // 对于MySQL模式，角色为数据库（Database）级别，其有以下几类： - ReadWrite：读写权限，包括ALL PRIVILEGES； - ReadOnly：只读权限，包括SELECT - DDL: DDL权限，包括CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW - DML: DML权限，包括SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
        // * 另外Oracle账户对自己的schema有默认的读写权限，这里不会列出。
        @NameInMap("Role")
        public String role;

        // 表的名称。
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
        // 账号具备的数据库权限信息。
        @NameInMap("Databases")
        public java.util.List<DescribeTenantUsersResponseBodyTenantUsersDatabases> databases;

        // 数据库账号的描述信息。
        @NameInMap("Description")
        public String description;

        // 数据库账号名称。
        @NameInMap("UserName")
        public String userName;

        // 数据库账号的状态。 - LOCKED：锁定 - ONLINE：解锁
        @NameInMap("UserStatus")
        public String userStatus;

        // 数据库账号类型。 - Admin：超级账户 - Normal：普通账户
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
