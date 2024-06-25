// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GrantAccountPrivilegeRequest extends TeaModel {
    /**
     * <p>The username of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions that are granted to the account. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write permissions</li>
     * <li><strong>ReadOnly</strong>: read-only permissions</li>
     * <li><strong>DMLOnly</strong>: The account is granted the permissions to execute only DML statements on the database.</li>
     * <li><strong>DDLOnly</strong>: The account is granted the permissions to execute only DDL statements on the database.</li>
     * <li><strong>ReadIndex</strong>: The account has the read and index permissions on the database.</li>
     * </ul>
     * <blockquote>
     * <p>The number of <strong>AccountPrivilege</strong> values must be the consistent with the number of <strong>DBName</strong> values. Each account permission must correspond to a database name in sequence. For example, you can set <strong>DBName</strong> to <code>testdb_1,testdb_2</code> and set <strong>AccountPrivilege</strong> to <code>ReadWrite,ReadOnly</code>. In this case, the specified standard account is granted the <strong>read and write</strong> permissions on the <strong>testdb_1</strong> database and the <strong>read</strong> permission on the <strong>testdb_2</strong> database.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite,ReadOnly</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The ID of the cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The names of the databases that the account can access. You can grant the access permissions on one or more databases to the specified standard account. If you need to specify multiple database names, separate the database names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testdb_1,testdb_2</p>
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
