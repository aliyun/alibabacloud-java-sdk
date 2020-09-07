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

    public DescribeAccountsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountsResponse setSystemAdminAccountStatus(String systemAdminAccountStatus) {
        this.systemAdminAccountStatus = systemAdminAccountStatus;
        return this;
    }
    public String getSystemAdminAccountStatus() {
        return this.systemAdminAccountStatus;
    }

    public DescribeAccountsResponse setSystemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
        this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
        return this;
    }
    public String getSystemAdminAccountFirstActivationTime() {
        return this.systemAdminAccountFirstActivationTime;
    }

    public DescribeAccountsResponse setAccounts(DescribeAccountsResponseAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeAccountsResponseAccounts getAccounts() {
        return this.accounts;
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

        public DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege setAccountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = accountPrivilegeDetail;
            return this;
        }
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
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

        public DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges setDatabasePrivilege(java.util.List<DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege> databasePrivilege) {
            this.databasePrivilege = databasePrivilege;
            return this;
        }
        public java.util.List<DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege> getDatabasePrivilege() {
            return this.databasePrivilege;
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

        public DescribeAccountsResponseAccountsDBInstanceAccount setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccount setPrivExceeded(String privExceeded) {
            this.privExceeded = privExceeded;
            return this;
        }
        public String getPrivExceeded() {
            return this.privExceeded;
        }

        public DescribeAccountsResponseAccountsDBInstanceAccount setDatabasePrivileges(DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges databasePrivileges) {
            this.databasePrivileges = databasePrivileges;
            return this;
        }
        public DescribeAccountsResponseAccountsDBInstanceAccountDatabasePrivileges getDatabasePrivileges() {
            return this.databasePrivileges;
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

        public DescribeAccountsResponseAccounts setDBInstanceAccount(java.util.List<DescribeAccountsResponseAccountsDBInstanceAccount> DBInstanceAccount) {
            this.DBInstanceAccount = DBInstanceAccount;
            return this;
        }
        public java.util.List<DescribeAccountsResponseAccountsDBInstanceAccount> getDBInstanceAccount() {
            return this.DBInstanceAccount;
        }

    }

}
