// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDatabaseRequest extends TeaModel {
    /**
     * <p>The character set.</p>
     * <br>
     * <p>*   Valid values for MySQL or MariaDB databases: **utf8, gbk, latin1, and utf8mb4**</p>
     * <br>
     * <p>*   Valid values for SQL Server databases: **Chinese_PRC_CI_AS, Chinese_PRC_CS_AS, SQL_Latin1\_General_CP1\_CI_AS, SQL_Latin1\_General_CP1\_CS_AS, and Chinese_PRC_BIN**</p>
     * <br>
     * <p>*   Valid values for PostgreSQL databases: a value in the `Character set,<Collate>,<Ctype>` format. Example: `UTF8,C,en_US.utf8`.</p>
     * <br>
     * <p>    *   Valid values for the character set: **KOI8U, UTF8, WIN866, WIN874, WIN1250, WIN1251, WIN1252, WIN1253, WIN1254, WIN1255, WIN1256, WIN1257, WIN1258, EUC_CN, EUC_KR, EUC_TW, EUC_JP, EUC_JIS\_2004, KOI8R, MULE_INTERNAL, LATIN1, LATIN2, LATIN3, LATIN4, LATIN5, LATIN6, LATIN7, LATIN8, LATIN9, LATIN10, ISO\_8859\_5, ISO\_8859\_6, ISO\_8859\_7, ISO\_8859\_8, and SQL_ASCII**</p>
     * <p>    *   Valid values for the **Collate** field: You can execute the `SELECT DISTINCT collname FROM pg_collation;` statement to obtain the field value. The default value is **C**.</p>
     * <p>    *   Valid values for the **Ctype** field: You can execute the `SELECT DISTINCT collctype FROM pg_collation;` statement to obtain the field value. The default value is **en_US.utf8**.</p>
     */
    @NameInMap("CharacterSetName")
    public String characterSetName;

    /**
     * <p>The description of the database. The description must be 2 to 256 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The description must start with a letter.</p>
     * <br>
     * <p>> The value cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("DBDescription")
    public String DBDescription;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The name of the database.</p>
     * <br>
     * <p>> *   The name must be 2 to 64 characters in length.</p>
     * <p>> *   The name must start with a lowercase letter and end with a lowercase letter or digit.</p>
     * <p>> *   The name can contain lowercase letters, digits, underscores (\_), and hyphens (-).</p>
     * <p>> *   The name must be unique within the instance.</p>
     * <p>> *   For more information about invalid characters, see [Forbidden keywords table](~~26317~~).</p>
     */
    @NameInMap("DBName")
    public String DBName;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseRequest self = new CreateDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseRequest setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }
    public String getCharacterSetName() {
        return this.characterSetName;
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

    public CreateDatabaseRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
