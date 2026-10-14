// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountZonalRequest extends TeaModel {
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
     * <p>The name of the account. The name must meet the following requirements:</p>
     * <ul>
     * <li><p>It must start with a lowercase letter and end with a letter or a digit.</p>
     * </li>
     * <li><p>It can contain lowercase letters, digits, and underscores (_).</p>
     * </li>
     * <li><p>It must be 2 to 16 characters in length.</p>
     * </li>
     * <li><p>It cannot be a reserved username, such as root or admin.</p>
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
     * <p>The password of the account. The password must meet the following requirements:</p>
     * <ul>
     * <li><p>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * </li>
     * <li><p>It must be 8 to 32 characters in length.</p>
     * </li>
     * <li><p>Special characters include <code>!@#$%^&amp;*()_+-=</code>.</p>
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
     * <p>The permissions of the account. Valid values:</p>
     * <ul>
     * <li><p>ReadWrite: read and write permissions</p>
     * </li>
     * <li><p>ReadOnly: read-only permissions</p>
     * </li>
     * <li><p>DMLOnly: DML-only permissions</p>
     * </li>
     * <li><p>DDLOnly: DDL-only permissions</p>
     * </li>
     * <li><p>ReadIndex: read and index permissions</p>
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
     * <li><p>Normal: standard account</p>
     * </li>
     * <li><p>Super: privileged account</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and is case-sensitive. It can contain a maximum of 64 ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>Note: Only edge cluster (Zonal) IDs are supported. You can query them by calling the DescribeDBClustersZonal operation. Standard PolarDB cluster IDs returned by DescribeDBClusters cannot be used for this API operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The names of the databases that the account is authorized to access. You can specify multiple database names separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The node type.</p>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Specifies whether to grant the account permissions on all existing databases and all databases to be created in the cluster. Valid values:</p>
     * <ul>
     * <li><p>0 or empty: no</p>
     * </li>
     * <li><p>1: yes</p>
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

    public static CreateAccountZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountZonalRequest self = new CreateAccountZonalRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccountZonalRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

    public CreateAccountZonalRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateAccountZonalRequest setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }
    public String getAccountPassword() {
        return this.accountPassword;
    }

    public CreateAccountZonalRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateAccountZonalRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public CreateAccountZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAccountZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateAccountZonalRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateAccountZonalRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CreateAccountZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateAccountZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccountZonalRequest setPrivForAllDB(String privForAllDB) {
        this.privForAllDB = privForAllDB;
        return this;
    }
    public String getPrivForAllDB() {
        return this.privForAllDB;
    }

    public CreateAccountZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccountZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
