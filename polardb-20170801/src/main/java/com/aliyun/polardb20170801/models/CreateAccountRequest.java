// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateAccountRequest extends TeaModel {
    /**
     * <p>The description of the account. The description must meet the following requirements:</p>
     * <br>
     * <p>*   It cannot start with `http://` or `https://`.</p>
     * <p>*   It must be 2 to 256 characters in length.</p>
     */
    @NameInMap("AccountDescription")
    public String accountDescription;

    /**
     * <p>The name of the account. The name must meet the following requirements:</p>
     * <br>
     * <p>*   It must start with a lowercase letter and end with a letter or a digit.</p>
     * <p>*   It can contain lowercase letters, digits, and underscores (_).</p>
     * <p>*   It must be 2 to 16 characters in length.</p>
     * <p>*   It cannot be root, admin, or another username that is reserved by the system.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The password of the account. The password must meet the following requirements:</p>
     * <br>
     * <p>*   It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</p>
     * <p>*   It must be 8 to 32 characters in length.</p>
     * <p>*   Special characters include `! @ # $ % ^ & * ( ) _ + - =`</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AccountPassword")
    public String accountPassword;

    /**
     * <p>The permissions that are granted to the account. Valid values:</p>
     * <br>
     * <p>*   **ReadWrite**: read and write permissions</p>
     * <p>*   **ReadOnly**: read-only permissions</p>
     * <p>*   **DMLOnly**: the permissions to execute only DML statements</p>
     * <p>*   **DDLOnly**: the permissions to execute only DDL statements</p>
     * <p>*   **ReadIndex**: the read and index permissions</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   The `AccountPrivilege` parameter is valid only after you specify the `DBName` parameter.</p>
     * <br>
     * <p>*   If multiple database names are specified by the `DBName` parameter, you must grant permissions on the databases. Separate multiple permissions with commas (,). For example, if you want to grant the account the read and write permissions on DB1 and the read-only permissions on DB2, set `DBName` to `DB1,DB2`, and set `AccountPrivilege` to `ReadWrite,ReadOnly`.</p>
     * <p>*   This parameter is valid only for standard accounts of PolarDB for MySQL clusters.</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The type of the account. Valid values:</p>
     * <br>
     * <p>*   **Normal**: standard account</p>
     * <p>*   **Super**: privileged account</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you leave this parameter empty, the default value **Super** is used.</p>
     * <br>
     * <p>*   You can create multiple privileged accounts for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. A privileged account is granted more permissions than a standard account. For more information about how to create a database account, see [Create a database account](https://help.aliyun.com/document_detail/68508.html).</p>
     * <p>*   You can create only one privileged account for a PolarDB for MySQL cluster. A privileged account is granted more permissions than a standard account. For more information about how to create a database account, see [Create a database account](https://help.aliyun.com/document_detail/68508.html).</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of cluster.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The name of the database that can be accessed by the account. To enter multiple database names, separate the names with commas (,).</p>
     * <br>
     * <p>> This parameter is valid only for standard accounts of PolarDB for MySQL clusters.</p>
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
