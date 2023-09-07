// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    /**
     * <p>Details about databases.</p>
     */
    @NameInMap("Databases")
    public DescribeDatabasesResponseBodyDatabases databases;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

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

    public DescribeDatabasesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDatabasesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount extends TeaModel {
        /**
         * <p>The username of the account.</p>
         * <br>
         * <p>> A PolarDB for MySQL cluster does not support privileged accounts.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The permissions that are granted to the account. Valid values:</p>
         * <br>
         * <p>*   **ReadWrite**: read and write permissions</p>
         * <p>*   **ReadOnly**: read-only permissions</p>
         * <p>*   **DMLOnly**: The account is granted the permissions to execute only DML statements on the database.</p>
         * <p>*   **DDLOnly**: The account is granted the permissions to execute only DDL statements on the database.</p>
         * <p>*   **ReadIndex**: The account has the read and index permissions on the database.</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <p>The state of the account. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Available**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The authorization state of the account. Valid values:</p>
         * <br>
         * <p>*   **Empowering**: The system is granting permissions to the account.</p>
         * <p>*   **Empowered**: Permissions are granted to the account.</p>
         * <p>*   **Removing**: The system is revoking permissions from the account.</p>
         */
        @NameInMap("PrivilegeStatus")
        public String privilegeStatus;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount self = new DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setPrivilegeStatus(String privilegeStatus) {
            this.privilegeStatus = privilegeStatus;
            return this;
        }
        public String getPrivilegeStatus() {
            return this.privilegeStatus;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount> account;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAccounts self = new DescribeDatabasesResponseBodyDatabasesDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts setAccount(java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount> getAccount() {
            return this.account;
        }

    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabase extends TeaModel {
        /**
         * <p>Details about the accounts.</p>
         * <br>
         * <p>> A PolarDB for MySQL cluster does not support privileged accounts.</p>
         */
        @NameInMap("Accounts")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts;

        /**
         * <p>The character set that the database uses. For more information, see [Character set tables](~~99716~~).</p>
         */
        @NameInMap("CharacterSetName")
        public String characterSetName;

        /**
         * <p>The description of the database.</p>
         */
        @NameInMap("DBDescription")
        public String DBDescription;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The state of the database. Valid values:</p>
         * <br>
         * <p>*   **Creating**</p>
         * <p>*   **Running**</p>
         * <p>*   **Deleting**</p>
         */
        @NameInMap("DBStatus")
        public String DBStatus;

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <br>
         * <p>*   **MySQL**</p>
         * <p>*   **Oracle**</p>
         * <p>*   **PostgreSQL**</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The ID of the primary node in the cluster of Multi-master Cluster (Database/Table) Edition.</p>
         */
        @NameInMap("MasterID")
        public String masterID;

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

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
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

        public DescribeDatabasesResponseBodyDatabasesDatabase setMasterID(String masterID) {
            this.masterID = masterID;
            return this;
        }
        public String getMasterID() {
            return this.masterID;
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
