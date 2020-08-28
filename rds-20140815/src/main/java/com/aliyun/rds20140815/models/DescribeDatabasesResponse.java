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

    }

    public static class DescribeDatabasesResponseDatabasesDatabaseAccounts extends TeaModel {
        @NameInMap("AccountPrivilegeInfo")
        @Validation(required = true)
        public java.util.List<DescribeDatabasesResponseDatabasesDatabaseAccountsAccountPrivilegeInfo> accountPrivilegeInfo;

        public static DescribeDatabasesResponseDatabasesDatabaseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDatabasesResponseDatabasesDatabaseAccounts self = new DescribeDatabasesResponseDatabasesDatabaseAccounts();
            return TeaModel.build(map, self);
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
