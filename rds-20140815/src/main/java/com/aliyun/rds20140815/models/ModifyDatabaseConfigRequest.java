// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDatabaseConfigRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The database name.</p>
     * <br>
     * <p>>  You can specify only one database name.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBName")
    public String DBName;

    /**
     * <p>The name of the database property that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabasePropertyName")
    public String databasePropertyName;

    /**
     * <p>The value of the database property that you want to modify.</p>
     * <br>
     * <p>This parameter is required.</p>
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
