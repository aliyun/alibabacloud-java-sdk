// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The name of the account that is authorized to access the database. You can call the [DescribeAccounts](~~98107~~) operation to query account information.</p>
     * <p>>- You can specify only a standard account. By default, privileged accounts have all permissions on all databases. You do not need to grant privileged accounts the permissions to access the database.</p>
     * <p>>- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions that are granted to the account. Valid values:</p>
     * <br>
     * <p>*   **ReadWrite**: read and write permissions.</p>
     * <p>*   **ReadOnly**: read-only permissions.</p>
     * <p>*   **DMLOnly**: the permissions to execute only DML statements.</p>
     * <p>*   **DDLOnly**: the permissions to execute only DDL statements.</p>
     * <p>*   **ReadIndex**: the read-only and index permissions.</p>
     * <br>
     * <p>If you leave this parameter empty, the default value **ReadWrite** is used.</p>
     * <br>
     * <p>>- This parameter is valid only if you specify **AccountName**.</p>
     * <p>>- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</p>
     * <p>>- This parameter is optional for PolarDB for MySQL clusters.</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The character set that is used by the cluster. For more information, see [Character set tables](~~99716~~).</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <p>The language that indicates the collation of the databases that are created.</p>
     * <br>
     * <p>> *   The language must be compatible with the character set that is specified by **CharacterSetName**.</p>
     * <p>>*   This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is not supported by PolarDB for MySQL clusters.</p>
     * <br>
     * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose **Settings and Management** > **Databases**. Then, click **Create Database**.</p>
     */
    @NameInMap("Collate")
    public String collate;

    /**
     * <p>The language that indicates the character type of the database.</p>
     * <br>
     * <p>>- The language must be compatible with the character set that is specified by **CharacterSetName**.</p>
     * <p>>- The value that you specify must be the same as the value of **Collate**.</p>
     * <p>>- This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</p>
     * <br>
     * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose **Settings and Management** > **Databases**. Then, click **Create Database**.</p>
     */
    @NameInMap("Ctype")
    public String ctype;

    /**
     * <p>The ID of cluster.</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The description of the database. The description must meet the following requirements:</p>
     * <br>
     * <p>*   It cannot start with `http://` or `https://`.</p>
     * <p>*   It must be 2 to 256 characters in length.</p>
     * <br>
     * <p>> This parameter is required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. This parameter is optional for a PolarDB for MySQL cluster.</p>
     */
    @NameInMap("DBDescription")
    public String DBDescription;

    /**
     * <p>The name of the database. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name can contain lowercase letters, digits, hyphens (-), and underscores (\_).</p>
     * <p>*   The name must start with a lowercase letter and end with a lowercase letter or a digit. The name must be 1 to 64 characters in length.</p>
     * <br>
     * <p>> Do not use reserved words as database names, such as `test` or `mysql`.</p>
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

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public CreateDatabaseRequest setAccountPrivilege(String accountPrivilege) {
        this.accountPrivilege = accountPrivilege;
        return this;
    }
    public String getAccountPrivilege() {
        return this.accountPrivilege;
    }

    public CreateDatabaseRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    public CreateDatabaseRequest setCollate(String collate) {
        this.collate = collate;
        return this;
    }
    public String getCollate() {
        return this.collate;
    }

    public CreateDatabaseRequest setCtype(String ctype) {
        this.ctype = ctype;
        return this;
    }
    public String getCtype() {
        return this.ctype;
    }

    public CreateDatabaseRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateDatabaseRequest setDBDescription(String DBDescription) {
        this.DBDescription = DBDescription;
        return this;
    }
    public String getDBDescription() {
        return this.DBDescription;
    }

    public CreateDatabaseRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public CreateDatabaseRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateDatabaseRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDatabaseRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDatabaseRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
