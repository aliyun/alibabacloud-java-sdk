// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckCreateDdrDBInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the data backup file that is used for the restoration. You can call the [DescribeCrossRegionBackups](~~121733~~) operation to query backup set IDs.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **0**, you must also specify this parameter.</p>
     */
    @NameInMap("BackupSetId")
    public String backupSetId;

    /**
     * <p>The type of the destination instance. For more information, see [Primary instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The storage capacity of the destination instance. Valid values: **5 to 2000**. Unit: GB.</p>
     * <br>
     * <p>The storage capacity increases at increments of 5 GB. For more information, see [Primary instance types](~~26312~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The database engine that is run on the destination instance. Valid values:</p>
     * <br>
     * <p>*   **MySQL**</p>
     * <p>*   **SQLServer**</p>
     * <p>*   **PostgreSQL**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The version of the database engine that is run on the destination the instance. The value of this parameter varies based on the value of the **Engine** parameter. Valid values:</p>
     * <br>
     * <p>*   MySQL: **5.5, 5.6, 5.7, and 8.0**</p>
     * <p>*   SQL Server: **2008r2, 08r2\_ent_ha, 2012, 2012\_ent_ha, 2012\_std_ha, 2012\_web, 2014\_std_ha, 2016\_ent_ha, 2016\_std_ha, 2016\_web, 2017\_std_ha, 2017\_ent, 2019\_std_ha, and 2019\_ent**</p>
     * <p>*   PostgreSQL: **9.4, 10.0, 11.0, 12.0, and 13.0**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the destination instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list of region IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The point in time to which you want to restore data. The point in time that you specify must be earlier than the current time. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **1**, you must also specify this parameter.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The restoration method that you want to use. Valid values:</p>
     * <br>
     * <p>*   **0**: restores data from a data backup file. If you select this value, you must also specify the **BackupSetId** parameter.</p>
     * <p>*   **1**: restores data to a point in time. If you select this value, you must also specify the **RestoreTime**, **SourceRegion** and **SourceDBInstanceName** parameters.</p>
     * <br>
     * <p>Default value: **0**.</p>
     */
    @NameInMap("RestoreType")
    public String restoreType;

    /**
     * <p>The ID of the source instance if you want to restore data to a point in time.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **1**, you must also specify this parameter.</p>
     */
    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    /**
     * <p>The region ID of the source instance if you want to restore data to a point in time.</p>
     * <br>
     * <p>>  If you set the **RestoreType** parameter to **1**, you must also specify this parameter.</p>
     */
    @NameInMap("SourceRegion")
    public String sourceRegion;

    public static CheckCreateDdrDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDdrDBInstanceRequest self = new CheckCreateDdrDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CheckCreateDdrDBInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CheckCreateDdrDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CheckCreateDdrDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CheckCreateDdrDBInstanceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public CheckCreateDdrDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CheckCreateDdrDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CheckCreateDdrDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckCreateDdrDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CheckCreateDdrDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CheckCreateDdrDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CheckCreateDdrDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CheckCreateDdrDBInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CheckCreateDdrDBInstanceRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    public CheckCreateDdrDBInstanceRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

}
