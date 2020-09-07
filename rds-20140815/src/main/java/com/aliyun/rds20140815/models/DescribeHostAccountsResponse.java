// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeHostAccountsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Accounts")
    @Validation(required = true)
    public DescribeHostAccountsResponseAccounts accounts;

    public static DescribeHostAccountsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAccountsResponse self = new DescribeHostAccountsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeHostAccountsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHostAccountsResponse setAccounts(DescribeHostAccountsResponseAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeHostAccountsResponseAccounts getAccounts() {
        return this.accounts;
    }

    public static class DescribeHostAccountsResponseAccountsAccounts extends TeaModel {
        @NameInMap("AccountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("AccountType")
        @Validation(required = true)
        public String accountType;

        @NameInMap("AccountDescription")
        @Validation(required = true)
        public String accountDescription;

        @NameInMap("AccountStatus")
        @Validation(required = true)
        public String accountStatus;

        @NameInMap("DBInstanceId")
        @Validation(required = true)
        public String DBInstanceId;

        public static DescribeHostAccountsResponseAccountsAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAccountsResponseAccountsAccounts self = new DescribeHostAccountsResponseAccountsAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeHostAccountsResponseAccountsAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeHostAccountsResponseAccountsAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeHostAccountsResponseAccountsAccounts setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeHostAccountsResponseAccountsAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeHostAccountsResponseAccountsAccounts setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

    }

    public static class DescribeHostAccountsResponseAccounts extends TeaModel {
        @NameInMap("Accounts")
        @Validation(required = true)
        public java.util.List<DescribeHostAccountsResponseAccountsAccounts> accounts;

        public static DescribeHostAccountsResponseAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeHostAccountsResponseAccounts self = new DescribeHostAccountsResponseAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeHostAccountsResponseAccounts setAccounts(java.util.List<DescribeHostAccountsResponseAccountsAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeHostAccountsResponseAccountsAccounts> getAccounts() {
            return this.accounts;
        }

    }

}
