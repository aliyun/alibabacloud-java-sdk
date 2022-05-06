// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckCreateDdrDBInstanceRequest extends TeaModel {
    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("BinlogName")
    public String binlogName;

    @NameInMap("BinlogPosition")
    public String binlogPosition;

    @NameInMap("BinlogRole")
    public String binlogRole;

    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    @NameInMap("Engine")
    public String engine;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("RestoreType")
    public String restoreType;

    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

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

    public CheckCreateDdrDBInstanceRequest setBinlogName(String binlogName) {
        this.binlogName = binlogName;
        return this;
    }
    public String getBinlogName() {
        return this.binlogName;
    }

    public CheckCreateDdrDBInstanceRequest setBinlogPosition(String binlogPosition) {
        this.binlogPosition = binlogPosition;
        return this;
    }
    public String getBinlogPosition() {
        return this.binlogPosition;
    }

    public CheckCreateDdrDBInstanceRequest setBinlogRole(String binlogRole) {
        this.binlogRole = binlogRole;
        return this;
    }
    public String getBinlogRole() {
        return this.binlogRole;
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
