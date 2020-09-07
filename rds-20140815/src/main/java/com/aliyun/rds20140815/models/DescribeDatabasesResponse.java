// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDatabasesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Databases")
    @Validation(required = true)
    public DescribeDatabasesResponseDatabases databases;

    public static DescribeDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDatabasesResponse self = new DescribeDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDatabasesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDatabasesResponse setDatabases(DescribeDatabasesResponseDatabases databases) {
        this.databases = databases;
        return this;
    }
    public DescribeDatabasesResponseDatabases getDatabases() {
        return this.databases;
    }

    public static class DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo extends TeaModel {
        @NameInMap("Account")
        @Validation(required = true)
        public String account;

        @NameInMap("AccountPrivilege")
        @Validation(required = true)
        public String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        @Validation(required = true)
        public String accountPrivilegeDetail;

        public static DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo self = new DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo setAccountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = accountPrivilegeDetail;
            return this;
        }
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

    }

    public static class DescribeDatabasesResponseDatabasesDatabaseAccounts extends TeaModel {
        @NameInMap("AccountPrivilegeInfo")
        @Validation(required = true)
        public java.util.List<DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo> accountPrivilegeInfo;

        public static DescribeDatabasesResponseDatabasesDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabasesDatabaseAccounts self = new DescribeDatabasesResponseDatabasesDatabaseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseDatabasesDatabaseAccounts setAccountPrivilegeInfo(java.util.List<DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo> accountPrivilegeInfo) {
            this.accountPrivilegeInfo = accountPrivilegeInfo;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo> getAccountPrivilegeInfo() {
            return this.accountPrivilegeInfo;
        }

    }

    public static class DescribeDatabasesResponseDatabasesDatabase extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("DBStatus")
        @Validation(required = true)
        public String DBStatus;

        @NameInMap("CharacterSetName")
        @Validation(required = true)
        public String characterSetName;

        @NameInMap("DBDescription")
        @Validation(required = true)
        public String DBDescription;

        @NameInMap("Accounts")
        @Validation(required = true)
        public DescribeDatabasesResponseDatabasesDatabaseAccounts accounts;

        public static DescribeDatabasesResponseDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabasesDatabase self = new DescribeDatabasesResponseDatabasesDatabase();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseDatabasesDatabase setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeDatabasesResponseDatabasesDatabase setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeDatabasesResponseDatabasesDatabase setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDatabasesResponseDatabasesDatabase setDBStatus(String DBStatus) {
            this.DBStatus = DBStatus;
            return this;
        }
        public String getDBStatus() {
            return this.DBStatus;
        }

        public DescribeDatabasesResponseDatabasesDatabase setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public DescribeDatabasesResponseDatabasesDatabase setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public DescribeDatabasesResponseDatabasesDatabase setAccounts(DescribeDatabasesResponseDatabasesDatabaseAccounts accounts) {
            this.accounts = accounts;
            return this;
        }
        public DescribeDatabasesResponseDatabasesDatabaseAccounts getAccounts() {
            return this.accounts;
        }

    }

    public static class DescribeDatabasesResponseDatabases extends TeaModel {
        @NameInMap("Database")
        @Validation(required = true)
        public java.util.List<DescribeDatabasesResponseDatabasesDatabase> database;

        public static DescribeDatabasesResponseDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabases self = new DescribeDatabasesResponseDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeDatabasesResponseDatabases setDatabase(java.util.List<DescribeDatabasesResponseDatabasesDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<DescribeDatabasesResponseDatabasesDatabase> getDatabase() {
            return this.database;
        }

    }

}
