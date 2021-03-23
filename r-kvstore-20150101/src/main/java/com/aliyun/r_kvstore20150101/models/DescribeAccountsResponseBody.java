// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Accounts")
    public DescribeAccountsResponseBodyAccounts accounts;

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountsResponseBody setAccounts(DescribeAccountsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeAccountsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public static class DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege extends TeaModel {
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        public static DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege self = new DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

    }

    public static class DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges extends TeaModel {
        @NameInMap("DatabasePrivilege")
        public java.util.List<DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege> databasePrivilege;

        public static DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges self = new DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges setDatabasePrivilege(java.util.List<DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege> databasePrivilege) {
            this.databasePrivilege = databasePrivilege;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountsAccountDatabasePrivilegesDatabasePrivilege> getDatabasePrivilege() {
            return this.databasePrivilege;
        }

    }

    public static class DescribeAccountsResponseBodyAccountsAccount extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("DatabasePrivileges")
        public DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges databasePrivileges;

        public static DescribeAccountsResponseBodyAccountsAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsAccount self = new DescribeAccountsResponseBodyAccountsAccount();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsAccount setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyAccountsAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseBodyAccountsAccount setDatabasePrivileges(DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges databasePrivileges) {
            this.databasePrivileges = databasePrivileges;
            return this;
        }
        public DescribeAccountsResponseBodyAccountsAccountDatabasePrivileges getDatabasePrivileges() {
            return this.databasePrivileges;
        }

    }

    public static class DescribeAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("Account")
        public java.util.List<DescribeAccountsResponseBodyAccountsAccount> account;

        public static DescribeAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccounts self = new DescribeAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccounts setAccount(java.util.List<DescribeAccountsResponseBodyAccountsAccount> account) {
            this.account = account;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountsAccount> getAccount() {
            return this.account;
        }

    }

}
