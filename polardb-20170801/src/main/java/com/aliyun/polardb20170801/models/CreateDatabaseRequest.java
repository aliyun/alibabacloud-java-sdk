// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The name of the account that is authorized to access the database. You can call the <a href="https://help.aliyun.com/document_detail/98107.html">DescribeAccounts</a> operation to query account information.</p>
     * <blockquote>
     * <ul>
     * <li>You can specify only a standard account. By default, privileged accounts have all permissions on all databases. You do not need to grant privileged accounts the permissions to access the database.</li>
     * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testacc</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The permissions that are granted to the account. Valid values:</p>
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write permissions.</li>
     * <li><strong>ReadOnly</strong>: read-only permissions.</li>
     * <li><strong>DMLOnly</strong>: the permissions to execute only DML statements.</li>
     * <li><strong>DDLOnly</strong>: the permissions to execute only DDL statements.</li>
     * <li><strong>ReadIndex</strong>: the read-only and index permissions.</li>
     * </ul>
     * <p>If you leave this parameter empty, the default value <strong>ReadWrite</strong> is used.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is valid only if you specify <strong>AccountName</strong>.</li>
     * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.</li>
     * <li>This parameter is optional for PolarDB for MySQL clusters.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The character set that is used by the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/99716.html">Character set tables</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>utf8</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <p>The language that indicates the collation of the databases that are created.</p>
     * <blockquote>
     * <ul>
     * <li>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</li>
     * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is not supported by PolarDB for MySQL clusters.</li>
     * </ul>
     * </blockquote>
     * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Then, click <strong>Create Database</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>C</p>
     */
    @NameInMap("Collate")
    public String collate;

    /**
     * <p>The language that indicates the character type of the database.</p>
     * <blockquote>
     * <ul>
     * <li>The language must be compatible with the character set that is specified by <strong>CharacterSetName</strong>.</li>
     * <li>The value that you specify must be the same as the value of <strong>Collate</strong>.</li>
     * <li>This parameter is required for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters. This parameter is optional for PolarDB for MySQL clusters.</li>
     * </ul>
     * </blockquote>
     * <p>To view the valid values for this parameter, perform the following steps: Log on to the PolarDB console and click the ID of a cluster. In the left-side navigation pane, choose <strong>Settings and Management</strong> &gt; <strong>Databases</strong>. Then, click <strong>Create Database</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>C</p>
     */
    @NameInMap("Ctype")
    public String ctype;

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
     * <p>The description of the database. The description must meet the following requirements:</p>
     * <ul>
     * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
     * <li>It must be 2 to 256 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster. This parameter is optional for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("DBDescription")
    public String DBDescription;

    /**
     * <p>The name of the database. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name can contain lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start with a lowercase letter and end with a lowercase letter or a digit. The name must be 1 to 64 characters in length.</li>
     * </ul>
     * <blockquote>
     * <p>Do not use reserved words as database names, such as <code>test</code> or <code>mysql</code>.</p>
     * </blockquote>
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
