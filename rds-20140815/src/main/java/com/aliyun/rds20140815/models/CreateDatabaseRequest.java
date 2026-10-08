// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountPrivilege")
    public String accountPrivilege;

    /**
     * <p>The character set. Valid values:</p>
     * <ul>
     * <li>MySQL/MariaDB: <strong>utf8, gbk, latin1, utf8mb4</strong></li>
     * <li>SQL Server: <strong>Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1_General_CP1_CI_AS, SQL_Latin1_General_CP1_CS_AS, Chinese_PRC_BIN</strong></li>
     * <li>PostgreSQL: You must specify the character set, Collate, and Ctype in the format of <code>Character set,&lt;Collate&gt;,&lt;Ctype&gt;</code>. Example: <code>UTF8,C,en_US.utf8</code>.<ul>
     * <li>Valid values for the character set: <strong>KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO_8859_5, ISO_8859_6, ISO_8859_7, ISO_8859_8, SQL_ASCII</strong>.</li>
     * <li>Valid values for <strong>Collate</strong>: You can run the <code>SELECT DISTINCT collname FROM pg_collation;</code> command to query the valid values. If this parameter is not specified, the default value <strong>C</strong> is used.</li>
     * <li>Valid values for <strong>Ctype</strong>: You can run the <code>SELECT DISTINCT collctype FROM pg_collation;</code> command to query the valid values. If this parameter is not specified, the default value <strong>en_US.utf8</strong> is used.</li>
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
     * <p>The collation. This parameter is supported only for ApsaraDB RDS for MySQL instances. Specify a collation that matches the character set. For example, if the character set is utf8mb4, the collation must be utf8mb4_bin or utf8mb4_general_ci.</p>
     * 
     * <strong>example:</strong>
     * <p>gbk_chinese_ci</p>
     */
    @NameInMap("CollationName")
    public String collationName;

    /**
     * <p>The database description. The description must be 2 to 256 characters in length and can contain letters, digits, Chinese characters, underscores (_), and hyphens (-). The description must start with a Chinese character or a letter.</p>
     * <blockquote>
     * <p>The description cannot start with <code>http://</code> or <code>https://</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testdb</p>
     */
    @NameInMap("DBDescription")
    public String DBDescription;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name.</p>
     * <blockquote>
     * <ul>
     * <li>The name must be 2 to 64 characters in length.</li>
     * <li>The name must start with a letter and end with a letter or digit.</li>
     * <li>The name can contain lowercase letters, digits, underscores (_), and hyphens (-).</li>
     * <li>The database name must be unique within the instance.</li>
     * <li>For more information about invalid characters, see <a href="https://help.aliyun.com/document_detail/26317.html">Reserved words</a>.</li>
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
