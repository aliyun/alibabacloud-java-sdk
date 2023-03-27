// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeRequest extends TeaModel {
    /**
     * <p>The name of the account.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions that you want to grant to the account. The number of permissions must be the same as the number of databases that you specify for the DBName parameter. You can specify this parameter based on your business requirements. Valid values:</p>
     * <br>
     * <p>*   **ReadWrite**: read and write permissions</p>
     * <p>*   **ReadOnly**: read-only permissions</p>
     * <p>*   **DDLOnly**: DDL-only permissions</p>
     * <p>*   **DMLOnly**: DML-only permissions</p>
     * <p>*   **DBOwner**: database owner permissions</p>
     * <p>> *   If the instance runs MySQL or MariaDB, you can set this parameter to **ReadWrite**, **ReadOnly**, **DDLOnly**, or **DMLOnly**.</p>
     * <p>> *   If the instance runs SQL Server, you can set this parameter to **ReadWrite**, **ReadOnly**, or **DBOwner**.</p>
     * <p>> *   If the instance runs PostgreSQL with standard SSDs or enhanced SSDs (ESSDs), you can set this parameter only to **DBOwner**.</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database on which you want to grant permissions. Separate multiple database names with commas (,).</p>
     */
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static GrantAccountPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantAccountPrivilegeRequest self = new GrantAccountPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public GrantAccountPrivilegeRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GrantAccountPrivilegeRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public GrantAccountPrivilegeRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public GrantAccountPrivilegeRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GrantAccountPrivilegeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
