// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Accounts")
    public DescribeHostAccountsResponseBodyAccounts accounts;

    public static DescribeHostAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAccountsResponseBody self = new DescribeHostAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHostAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostAccountsResponseBody setAccounts(DescribeHostAccountsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeHostAccountsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public static class DescribeHostAccountsResponseBodyAccountsAccounts extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        public static DescribeHostAccountsResponseBodyAccountsAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAccountsResponseBodyAccountsAccounts self = new DescribeHostAccountsResponseBodyAccountsAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeHostAccountsResponseBodyAccountsAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeHostAccountsResponseBodyAccountsAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeHostAccountsResponseBodyAccountsAccounts setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeHostAccountsResponseBodyAccountsAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeHostAccountsResponseBodyAccountsAccounts setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeHostAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeHostAccountsResponseBodyAccountsAccounts> accounts;

        public static DescribeHostAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAccountsResponseBodyAccounts self = new DescribeHostAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeHostAccountsResponseBodyAccounts setAccounts(java.util.List<DescribeHostAccountsResponseBodyAccountsAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeHostAccountsResponseBodyAccountsAccounts> getAccounts() {
            return this.accounts;
        }

    }

}
