// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    // 租户中的数据库列表。
    @NameInMap("Databases")
    public java.util.List<DescribeDatabasesResponseBodyDatabases> databases;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 租户中的数据库总数。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponseBody self = new DescribeDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponseBody setDatabases(java.util.List<DescribeDatabasesResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<DescribeDatabasesResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public DescribeDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabasesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDatabasesResponseBodyDatabasesTables extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        public static DescribeDatabasesResponseBodyDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesTables self = new DescribeDatabasesResponseBodyDatabasesTables();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesUsers extends TeaModel {
        // 账号赋予该库的角色权限。 对于MySQL模式，角色为数据库（Database）级别，其有以下几类： - ReadWrite：读写权限，包括ALL PRIVILEGES； - ReadOnly：只读权限，包括SELECT - DDL: DDL权限，包括CREATE,DROP,ALTER,SHOW VIEW,CREATE VIEW - DML: DML权限，包括SELECT,INSERT,UPDATE,DELETE,SHOW VIEW。
        @NameInMap("Role")
        public String role;

        // 账号名称。
        @NameInMap("UserName")
        public String userName;

        // 账号类型。 - Admin：超级账户 - Normal：普通账户
        @NameInMap("UserType")
        public String userType;

        public static DescribeDatabasesResponseBodyDatabasesUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesUsers self = new DescribeDatabasesResponseBodyDatabasesUsers();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesUsers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeDatabasesResponseBodyDatabasesUsers setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDatabasesResponseBodyDatabasesUsers setUserType(String userType) {
            this.userType = userType;
            return this;
        }
        public String getUserType() {
            return this.userType;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabases extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        // 实际数据大小
        @NameInMap("DataSize")
        public Double dataSize;

        // 数据库名称。
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DbType")
        public String dbType;

        // 数据库的描述信息。
        @NameInMap("Description")
        public String description;

        // 数据库的编码。目前支持utf8mb4、gbk等编码。
        @NameInMap("Encoding")
        public String encoding;

        // 所需容量
        @NameInMap("RequiredSize")
        public Double requiredSize;

        // 数据库的状态。 - ONLINE: 运行中 - DELETING: 删除中
        @NameInMap("Status")
        public String status;

        @NameInMap("Tables")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesTables> tables;

        // 租户ID。
        @NameInMap("TenantId")
        public String tenantId;

        // 对该数据库赋权的账号信息。
        @NameInMap("Users")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesUsers> users;

        public static DescribeDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabases self = new DescribeDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabases setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeDatabasesResponseBodyDatabases setDataSize(Double dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Double getDataSize() {
            return this.dataSize;
        }

        public DescribeDatabasesResponseBodyDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeDatabasesResponseBodyDatabases setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public DescribeDatabasesResponseBodyDatabases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDatabasesResponseBodyDatabases setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public DescribeDatabasesResponseBodyDatabases setRequiredSize(Double requiredSize) {
            this.requiredSize = requiredSize;
            return this;
        }
        public Double getRequiredSize() {
            return this.requiredSize;
        }

        public DescribeDatabasesResponseBodyDatabases setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDatabasesResponseBodyDatabases setTables(java.util.List<DescribeDatabasesResponseBodyDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyDatabasesTables> getTables() {
            return this.tables;
        }

        public DescribeDatabasesResponseBodyDatabases setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeDatabasesResponseBodyDatabases setUsers(java.util.List<DescribeDatabasesResponseBodyDatabasesUsers> users) {
            this.users = users;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyDatabasesUsers> getUsers() {
            return this.users;
        }

    }

}
