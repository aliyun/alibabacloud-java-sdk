// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account. The description must meet the following requirements:</p>
     * <ul>
     * <li>Cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>Is 2 to 256 characters in length.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testdes</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The account name. The name must meet the following requirements:</p>
     * <ul>
     * <li>Starts with a lowercase letter and ends with a letter or digit.</li>
     * <li>Contains only lowercase letters, digits, or underscores (_).</li>
     * <li>Is 2 to 16 characters in length.</li>
     * <li>Cannot use certain reserved usernames such as root or admin.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The account password. The password must meet the following requirements:</p>
     * <ul>
     * <li>Contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
     * <li>Is 8 to 32 characters in length.</li>
     * <li>Special characters include <code>!@#$%^&amp;*()_+-=</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test1111</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The permissions of the account. Valid values: </p>
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write</li>
     * <li><strong>ReadOnly</strong>: read-only</li>
     * <li><strong>DMLOnly</strong>: DML only</li>
     * <li><strong>DDLOnly</strong>: DDL only</li>
     * <li><strong>ReadIndex</strong>: read-only and index</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>The DBName parameter must be specified for AccountPrivilege to take effect.</li>
     * <li>If you specify multiple database names for the DBName parameter, you must grant the corresponding permissions to each database. Separate multiple permissions with commas (,) and make sure that the total length of the AccountPrivilege string does not exceed 900 characters. For example, to grant read and write permissions on database DB1 and read-only permissions on database DB2, set DBName to <code>DB1,DB2</code> and set AccountPrivilege to <code>ReadWrite,ReadOnly</code>.</li>
     * <li>This parameter is supported only for standard accounts of PolarDB for MySQL clusters.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The account type. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: standard account. </li>
     * <li><strong>Super</strong>: privileged account. </li>
     * <li><strong>DynamoDB</strong>: DynamoDB account.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If this parameter is left empty, a <strong>Super</strong> account is created by default.</li>
     * <li>If the cluster is a PolarDB for PostgreSQL (Compatible with Oracle) or PolarDB for PostgreSQL cluster, you can create multiple privileged accounts for each cluster. Privileged accounts have more permissions than standard accounts. For more information, see <a href="https://help.aliyun.com/document_detail/68508.html">Create a database account</a>.</li>
     * <li>If the cluster is a PolarDB for MySQL cluster, you can create at most one privileged account for each cluster. Privileged accounts have more permissions than standard accounts. For more information, see <a href="https://help.aliyun.com/document_detail/68508.html">Create a database account</a>.</li>
     * <li>DynamoDB accounts are dedicated accounts created for the DynamoDB compatibility feature of PolarDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/2979941.html">DynamoDB usage instructions</a>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value. Make sure that the value is unique among different requests. The token is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
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
     * <p>The name of the database that the account is authorized to access. You can specify multiple database names separated by commas (,).</p>
     * <blockquote>
     * <p>This parameter is supported only for standard accounts of PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li>Search: required when creating an account for a PolarDB Search node</li>
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
     * <p>Specifies whether to grant permissions on all existing databases and all new databases in the current cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>0 or empty</strong>: does not grant permissions.</p>
     * </li>
     * <li><p><strong>1</strong>: grants permissions.</p>
     * <blockquote>
     * <ul>
     * <li>The AccountPrivilege parameter must be specified for this parameter to take effect.</li>
     * <li>If this parameter is set to <code>1</code>, the permissions specified by AccountPrivilege are granted on all databases.</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
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
