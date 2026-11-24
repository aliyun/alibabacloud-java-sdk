// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDatabaseZonalRequest extends TeaModel {
    /**
     * <p>The name of the account that is authorized to access the database.</p>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions of the account. Valid values:</p>
     * <ul>
     * <li>ReadWrite: read and write permissions</li>
     * <li>ReadOnly: read-only permissions</li>
     * <li>DMLOnly: DML-only permissions</li>
     * <li>DDLOnly: DDL-only permissions</li>
     * <li>ReadIndex: read-only and index permissions</li>
     * </ul>
     * <p>If this parameter is not specified, the default value is ReadWrite.</p>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The character set.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>utf8</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, and ensure that the value is unique across different requests. The value is case-sensitive and can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6000170000591aed949d0f54a343f1a4233c1e7d1c5c******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The locale setting used to specify the collation of the new database.</p>
     * 
     * <strong>example:</strong>
     * <p>C</p>
     */
    @NameInMap("Collate")
    public String collate;

    /**
     * <p>The locale setting used to specify the character classification of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>C</p>
     */
    @NameInMap("Ctype")
    public String ctype;

    /**
     * <p>The ID of the PolarDB on ENS edge cluster. Regular PolarDB cluster IDs are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the database. The description must meet the following requirements:</p>
     * <ul>
     * <li>cannot start with <code>http://</code> or <code>https://</code></li>
     * <li>must be 2 to 256 characters in length</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("DBDescription")
    public String DBDescription;

    /**
     * <p>The name of the database. The name must meet the following requirements:</p>
     * <ul>
     * <li>consists of lowercase letters, digits, hyphens (-), and underscores (_)</li>
     * <li>starts with a letter and ends with a letter or digit, and can be up to 64 characters in length</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
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

    public static CreateDatabaseZonalRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseZonalRequest self = new CreateDatabaseZonalRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseZonalRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateDatabaseZonalRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateDatabaseZonalRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public CreateDatabaseZonalRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDatabaseZonalRequest setCollate(String collate) {
        this.collate = collate;
        return this;
    }
    public String getCollate() {
        return this.collate;
    }

    public CreateDatabaseZonalRequest setCtype(String ctype) {
        this.ctype = ctype;
        return this;
    }
    public String getCtype() {
        return this.ctype;
    }

    public CreateDatabaseZonalRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDatabaseZonalRequest setDBDescription(String DBDescription) {
        this.DBDescription = DBDescription;
        return this;
    }
    public String getDBDescription() {
        return this.DBDescription;
    }

    public CreateDatabaseZonalRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateDatabaseZonalRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDatabaseZonalRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDatabaseZonalRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDatabaseZonalRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
