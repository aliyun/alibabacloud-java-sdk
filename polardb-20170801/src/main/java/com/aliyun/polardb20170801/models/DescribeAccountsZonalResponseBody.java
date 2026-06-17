// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAccountsZonalResponseBody extends TeaModel {
    /**
     * <p>The details of the accounts.</p>
     */
    @NameInMap("Accounts")
    public java.util.List<DescribeAccountsZonalResponseBodyAccounts> accounts;

    /**
     * <p>The maximum number of entries returned in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If the results are not fully returned, this token is returned. You can use this token in the next request to retrieve the remaining results.</p>
     * 
     * <strong>example:</strong>
     * <p>212db86sca4384811e0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
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
         * <p>The permissions of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>ReadOnly</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <p>The name of the database.</p>
         * 
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
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The lock state of the account. Valid values:</p>
         * <ul>
         * <li><p>UnLock: The account is not locked.</p>
         * </li>
         * <li><p>Lock: The account is locked.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>UnLock</p>
         */
        @NameInMap("AccountLockState")
        public String accountLockState;

        /**
         * <p>The name of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test_acc</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The time when the password expires.</p>
         * 
         * <strong>example:</strong>
         * <p>undefined</p>
         */
        @NameInMap("AccountPasswordValidTime")
        public String accountPasswordValidTime;

        /**
         * <p>The status of the account. Valid values:</p>
         * <p>Creating: The account is being created.</p>
         * <p>Available: The account is active.</p>
         * <p>Deleting: The account is being deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The type of the account. Valid values:</p>
         * <ul>
         * <li><p>Normal: A standard account.</p>
         * </li>
         * <li><p>Super: A privileged account.</p>
         * </li>
         * <li><p>ReadOnly: A global read-only account.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The details of the database permissions that the account has.</p>
         */
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
