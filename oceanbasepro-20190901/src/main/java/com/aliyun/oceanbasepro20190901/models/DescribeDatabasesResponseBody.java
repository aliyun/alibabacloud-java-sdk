// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    /**
     * <p>The list of databases in the tenant.</p>
     */
    @NameInMap("Databases")
    public java.util.List<DescribeDatabasesResponseBodyDatabases> databases;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of databases in the tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The name of the database table.</p>
         * 
         * <strong>example:</strong>
         * <p>testTables</p>
         */
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
        /**
         * <p>If you have granted custom privileges on the database, this parameter indicates the custom privileges, separated by commas (,). Otherwise, no data is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>select,delete,update</p>
         */
        @NameInMap("Privileges")
        public String privileges;

        /**
         * <p>The role of the account.<br>In MySQL mode, a role is a database-level role. Valid values:  </p>
         * <ul>
         * <li>ReadWrite: a role that has the read and write privileges, namely ALL PRIVILEGES.  </li>
         * <li>ReadOnly: a role that has only the read-only privilege SELECT.   </li>
         * <li>DDL: a role that has the DDL privileges such as CREATE, DROP, ALTER, SHOW VIEW, and CREATE VIEW.   </li>
         * <li>DML: a role that has the DML privileges such as SELECT, INSERT, UPDATE, DELETE, and SHOW VIEW.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>user_pay_ro</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The type of the account. Valid values:  </p>
         * <ul>
         * <li>Admin: the super administrator account. </li>
         * <li>Normal: a general account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("UserType")
        public String userType;

        public static DescribeDatabasesResponseBodyDatabasesUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesUsers self = new DescribeDatabasesResponseBodyDatabasesUsers();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesUsers setPrivileges(String privileges) {
            this.privileges = privileges;
            return this;
        }
        public String getPrivileges() {
            return this.privileges;
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
        /**
         * <p>The collation.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4_general_ci</p>
         */
        @NameInMap("Collation")
        public String collation;

        /**
         * <p>The time when the database was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-21 15:41:06</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The actual data size, in GB. </p>
         * <blockquote>
         * <p>Notice: This parameter is no longer used in later versions. RequiredSize is used instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5.67 GB</p>
         */
        @NameInMap("DataSize")
        public Double dataSize;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>sms_pre</p>
         */
        @NameInMap("DatabaseName")
        public String databaseName;

        /**
         * <p>The database type.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The description of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test db</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The encoding standard of the database. Encoding standards such as utf8mb4 and GBK are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The ID of the cluster to which the tenant belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>obsdh2f****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The storage space required, in GB.</p>
         * 
         * <strong>example:</strong>
         * <p>5.67 GB</p>
         */
        @NameInMap("RequiredSize")
        public Double requiredSize;

        /**
         * <p>The status of the database. Valid values:    </p>
         * <ul>
         * <li>ONLINE: The database is running.  </li>
         * <li>DELETING: The database is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of database tables.</p>
         */
        @NameInMap("Tables")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesTables> tables;

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>t33h8y08k****</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The name of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>tenantABC</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The list of accounts that are granted privileges on this database.</p>
         */
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

        public DescribeDatabasesResponseBodyDatabases setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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

        public DescribeDatabasesResponseBodyDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
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
