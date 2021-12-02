// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class DescribeRdsAccountsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeRdsAccountsResponseBodyResult result;

    public static DescribeRdsAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRdsAccountsResponseBody self = new DescribeRdsAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRdsAccountsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeRdsAccountsResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DescribeRdsAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRdsAccountsResponseBody setResult(DescribeRdsAccountsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeRdsAccountsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges extends TeaModel {
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        public String accountPrivilegeDetail;

        @NameInMap("DBName")
        public String DBName;

        public static DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges self = new DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges setAccountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = accountPrivilegeDetail;
            return this;
        }
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

        public DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

    public static class DescribeRdsAccountsResponseBodyResultAccounts extends TeaModel {
        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DatabasePrivileges")
        public java.util.List<DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges> databasePrivileges;

        @NameInMap("PrivExceeded")
        public String privExceeded;

        public static DescribeRdsAccountsResponseBodyResultAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAccountsResponseBodyResultAccounts self = new DescribeRdsAccountsResponseBodyResultAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAccountsResponseBodyResultAccounts setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeRdsAccountsResponseBodyResultAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeRdsAccountsResponseBodyResultAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeRdsAccountsResponseBodyResultAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeRdsAccountsResponseBodyResultAccounts setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeRdsAccountsResponseBodyResultAccounts setDatabasePrivileges(java.util.List<DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges> databasePrivileges) {
            this.databasePrivileges = databasePrivileges;
            return this;
        }
        public java.util.List<DescribeRdsAccountsResponseBodyResultAccountsDatabasePrivileges> getDatabasePrivileges() {
            return this.databasePrivileges;
        }

        public DescribeRdsAccountsResponseBodyResultAccounts setPrivExceeded(String privExceeded) {
            this.privExceeded = privExceeded;
            return this;
        }
        public String getPrivExceeded() {
            return this.privExceeded;
        }

    }

    public static class DescribeRdsAccountsResponseBodyResult extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeRdsAccountsResponseBodyResultAccounts> accounts;

        public static DescribeRdsAccountsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeRdsAccountsResponseBodyResult self = new DescribeRdsAccountsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeRdsAccountsResponseBodyResult setAccounts(java.util.List<DescribeRdsAccountsResponseBodyResultAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeRdsAccountsResponseBodyResultAccounts> getAccounts() {
            return this.accounts;
        }

    }

}
