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
     * <p>Specifying multiple database names is not supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testDB</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The database attribute that you want to modify.</p>
     * <ul>
     * <li><strong>Modify database attributes feature</strong>: Enter the attribute name of the target database.</li>
     * <li><strong>Data archiving to OSS feature</strong>: Enter the status of the target database. Set this parameter to <code>covert_online_db_to_cold_storage</code> to convert an online database to a cold storage database, or set this parameter to <code>convert_cold_storage_db_to_online</code> to convert a cold storage database to an online database.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>compatibility_level</p>
     */
    @NameInMap("DatabasePropertyName")
    public String databasePropertyName;

    /**
     * <p>The value of the database attribute that you want to modify.</p>
     * <ul>
     * <li><strong>Modify database attributes feature</strong>: Enter the attribute value of the target database.</li>
     * <li><strong>Data archiving to OSS feature</strong>: Set this parameter to <strong>1</strong> to convert the target database to cold storage or online status.</li>
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
