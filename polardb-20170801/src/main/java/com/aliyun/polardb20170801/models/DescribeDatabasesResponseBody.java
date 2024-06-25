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
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1DF8CA6-2300-448B-9ABF-760C4B******</p>
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
         * <blockquote>
         * <p>A PolarDB for MySQL cluster does not support privileged accounts.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_acc</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The permissions that are granted to the account. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write permissions</li>
         * <li><strong>ReadOnly</strong>: read-only permissions</li>
         * <li><strong>DMLOnly</strong>: The account is granted the permissions to execute only DML statements on the database.</li>
         * <li><strong>DDLOnly</strong>: The account is granted the permissions to execute only DDL statements on the database.</li>
         * <li><strong>ReadIndex</strong>: The account has the read and index permissions on the database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <p>The state of the account. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The authorization state of the account. Valid values:</p>
         * <ul>
         * <li><strong>Empowering</strong>: The system is granting permissions to the account.</li>
         * <li><strong>Empowered</strong>: Permissions are granted to the account.</li>
         * <li><strong>Removing</strong>: The system is revoking permissions from the account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Empowered</p>
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
         * <blockquote>
         * <p>A PolarDB for MySQL cluster does not support privileged accounts.</p>
         * </blockquote>
         */
        @NameInMap("Accounts")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts;

        /**
         * <p>The character set that the database uses. For more information, see <a href="https://help.aliyun.com/document_detail/99716.html">Character set tables</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("CharacterSetName")
        public String characterSetName;

        /**
         * <p>The description of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_des</p>
         */
        @NameInMap("DBDescription")
        public String DBDescription;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The state of the database. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong></li>
         * <li><strong>Running</strong></li>
         * <li><strong>Deleting</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("DBStatus")
        public String DBStatus;

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The ID of the primary node in the cluster of Multi-master Cluster (Database/Table) Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
