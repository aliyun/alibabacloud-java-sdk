// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

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

    public static class DescribeDatabasesResponseDatabasesDatabaseAccountsAccount extends TeaModel {
        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("AccountStatus")
        @Validation(required = true)
        public String accountStatus;

        @NameInMap("AccountPrivilege")
        @Validation(required = true)
        public String accountPrivilege;

        @NameInMap("PrivilegeStatus")
        @Validation(required = true)
        public String privilegeStatus;

        public static DescribeDatabasesResponseDatabasesDatabaseAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabasesDatabaseAccountsAccount self = new DescribeDatabasesResponseDatabasesDatabaseAccountsAccount();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDatabasesResponseDatabasesDatabaseAccounts extends TeaModel {
        @NameInMap("Account")
        @Validation(required = true)
        public java.util.List<DescribeDatabasesResponseDatabasesDatabaseAccountsAccount> account;

        public static DescribeDatabasesResponseDatabasesDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabasesDatabaseAccounts self = new DescribeDatabasesResponseDatabasesDatabaseAccounts();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeDatabasesResponseDatabasesDatabase extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("DBStatus")
        @Validation(required = true)
        public String DBStatus;

        @NameInMap("DBDescription")
        @Validation(required = true)
        public String DBDescription;

        @NameInMap("CharacterSetName")
        @Validation(required = true)
        public String characterSetName;

        @NameInMap("Engine")
        @Validation(required = true)
        public String engine;

        @NameInMap("Accounts")
        @Validation(required = true)
        public DescribeDatabasesResponseDatabasesDatabaseAccounts accounts;

        public static DescribeDatabasesResponseDatabasesDatabase build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabasesDatabase self = new DescribeDatabasesResponseDatabasesDatabase();
            return TeaModel.build(map, self);
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

    }

}
