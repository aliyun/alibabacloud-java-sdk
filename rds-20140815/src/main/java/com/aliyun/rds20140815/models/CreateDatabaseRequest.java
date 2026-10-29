// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The name of the account. You can call the <a href="https://help.aliyun.com/document_detail/610454.html">DescribeAccounts</a> operation to query the name.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>The type of permission granted to the account. If you specify multiple database names, you must specify the same number of permission types in the same order and separate them with commas (,).</p>
     * <p>Different database engines support different permission types. Valid values:</p>
     * <blockquote>
     * <p>For more information about account permissions, see <a href="https://help.aliyun.com/document_detail/146395.html">Permission list for ApsaraDB RDS for MySQL and ApsaraDB RDS for MariaDB</a>, <a href="https://help.aliyun.com/document_detail/95692.html">Permission list for ApsaraDB RDS for SQL Server</a>, and <a href="https://help.aliyun.com/document_detail/257684.html">Permission list for ApsaraDB RDS for PostgreSQL</a>.</p>
     * </blockquote>
     * <details>
     * <summary>ApsaraDB RDS for MySQL and ApsaraDB RDS for MariaDB</summary>
     * 
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write</li>
     * <li><strong>ReadOnly</strong>: read-only</li>
     * <li><strong>DDLOnly</strong>: DDL-only</li>
     * <li><strong>DMLOnly</strong>: DML-only</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>ApsaraDB RDS for SQL Server</summary>
     * 
     * <ul>
     * <li><strong>ReadWrite</strong>: read and write. This permission corresponds to the <code>db_datawriter</code> and <code>db_datareader</code> database roles in SQL Server.</li>
     * <li><strong>ReadOnly</strong>: read-only. This permission corresponds to the <code>db_datareader</code> database role in SQL Server.</li>
     * <li><strong>DBOwner</strong>: database owner. This permission corresponds to the <code>db_owner</code> database role in SQL Server.<blockquote>
     * <p>For more information about database-level roles, see <a href="https://learn.microsoft.com/en-us/sql/relational-databases/security/authentication-access/database-level-roles?view=sql-server-ver16">Microsoft official documentation</a>.</p>
     * </blockquote>
     * </details></li>
     * </ul>
     * <details>
     * <summary>ApsaraDB RDS for PostgreSQL</summary>
     * 
     * <p><strong>DBOwner</strong>: database owner</p>
     * <blockquote>
     * <p>For more information about fine-grained permission management for accounts, see <a href="https://help.aliyun.com/document_detail/352149.html">Best practices for permission management in ApsaraDB RDS for PostgreSQL</a>.</p>
     * </blockquote>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>ReadWrite</p>
     */
    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The character set. Valid values:</p>
     * <ul>
     * <li>ApsaraDB RDS for MySQL and ApsaraDB RDS for MariaDB: <strong>utf8</strong>, <strong>gbk</strong>, <strong>latin1</strong>, and <strong>utf8mb4</strong>.</li>
     * <li>ApsaraDB RDS for SQL Server: <strong>Chinese_PRC_CI_AS</strong>, <strong>Chinese_PRC_CS_AS</strong>, <strong>SQL_Latin1_General_CP1_CI_AS</strong>, <strong>SQL_Latin1_General_CP1_CS_AS</strong>, and <strong>Chinese_PRC_BIN</strong>.</li>
     * <li>ApsaraDB RDS for PostgreSQL: You must configure the character set, collation, and ctype in the <code>character set,&lt;collation&gt;,&lt;ctype&gt;</code> format. Example: <code>UTF8,C,en_US.utf8</code>.<ul>
     * <li>Valid values for the character set: <strong>KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, and SQL_ASCII</strong>.</li>
     * <li>Valid values for <strong>collation</strong>: You can execute the <code>SELECT DISTINCT collname FROM pg_collation;</code> statement to query the values. If you do not configure this parameter, the default value is <strong>C</strong>.</li>
     * <li>Valid values for <strong>ctype</strong>: You can execute the <code>SELECT DISTINCT collctype FROM pg_collation;</code> statement to query the values. If you do not configure this parameter, the default value is <strong>en_US.utf8</strong>.</li>
     * </ul>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gbk</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <p>The collation. This parameter is only supported for ApsaraDB RDS for MySQL instances. Specify a collation that matches the character set. For example, if the character set is utf8mb4, the collation must be utf8mb4_bin or utf8mb4_general_ci.</p>
     * 
     * <strong>example:</strong>
     * <p>gbk_chinese_ci</p>
     */
    @NameInMap("CollationName")
    public String collationName;

    /**
     * <p>The description of the database. The description must be 2 to 256 characters in length. It must start with a Chinese or English letter and can contain digits, Chinese characters, English letters, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>It cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBDescription")
    public String DBDescription;

    /**
     * <p>Instance ID of the instance. You can call the DescribeDBInstances operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * <blockquote>
     * <ul>
     * <li>The name must be 2 to 64 characters in length.</li>
     * <li>It must start with a letter and end with a letter or digit.</li>
     * <li>It can contain lowercase letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The database name must be unique within the instance.</li>
     * <li>For other invalid characters, see <a href="https://help.aliyun.com/document_detail/26317.html">Reserved keywords</a>.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_mysql</p>
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

    public CreateDatabaseRequest setCollationName(String collationName) {
        this.collationName = collationName;
        return this;
    }
    public String getCollationName() {
        return this.collationName;
    }

    public CreateDatabaseRequest setDBDescription(String DBDescription) {
        this.DBDescription = DBDescription;
        return this;
    }
    public String getDBDescription() {
        return this.DBDescription;
    }

    public CreateDatabaseRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
