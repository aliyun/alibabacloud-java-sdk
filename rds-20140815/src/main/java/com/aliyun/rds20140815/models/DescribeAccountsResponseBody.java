// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeAccountsResponseBody extends TeaModel {
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

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

    public DescribeAccountsResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        public String accountPrivilegeDetail;

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
        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("AccountStatus")
        public String accountStatus;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("BypassRLS")
        public String bypassRLS;

        @NameInMap("CheckPolicy")
        public Boolean checkPolicy;

        @NameInMap("CreateDB")
        public String createDB;

        @NameInMap("CreateRole")
        public String createRole;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("DatabasePrivileges")
        public DescribeAccountsResponseBodyAccountsDBInstanceAccountDatabasePrivileges databasePrivileges;

        @NameInMap("PasswordExpireTime")
        public String passwordExpireTime;

        @NameInMap("PrivExceeded")
        public String privExceeded;

        @NameInMap("Replication")
        public String replication;

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

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setCheckPolicy(Boolean checkPolicy) {
            this.checkPolicy = checkPolicy;
            return this;
        }
        public Boolean getCheckPolicy() {
            return this.checkPolicy;
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

        public DescribeAccountsResponseBodyAccountsDBInstanceAccount setPasswordExpireTime(String passwordExpireTime) {
            this.passwordExpireTime = passwordExpireTime;
            return this;
        }
        public String getPasswordExpireTime() {
            return this.passwordExpireTime;
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
