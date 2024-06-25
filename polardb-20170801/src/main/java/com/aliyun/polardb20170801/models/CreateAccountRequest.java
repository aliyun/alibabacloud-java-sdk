// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account. The description must meet the following requirements:</p>
     * <ul>
     * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It must be 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testdes</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the account. The name must meet the following requirements:</p>
     * <ul>
     * <li>It must start with a lowercase letter and end with a letter or a digit.</li>
     * <li>It can contain lowercase letters, digits, and underscores (_).</li>
     * <li>It must be 2 to 16 characters in length.</li>
     * <li>It cannot be root, admin, or another username that is reserved by the system.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account. The password must meet the following requirements:</p>
     * <ul>
     * <li>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>It must be 8 to 32 characters in length.</li>
     * <li>Special characters include <code>! @ # $ % ^ &amp; * ( ) _ + - =</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test1111</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The permissions that are granted to the account. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write permissions</li>
     * <li><strong>ReadOnly</strong>: read-only permissions</li>
     * <li><strong>DMLOnly</strong>: the permissions to execute only DML statements</li>
     * <li><strong>DDLOnly</strong>: the permissions to execute only DDL statements</li>
     * <li><strong>ReadIndex</strong>: the read and index permissions</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The <code>AccountPrivilege</code> parameter is valid only after you specify the <code>DBName</code> parameter.</p>
     * </li>
     * <li><p>If multiple database names are specified by the <code>DBName</code> parameter, you must grant permissions on the databases. Separate multiple permissions with commas (,). For example, if you want to grant the account the read and write permissions on DB1 and the read-only permissions on DB2, set <code>DBName</code> to <code>DB1,DB2</code>, and set <code>AccountPrivilege</code> to <code>ReadWrite,ReadOnly</code>.</p>
     * </li>
     * <li><p>This parameter is valid only for standard accounts of PolarDB for MySQL clusters.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The type of the account. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: standard account</li>
     * <li><strong>Super</strong>: privileged account</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you leave this parameter empty, the default value <strong>Super</strong> is used.</p>
     * </li>
     * <li><p>You can create multiple privileged accounts for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. A privileged account is granted more permissions than a standard account. For more information about how to create a database account, see <a href="https://help.aliyun.com/document_detail/68508.html">Create a database account</a>.</p>
     * </li>
     * <li><p>You can create only one privileged account for a PolarDB for MySQL cluster. A privileged account is granted more permissions than a standard account. For more information about how to create a database account, see <a href="https://help.aliyun.com/document_detail/68508.html">Create a database account</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database that can be accessed by the account. To enter multiple database names, separate the names with commas (,).</p>
     * <blockquote>
     * <p>This parameter is valid only for standard accounts of PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

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
