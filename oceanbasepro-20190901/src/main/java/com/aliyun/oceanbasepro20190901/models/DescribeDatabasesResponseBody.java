// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<DescribeDatabasesResponseBodyDatabases> databases;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Role")
        public String role;

        @NameInMap("UserName")
        public String userName;

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
        @NameInMap("Collation")
        public String collation;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DataSize")
        public Double dataSize;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("RequiredSize")
        public Double requiredSize;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tables")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesTables> tables;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("Users")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesUsers> users;

        public static DescribeDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabases self = new DescribeDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabases setCollation(String collation) {
            this.collation = collation;
            return this;
        }
        public String getCollation() {
            return this.collation;
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
