// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAccountsZonalResponseBody extends TeaModel {
    @NameInMap("Accounts")
    public java.util.List<DescribeAccountsZonalResponseBodyAccounts> accounts;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>155462B9-205F-4FFC-BB43-4855FE******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAccountsZonalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsZonalResponseBody self = new DescribeAccountsZonalResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsZonalResponseBody setAccounts(java.util.List<DescribeAccountsZonalResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<DescribeAccountsZonalResponseBodyAccounts> getAccounts() {
        return this.accounts;
    }

    public DescribeAccountsZonalResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeAccountsZonalResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeAccountsZonalResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountsZonalResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAccountsZonalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <strong>example:</strong>
         * <p>DBtest</p>
         */
        @NameInMap("DBName")
        public String DBName;

        public static DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges self = new DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

    public static class DescribeAccountsZonalResponseBodyAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <strong>example:</strong>
         * <p>UnLock</p>
         */
        @NameInMap("AccountLockState")
        public String accountLockState;

        /**
         * <strong>example:</strong>
         * <p>test_acc</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>undefined</p>
         */
        @NameInMap("AccountPasswordValidTime")
        public String accountPasswordValidTime;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("DatabasePrivileges")
        public java.util.List<DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges> databasePrivileges;

        public static DescribeAccountsZonalResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsZonalResponseBodyAccounts self = new DescribeAccountsZonalResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsZonalResponseBodyAccounts setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsZonalResponseBodyAccounts setAccountLockState(String accountLockState) {
            this.accountLockState = accountLockState;
            return this;
        }
        public String getAccountLockState() {
            return this.accountLockState;
        }

        public DescribeAccountsZonalResponseBodyAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsZonalResponseBodyAccounts setAccountPasswordValidTime(String accountPasswordValidTime) {
            this.accountPasswordValidTime = accountPasswordValidTime;
            return this;
        }
        public String getAccountPasswordValidTime() {
            return this.accountPasswordValidTime;
        }

        public DescribeAccountsZonalResponseBodyAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsZonalResponseBodyAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsZonalResponseBodyAccounts setDatabasePrivileges(java.util.List<DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges> databasePrivileges) {
            this.databasePrivileges = databasePrivileges;
            return this;
        }
        public java.util.List<DescribeAccountsZonalResponseBodyAccountsDatabasePrivileges> getDatabasePrivileges() {
            return this.databasePrivileges;
        }

    }

}
