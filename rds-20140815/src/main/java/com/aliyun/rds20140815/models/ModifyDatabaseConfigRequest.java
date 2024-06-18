// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDatabaseConfigRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4nnu1my39qr8****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name.</p>
     * <blockquote>
     * <p> You can specify only one database name.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The database property that you want to modify.</p>
     * <ul>
     * <li><strong>If you want to modify a property of the database</strong>, set this parameter to the name of the database property.</li>
     * <li><strong>If you want to archive data from the database to an OSS bucket</strong>, specify the database status. If you set this parameter to <code>covert_online_db_to_cold_storage</code>, the system converts an online database to a cold storage database. If you set this parameter to <code>convert_cold_storage_db_to_online</code>, the system converts a cold storage database to an online database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>compatibility_level</p>
     */
    @NameInMap("DatabasePropertyName")
    public String databasePropertyName;

    /**
     * <p>The value of the database property that you want to modify.</p>
     * <ul>
     * <li><strong>If you want to modify a property of the database</strong>, set this parameter to the property value.</li>
     * <li><strong>If you want to archive data from the database to an OSS bucket</strong>, set this parameter to <strong>1</strong>. The system converts a database to a cold storage database or an online database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>150</p>
     */
    @NameInMap("DatabasePropertyValue")
    public String databasePropertyValue;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDatabaseConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseConfigRequest self = new ModifyDatabaseConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseConfigRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDatabaseConfigRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public ModifyDatabaseConfigRequest setDatabasePropertyName(String databasePropertyName) {
        this.databasePropertyName = databasePropertyName;
        return this;
    }
    public String getDatabasePropertyName() {
        return this.databasePropertyName;
    }

    public ModifyDatabaseConfigRequest setDatabasePropertyValue(String databasePropertyValue) {
        this.databasePropertyValue = databasePropertyValue;
        return this;
    }
    public String getDatabasePropertyValue() {
        return this.databasePropertyValue;
    }

    public ModifyDatabaseConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDatabaseConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDatabaseConfigRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDatabaseConfigRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
