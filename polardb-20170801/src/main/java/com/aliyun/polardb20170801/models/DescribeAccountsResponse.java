// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Accounts")
    @Validation(required = true)
    public java.util.List<DescribeAccountsResponseAccounts> accounts;

    public static DescribeAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponse self = new DescribeAccountsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeAccountsResponseAccountsDatabasePrivileges extends TeaModel {
        @NameInMap("DBName")
        @Validation(required = true)
        public String DBName;

        @NameInMap("AccountPrivilege")
        @Validation(required = true)
        public String accountPrivilege;

        public static DescribeAccountsResponseAccountsDatabasePrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccountsDatabasePrivileges self = new DescribeAccountsResponseAccountsDatabasePrivileges();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeAccountsResponseAccounts extends TeaModel {
        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("AccountStatus")
        @Validation(required = true)
        public String accountStatus;

        @NameInMap("AccountDescription")
        @Validation(required = true)
        public String accountDescription;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("AccountLockState")
        @Validation(required = true)
        public String accountLockState;

        @NameInMap("PrivilegeExceeded")
        @Validation(required = true)
        public String privilegeExceeded;

        @NameInMap("AccountPasswordValidTime")
        @Validation(required = true)
        public String accountPasswordValidTime;

        @NameInMap("DatabasePrivileges")
        @Validation(required = true)
        public java.util.List<DescribeAccountsResponseAccountsDatabasePrivileges> databasePrivileges;

        public static DescribeAccountsResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseAccounts self = new DescribeAccountsResponseAccounts();
            return TeaModel.build(map, self);
        }

    }

}
