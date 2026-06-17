// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account. The description must meet the following requirements:</p>
     * <ul>
     * <li><p>It cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </li>
     * <li><p>It must be 2 to 256 characters in length.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testdes</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the database account. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>It must start with a lowercase letter and end with a letter or a digit.</p>
     * </li>
     * <li><p>It can contain lowercase letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>It must be 2 to 16 characters in length.</p>
     * </li>
     * <li><p>It cannot be a reserved keyword, such as root or admin.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the database account. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>It must be 8 to 32 characters in length.</p>
     * </li>
     * <li><p>The special characters are <code>!@#$%^&amp;*()_+-=</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test1111</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The privilege level to grant on the specified databases. Valid values:</p>
     * <ul>
     * <li><p><strong>ReadWrite</strong>: read and write permissions</p>
     * </li>
     * <li><p><strong>ReadOnly</strong>: read-only permissions</p>
     * </li>
     * <li><p><strong>DMLOnly</strong>: DML permissions only</p>
     * </li>
     * <li><p><strong>DDLOnly</strong>: DDL permissions only</p>
     * </li>
     * <li><p><strong>ReadIndex</strong>: read-only and index permissions</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when you specify the <code>DBName</code> parameter.</p>
     * </li>
     * <li><p>If you specify multiple databases in <code>DBName</code>, you must specify a corresponding permission for each in <code>AccountPrivilege</code>, separated by commas. The <code>AccountPrivilege</code> string cannot exceed 900 characters. For example, to grant read and write permissions to database DB1 and read-only permissions to database DB2, set <code>DBName</code> to <code>DB1,DB2</code> and set <code>AccountPrivilege</code> to <code>ReadWrite,ReadOnly</code>.</p>
     * </li>
     * <li><p>This parameter applies only to standard accounts on PolarDB for MySQL clusters.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The type of the account. Valid values:</p>
     * <ul>
     * <li><p><strong>Normal</strong>: a standard account.</p>
     * </li>
     * <li><p><strong>Super</strong>: a privileged account.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>If you do not specify this parameter, the system creates a <strong>Super</strong> account by default.</p>
     * </li>
     * <li><p>You can create multiple privileged accounts on PolarDB for PostgreSQL (Oracle-Compatible) and PolarDB for PostgreSQL clusters. A privileged account has more permissions than a standard account. For more information, see <a href="https://help.aliyun.com/document_detail/68508.html">Create database accounts</a>.</p>
     * </li>
     * <li><p>For a PolarDB for MySQL cluster, you can create only one privileged account. For more information, see <a href="https://help.aliyun.com/document_detail/68508.html">Create database accounts</a>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>A client-generated token to ensure request idempotency. The token must be unique across requests. It is case-sensitive and can be up to 64 ASCII characters long.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database that the account can access. To specify multiple databases, separate the database names with a comma (,).</p>
     * <blockquote>
     * <p>This parameter applies only to standard accounts on PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The type of the node. Valid values:</p>
     * <ul>
     * <li><strong>Search</strong>: For creating an account on a PolarDB Search node.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Search</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to grant the account permissions on all current and future databases in the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>0 or do not specify</strong>: The specified permissions are not granted to all databases.</p>
     * </li>
     * <li><p><strong>1</strong>: Grants the specified permissions to all current and future databases.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>This parameter takes effect only when you specify the <code>AccountPrivilege</code> parameter.</p>
     * </li>
     * <li><p>If you set this parameter to <code>1</code>, the permissions specified in <code>AccountPrivilege</code> are granted to all databases.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("PrivForAllDB")
    public String privForAllDB;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountRequest self = new CreateAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateAccountRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateAccountRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAccountRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAccountRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateAccountRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateAccountRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccountRequest setPrivForAllDB(String privForAllDB) {
        this.privForAllDB = privForAllDB;
        return this;
    }
    public String getPrivForAllDB() {
        return this.privForAllDB;
    }

    public CreateAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
