// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDatabaseConfigRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4nnu1my39q******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name.</p>
     * <blockquote>
     * <p>You cannot specify multiple database names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The database attribute to be modified.</p>
     * <ul>
     * <li><strong>Modify database attributes feature</strong>: Specify the name of the attribute for the destination database.</li>
     * <li><strong>Data archiving to OSS feature</strong>: Specify the status of the destination database. Set the value to <code>covert_online_db_to_cold_storage</code> to convert an online database to a cold storage database, or set the value to <code>convert_cold_storage_db_to_online</code> to convert a cold storage database to an online database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>compatibility_level</p>
     */
    @NameInMap("DatabasePropertyName")
    public String databasePropertyName;

    /**
     * <p>The expected value of the database attribute.</p>
     * <ul>
     * <li><strong>Modify database attributes feature</strong>: Specify the value of the attribute for the destination database.</li>
     * <li><strong>Data archiving to OSS feature</strong>: Set the value to <strong>1</strong> to convert the destination database to a cold storage or online state.</li>
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
