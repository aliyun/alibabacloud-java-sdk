// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    /**
     * <p>The information about the databases.</p>
     */
    @NameInMap("Databases")
    public DescribeDatabasesResponseBodyDatabases databases;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2603CA96-B17D-4903-BC04-61A2C829CD94</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponseBody self = new DescribeDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponseBody setDatabases(DescribeDatabasesResponseBodyDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDatabasesResponseBodyDatabases getDatabases() {
        return this.databases;
    }

    public DescribeDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo extends TeaModel {
        /**
         * <p>The account username.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The permissions that the account has on the database. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write permissions</li>
         * <li><strong>ReadOnly</strong>: read-only permissions</li>
         * <li><strong>DMLOnly</strong>: DML-only permissions</li>
         * <li><strong>DDLOnly</strong>: DDL-only permissions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DMLOnly</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <p>The permission that the account has on the database.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT</p>
         */
        @NameInMap("AccountPrivilegeDetail")
        public String accountPrivilegeDetail;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo setAccountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = accountPrivilegeDetail;
            return this;
        }
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAccounts extends TeaModel {
        @NameInMap("AccountPrivilegeInfo")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo> accountPrivilegeInfo;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAccounts self = new DescribeDatabasesResponseBodyDatabasesDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts setAccountPrivilegeInfo(java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo> accountPrivilegeInfo) {
            this.accountPrivilegeInfo = accountPrivilegeInfo;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccountPrivilegeInfo> getAccountPrivilegeInfo() {
            return this.accountPrivilegeInfo;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo extends TeaModel {
        @NameInMap("AdvancedDbProperty")
        public java.util.List<java.util.Map<String, ?>> advancedDbProperty;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo setAdvancedDbProperty(java.util.List<java.util.Map<String, ?>> advancedDbProperty) {
            this.advancedDbProperty = advancedDbProperty;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getAdvancedDbProperty() {
            return this.advancedDbProperty;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo extends TeaModel {
        @NameInMap("BasicDbProperty")
        public java.util.List<java.util.Map<String, ?>> basicDbProperty;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo setBasicDbProperty(java.util.List<java.util.Map<String, ?>> basicDbProperty) {
            this.basicDbProperty = basicDbProperty;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getBasicDbProperty() {
            return this.basicDbProperty;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo extends TeaModel {
        @NameInMap("RuntimeDbProperty")
        public java.util.List<java.util.Map<String, ?>> runtimeDbProperty;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo self = new DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo setRuntimeDbProperty(java.util.List<java.util.Map<String, ?>> runtimeDbProperty) {
            this.runtimeDbProperty = runtimeDbProperty;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getRuntimeDbProperty() {
            return this.runtimeDbProperty;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabase extends TeaModel {
        /**
         * <p>The information about the account. Each account has specific permissions on the database.</p>
         */
        @NameInMap("Accounts")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts;

        /**
         * <p>The advanced information about the database.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         */
        @NameInMap("AdvancedInfo")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo advancedInfo;

        /**
         * <p>The basic information about the database.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         */
        @NameInMap("BasicInfo")
        public DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo basicInfo;

        /**
         * <p>The name of the character set.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        @NameInMap("CharacterSetName")
        public String characterSetName;

        /**
         * <p>The collation of the character set. The example value C indicates localization.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>C</p>
         */
        @NameInMap("Collate")
        public String collate;

        /**
         * <p>The limit on the number of concurrent requests. The value -1 indicates that the number of concurrent requests is unlimited.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("ConnLimit")
        public String connLimit;

        /**
         * <p>The type of the character set.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>en_US.utf8</p>
         */
        @NameInMap("Ctype")
        public String ctype;

        /**
         * <p>The description of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DBDescription")
        public String DBDescription;

        /**
         * <p>The ID of the instance to which the database belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>testDB01</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The database status. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Deleting</strong></li>
         * <li><strong>Cold</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        @NameInMap("DBStatus")
        public String DBStatus;

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The runtime information about the database.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         */
        @NameInMap("RuntimeInfo")
        public DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo runtimeInfo;

        /**
         * <p>The database tablespace.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pg_default</p>
         */
        @NameInMap("Tablespace")
        public String tablespace;

        /**
         * <p>The total number of entries returned.</p>
         * <blockquote>
         * <p> This parameter is returned only for instances that run SQL Server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDatabasesResponseBodyDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabase self = new DescribeDatabasesResponseBodyDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setAccounts(DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts) {
            this.accounts = accounts;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts getAccounts() {
            return this.accounts;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setAdvancedInfo(DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo advancedInfo) {
            this.advancedInfo = advancedInfo;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseAdvancedInfo getAdvancedInfo() {
            return this.advancedInfo;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setBasicInfo(DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo basicInfo) {
            this.basicInfo = basicInfo;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseBasicInfo getBasicInfo() {
            return this.basicInfo;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setCollate(String collate) {
            this.collate = collate;
            return this;
        }
        public String getCollate() {
            return this.collate;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setConnLimit(String connLimit) {
            this.connLimit = connLimit;
            return this;
        }
        public String getConnLimit() {
            return this.connLimit;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setCtype(String ctype) {
            this.ctype = ctype;
            return this;
        }
        public String getCtype() {
            return this.ctype;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }
        public String getDBStatus() {
            return this.DBStatus;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setRuntimeInfo(DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo runtimeInfo) {
            this.runtimeInfo = runtimeInfo;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseRuntimeInfo getRuntimeInfo() {
            return this.runtimeInfo;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setTablespace(String tablespace) {
            this.tablespace = tablespace;
            return this;
        }
        public String getTablespace() {
            return this.tablespace;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabases extends TeaModel {
        @NameInMap("Database")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabase> database;

        public static DescribeDatabasesResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabases self = new DescribeDatabasesResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabases setDatabase(java.util.List<DescribeDatabasesResponseBodyDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
