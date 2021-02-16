// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("Databases")
    public DescribeDatabasesResponseBodyDatabases databases;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponseBody self = new DescribeDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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

    public DescribeDatabasesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount extends TeaModel {
        @NameInMap("PrivilegeStatus")
        public String privilegeStatus;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount self = new DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setPrivilegeStatus(String privilegeStatus) {
            this.privilegeStatus = privilegeStatus;
            return this;
        }
        public String getPrivilegeStatus() {
            return this.privilegeStatus;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabaseAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
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
        @NameInMap("DBDescription")
        public String DBDescription;

        @NameInMap("DBStatus")
        public String DBStatus;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("CharacterSetName")
        public String characterSetName;

        @NameInMap("Accounts")
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts;

        public static DescribeDatabasesResponseBodyDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseBodyDatabasesDatabase self = new DescribeDatabasesResponseBodyDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }
        public String getDBStatus() {
            return this.DBStatus;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public DescribeDatabasesResponseBodyDatabasesDatabase setAccounts(DescribeDatabasesResponseBodyDatabasesDatabaseAccounts accounts) {
            this.accounts = accounts;
            return this;
        }
        public DescribeDatabasesResponseBodyDatabasesDatabaseAccounts getAccounts() {
            return this.accounts;
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
