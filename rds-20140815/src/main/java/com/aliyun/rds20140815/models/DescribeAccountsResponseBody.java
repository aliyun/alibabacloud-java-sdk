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
     * <p>17F2EA6C-3CA2-528D-A263-DC29707AD652</p>
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
     * <p>The time when the super administrator (SA) account was first activated. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>This parameter is returned only for ApsaraDB RDS for SQL Server instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2023-10-17T07:51:22Z</p>
     */
    @NameInMap("SystemAdminAccountFirstActivationTime")
    public String systemAdminAccountFirstActivationTime;

    /**
     * <p>Indicates whether the super administrator (SA) account is activated. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: Activated.</li>
     * <li><strong>False</strong>: Not activated.</li>
     * </ul>
     * <blockquote>
     * <p>Only ApsaraDB RDS for SQL Server instances support the <a href="https://help.aliyun.com/document_detail/170736.html">super administrator (SA) account</a>, and this parameter has a return value. For instances of other engines, the return value is empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("SystemAdminAccountStatus")
    public String systemAdminAccountStatus;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
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
