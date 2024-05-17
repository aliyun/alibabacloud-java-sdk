// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeRequest extends TeaModel {
    /**
     * <p>The username of the account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions that are granted to the account. Valid values:</p>
     * <br>
     * <p>*   **ReadWrite**: read and write permissions</p>
     * <p>*   **ReadOnly**: read-only permissions</p>
     * <p>*   **DMLOnly**: The account is granted the permissions to execute only DML statements on the database.</p>
     * <p>*   **DDLOnly**: The account is granted the permissions to execute only DDL statements on the database.</p>
     * <p>*   **ReadIndex**: The account has the read and index permissions on the database.</p>
     * <br>
     * <p>> The number of **AccountPrivilege** values must be the consistent with the number of **DBName** values. Each account permission must correspond to a database name in sequence. For example, you can set **DBName** to `testdb_1,testdb_2` and set **AccountPrivilege** to `ReadWrite,ReadOnly`. In this case, the specified standard account is granted the **read and write** permissions on the **testdb_1** database and the **read** permission on the **testdb_2** database.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The ID of the cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The names of the databases that the account can access. You can grant the access permissions on one or more databases to the specified standard account. If you need to specify multiple database names, separate the database names with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

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

    public GrantAccountPrivilegeRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GrantAccountPrivilegeRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public GrantAccountPrivilegeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GrantAccountPrivilegeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GrantAccountPrivilegeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GrantAccountPrivilegeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
