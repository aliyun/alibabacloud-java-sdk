// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
    /**
     * <p>The details about the account.</p>
     */
    @NameInMap("Accounts")
    public DescribeAccountsResponseBodyAccounts accounts;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A2E94301-D07F-4457-9B49-6AA2BB388C85</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The first time when the system admin account was enabled. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
     * <blockquote>
     * <p> This parameter is returned only for instances that run SQL Server.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2020-02-06T11:00:00Z</p>
     */
    @NameInMap("SystemAdminAccountFirstActivationTime")
    public String systemAdminAccountFirstActivationTime;

    /**
     * <p>Indicates whether the system admin account was enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system admin account was enabled.</li>
     * <li><strong>false</strong>: The system admin account was disabled.</li>
     * </ul>
     * <blockquote>
     * <p> The <a href="https://help.aliyun.com/document_detail/170736.html">system admin account</a> is supported only for the instances that run SQL Server. If the instance runs SQL Server, a value is returned for this parameter. If the instance runs a different database engine, no value is returned for this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("SystemAdminAccountStatus")
    public String systemAdminAccountStatus;

    /**
     * <p>The total number of entries that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountsResponseBody self = new DescribeAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountsResponseBody setAccounts(DescribeAccountsResponseBodyAccounts accounts) {
        this.accounts = accounts;
        return this;
    }
    public DescribeAccountsResponseBodyAccounts getAccounts() {
        return this.accounts;
    }

    public DescribeAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountsResponseBody setSystemAdminAccountFirstActivationTime(String systemAdminAccountFirstActivationTime) {
        this.systemAdminAccountFirstActivationTime = systemAdminAccountFirstActivationTime;
        return this;
    }
    public String getSystemAdminAccountFirstActivationTime() {
        return this.systemAdminAccountFirstActivationTime;
    }

    public DescribeAccountsResponseBody setSystemAdminAccountStatus(String systemAdminAccountStatus) {
        this.systemAdminAccountStatus = systemAdminAccountStatus;
        return this;
    }
    public String getSystemAdminAccountStatus() {
        return this.systemAdminAccountStatus;
    }

    public DescribeAccountsResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege extends TeaModel {
        /**
         * <p>The type of the permissions. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read and write permissions.</li>
         * <li><strong>ReadOnly</strong>: read-only permissions.</li>
         * <li><strong>DDLOnly</strong>: DDL-only permissions.</li>
         * <li><strong>DMLOnly</strong>: DML-only permissions.</li>
         * <li><strong>Custom</strong>: custom permissions. You can modify the permissions of the account by using SQL commands.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <p>The permissions that are granted to the account. For more information, see <a href="https://help.aliyun.com/document_detail/146395.html">Account permissions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>SELECT,INSERT</p>
         */
        @NameInMap("AccountPrivilegeDetail")
        public String accountPrivilegeDetail;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("DBName")
        public String DBName;

        public static DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege self = new DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege setAccountPrivilegeDetail(String accountPrivilegeDetail) {
            this.accountPrivilegeDetail = accountPrivilegeDetail;
            return this;
        }
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

    public static class DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges extends TeaModel {
        @NameInMap("DatabasePrivilege")
        public java.util.List<DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege> databasePrivilege;

        public static DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges self = new DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges setDatabasePrivilege(java.util.List<DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege> databasePrivilege) {
            this.databasePrivilege = databasePrivilege;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivilegesDatabasePrivilege> getDatabasePrivilege() {
            return this.databasePrivilege;
        }

    }

    public static class DescribeAccountsResponseBodyAccountsDBInstanceAccount extends TeaModel {
        /**
         * <p>The description of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>Test account</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <p>The name of the database account.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>The status of the account. Valid values:</p>
         * <ul>
         * <li><strong>Unavailable</strong></li>
         * <li><strong>Available</strong></li>
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
         * <li><strong>Normal</strong>: standard account</li>
         * <li><strong>Super</strong>: privileged account</li>
         * <li><strong>Sysadmin</strong>: system admin account, which is supported only for instances running SQL Server</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>Indicates whether the account has the row-level security (RLS) permissions. Valid values:</p>
         * <ul>
         * <li><strong>t</strong>: The account has the RLS permissions.</li>
         * <li><strong>f</strong>: The account does not have the RLS permissions.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>f</p>
         */
        @NameInMap("BypassRLS")
        public String bypassRLS;

        /**
         * <p>Indicates whether the account has the permissions to create databases. Valid values:</p>
         * <ul>
         * <li><strong>t</strong>: The account has the permissions to create databases.</li>
         * <li><strong>f</strong>: The account does not have the permissions to create databases.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("CreateDB")
        public String createDB;

        /**
         * <p>Indicates whether the account has the permissions to create roles. Valid values:</p>
         * <ul>
         * <li><strong>t</strong>: The account has the permissions to create roles.</li>
         * <li><strong>f</strong>: The account does not have the permissions to create roles.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("CreateRole")
        public String createRole;

        /**
         * <p>The ID of the instance to which the account belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*****</p>
         */
        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        /**
         * <p>The details about the permissions that are granted to the account.</p>
         */
        @NameInMap("DatabasePrivileges")
        public DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges databasePrivileges;

        /**
         * <p>Indicates whether the number of databases that are managed by the account exceeds the upper limit. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: The number of databases that are managed by the account exceeds the upper limit.</li>
         * <li><strong>0</strong>: The number of databases that are managed by the account does not exceed the upper limit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PrivExceeded")
        public String privExceeded;

        /**
         * <p>Indicates whether the account has the replication permissions. Valid values:</p>
         * <ul>
         * <li><strong>t</strong>: The account has the replication permissions.</li>
         * <li><strong>f</strong>: The account does not have the replication permissions.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>t</p>
         */
        @NameInMap("Replication")
        public String replication;

        /**
         * <p>The expiration time of the password. Valid values:</p>
         * <ul>
         * <li><strong>infinity</strong>: The password never expires.</li>
         * <li><strong>Empty</strong>: The expiration time is not specified.</li>
         * <li><strong>Actual expiration time</strong>: in the format of <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z in UTC. Example: 2022-10-01T00:00:00Z.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for instances that run PostgreSQL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-10-01T00:00:00Z</p>
         */
        @NameInMap("ValidUntil")
        public String validUntil;

        public static DescribeAccountsResponseBodyAccountsDBInstanceAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccountsDBInstanceAccount self = new DescribeAccountsResponseBodyAccountsDBInstanceAccount();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setAccountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }
        public String getAccountStatus() {
            return this.accountStatus;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setBypassRLS(String bypassRLS) {
            this.bypassRLS = bypassRLS;
            return this;
        }
        public String getBypassRLS() {
            return this.bypassRLS;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setCreateDB(String createDB) {
            this.createDB = createDB;
            return this;
        }
        public String getCreateDB() {
            return this.createDB;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setCreateRole(String createRole) {
            this.createRole = createRole;
            return this;
        }
        public String getCreateRole() {
            return this.createRole;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setDatabasePrivileges(DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges databasePrivileges) {
            this.databasePrivileges = databasePrivileges;
            return this;
        }
        public DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges getDatabasePrivileges() {
            return this.databasePrivileges;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setPrivExceeded(String privExceeded) {
            this.privExceeded = privExceeded;
            return this;
        }
        public String getPrivExceeded() {
            return this.privExceeded;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setReplication(String replication) {
            this.replication = replication;
            return this;
        }
        public String getReplication() {
            return this.replication;
        }

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setValidUntil(String validUntil) {
            this.validUntil = validUntil;
            return this;
        }
        public String getValidUntil() {
            return this.validUntil;
        }

    }

    public static class DescribeAccountsResponseBodyAccounts extends TeaModel {
        @NameInMap("DBInstanceAccount")
        public java.util.List<DescribeAccountsResponseBodyAccountsDBInstanceAccount> DBInstanceAccount;

        public static DescribeAccountsResponseBodyAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountsResponseBodyAccounts self = new DescribeAccountsResponseBodyAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeAccountsResponseBodyAccounts setDBInstanceAccount(java.util.List<DescribeAccountsResponseBodyAccountsDBInstanceAccount> DBInstanceAccount) {
            this.DBInstanceAccount = DBInstanceAccount;
            return this;
        }
        public java.util.List<DescribeAccountsResponseBodyAccountsDBInstanceAccount> getDBInstanceAccount() {
            return this.DBInstanceAccount;
        }

    }

}
