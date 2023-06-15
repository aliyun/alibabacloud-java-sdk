// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the information about databases.</p>
     */
    @NameInMap("Databases")
    public DescribeDatabasesResponseBodyDatabases databases;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The username of the account.</p>
         */
        @NameInMap("Account")
        public String account;

        /**
         * <p>The permissions that the account has on the database. Valid values:</p>
         * <br>
         * <p>*   **ReadWrite**: read and write permissions</p>
         * <p>*   **ReadOnly**: read-only permissions</p>
         * <p>*   **DMLOnly**: DML-only permissions</p>
         * <p>*   **DDLOnly**: DDL-only permissions</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <p>The details of the permissions that the account has on the database.</p>
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

    public static class DescribeDatabasesResponseBodyDatabasesDatabase extends TeaModel {
        /**
         * <p>An array that consists of the details of the accounts. Each account has specific permissions on the database.</p>
         */
        @NameInMap("Accounts")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts;

        /**
         * <p>The name of the character set.</p>
         */
        @NameInMap("CharacterSetName")
        public String characterSetName;

        /**
         * <p>The collation of the character set. The example value C stands for localization.</p>
         * <br>
         * <p>>  This parameter is returned only for instances that run PostgreSQL.</p>
         */
        @NameInMap("Collate")
        public String collate;

        /**
         * <p>The limit on the number of concurrent requests. The value -1 indicates that the number of concurrent requests is unlimited.</p>
         * <br>
         * <p>>  This parameter is returned only for instances that run PostgreSQL.</p>
         */
        @NameInMap("ConnLimit")
        public String connLimit;

        /**
         * <p>The type of the character set.</p>
         * <br>
         * <p>>  This parameter is returned only for instances that run PostgreSQL.</p>
         */
        @NameInMap("Ctype")
        public String ctype;

        /**
         * <p>The description of the database.</p>
         */
        @NameInMap("DBDescription")
        public String DBDescription;

        /**
         * <p>The ID of the instance to which the database belongs.</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The status of the database. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Running**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("DBStatus")
        public String DBStatus;

        /**
         * <p>The database engine of the instance to which the database belongs.</p>
         */
        @NameInMap("Engine")
        public String engine;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The reserved parameter.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The ID of the resource group.</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The tablespace of the database.</p>
         * <br>
         * <p>>  This parameter is returned only for instances that run PostgreSQL.</p>
         */
        @NameInMap("Tablespace")
        public String tablespace;

        /**
         * <p>The total number of entries returned.</p>
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
