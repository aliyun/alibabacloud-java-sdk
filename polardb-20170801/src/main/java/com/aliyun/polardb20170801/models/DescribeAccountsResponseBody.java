// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    /**
     * <p>The details of the account.</p>
     */
    @NameInMap("Accounts")
    public java.util.List<DescribeAccountsResponseBodyAccounts> accounts;

    /**
     * <p>The page number of the page returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
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

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setAccounts(java.util.List<DescribeAccountsResponseBodyAccounts> accounts) {
        this.accounts = accounts;
        return this;
    }
    public java.util.List<DescribeAccountsResponseBodyAccounts> getAccounts() {
        return this.accounts;
    }

    public DescribeAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountsResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAccountsResponseBodyAccountsDatabasePrivileges extends TeaModel {
        /**
         * <p>The permissions that the account is granted on the database. Valid values:</p>
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

        public static DescribeAccountsResponseBodyAccountsDatabasePrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsDatabasePrivileges self = new DescribeAccountsResponseBodyAccountsDatabasePrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsDatabasePrivileges setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeAccountsResponseBodyAccountsDatabasePrivileges setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

    public static class DescribeAccountsResponseBodyAccounts extends TeaModel {
        /**
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The locking state of the account. Valid values:</p>
         * <ul>
         * <li><strong>UnLock</strong></li>
         * <li><strong>Lock</strong></li>
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
         * <p>The validity period of the password.</p>
         * 
         * <strong>example:</strong>
         * <p>undefined</p>
         */
        @NameInMap("AccountPasswordValidTime")
        public String accountPasswordValidTime;

        /**
         * <p>The state of the account. Valid values:</p>
         * <ul>
         * <li><strong>Creating</strong>: The account is being created.</li>
         * <li><strong>Available</strong>: The account is available.</li>
         * <li><strong>Deleting</strong>: The account is being deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The type of the account. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: a standard account</li>
         * <li><strong>Super</strong>: a privileged account</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The list of database permissions that are granted to the account.</p>
         */
        @NameInMap("DatabasePrivileges")
        public java.util.List<DescribeAccountsResponseBodyAccountsDatabasePrivileges> databasePrivileges;

        public static DescribeAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccounts self = new DescribeAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccounts setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseBodyAccounts setAccountLockState(String accountLockState) {
            this.accountLockState = accountLockState;
            return this;
        }
        public String getAccountLockState() {
            return this.accountLockState;
        }

        public DescribeAccountsResponseBodyAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseBodyAccounts setAccountPasswordValidTime(String accountPasswordValidTime) {
            this.accountPasswordValidTime = accountPasswordValidTime;
            return this;
        }
        public String getAccountPasswordValidTime() {
            return this.accountPasswordValidTime;
        }

        public DescribeAccountsResponseBodyAccounts setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseBodyAccounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyAccounts setDatabasePrivileges(java.util.List<DescribeAccountsResponseBodyAccountsDatabasePrivileges> databasePrivileges) {
            this.databasePrivileges = databasePrivileges;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountsDatabasePrivileges> getDatabasePrivileges() {
            return this.databasePrivileges;
        }

    }

}
