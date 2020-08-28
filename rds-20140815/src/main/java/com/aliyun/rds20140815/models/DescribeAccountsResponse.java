// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SystemAdminAccountStatus")
    @Validation(required = true)
    public String systemAdminAccountStatus;

    @NameInMap("SystemAdminAccountFirstActivationTime")
    @Validation(required = true)
    public String systemAdminAccountFirstActivationTime;

    @NameInMap("Accounts")
    @Validation(required = true)
    public DescribeAccountsResponseAccounts accounts;

    public static DescribeAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponse self = new DescribeAccountsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("AccountPrivilege")
        @Validation(required = true)
        public String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        @Validation(required = true)
        public String accountPrivilegeDetail;

        public static DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege self = new DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges extends TeaModel {
        @NameInMap("DatabasePrivilege")
        @Validation(required = true)
        public java.util.List<DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege> databasePrivilege;

        public static DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges self = new DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAccountsResponseAccountsDBInstanceAccount extends TeaModel {
        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("AccountStatus")
        @Validation(required = true)
        public String accountStatus;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("AccountDescription")
        @Validation(required = true)
        public String accountDescription;

        @NameInMap("PrivExceeded")
        @Validation(required = true)
        public String privExceeded;

        @NameInMap("DatabasePrivileges")
        @Validation(required = true)
        public DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges databasePrivileges;

        public static DescribeAccountsResponseAccountsDBInstanceAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccountsDBInstanceAccount self = new DescribeAccountsResponseAccountsDBInstanceAccount();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAccountsResponseAccounts extends TeaModel {
        @NameInMap("DBInstanceAccount")
        @Validation(required = true)
        public java.util.List<DescribeAccountsResponseAccountsDBInstanceAccount> DBInstanceAccount;

        public static DescribeAccountsResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccounts self = new DescribeAccountsResponseAccounts();
            return TeaModel.build(map, self);
        }

    }

}
