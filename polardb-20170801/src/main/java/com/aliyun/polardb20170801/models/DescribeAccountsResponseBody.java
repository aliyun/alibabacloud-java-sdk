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
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The request ID.</p>
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
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <p>The name of the database.</p>
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
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The locking state of the account. Valid values:</p>
         * <br>
         * <p>*   **UnLock**</p>
         * <p>*   **Lock**</p>
         */
        @NameInMap("AccountLockState")
        public String accountLockState;

        /**
         * <p>The name of the account.</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The validity period of the password.</p>
         */
        @NameInMap("AccountPasswordValidTime")
        public String accountPasswordValidTime;

        /**
         * <p>The state of the account. Valid values:</p>
         * <br>
         * <p>*   **Creating**: The account is being created.</p>
         * <p>*   **Available**: The account is available.</p>
         * <p>*   **Deleting**: The account is being deleted</p>
         */
        @NameInMap("AccountStatus")
        public String accountStatus;

        /**
         * <p>The type of the account. Valid values:</p>
         * <br>
         * <p>*   **Normal**: a standard account</p>
         * <p>*   **Super**: a privileged account</p>
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
