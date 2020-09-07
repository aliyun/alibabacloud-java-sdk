// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CheckCreateDdrDBInstanceRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("EngineVersion")
    @Validation(required = true)
    public String engineVersion;

    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    public String DBInstanceClass;

    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    public Integer DBInstanceStorage;

    @NameInMap("RestoreType")
    @Validation(required = true)
    public String restoreType;

    @NameInMap("BackupSetId")
    public String backupSetId;

    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("SourceRegion")
    public String sourceRegion;

    @NameInMap("SourceDBInstanceName")
    public String sourceDBInstanceName;

    @NameInMap("BinlogName")
    public String binlogName;

    @NameInMap("BinlogPosition")
    public String binlogPosition;

    @NameInMap("BinlogRole")
    public String binlogRole;

    public static CheckCreateDdrDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckCreateDdrDBInstanceRequest self = new CheckCreateDdrDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CheckCreateDdrDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public CheckCreateDdrDBInstanceRequest setRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }
    public String getRestoreType() {
        return this.restoreType;
    }

    public CheckCreateDdrDBInstanceRequest setBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }
    public String getBackupSetId() {
        return this.backupSetId;
    }

    public CheckCreateDdrDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CheckCreateDdrDBInstanceRequest setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }
    public String getSourceRegion() {
        return this.sourceRegion;
    }

    public CheckCreateDdrDBInstanceRequest setSourceDBInstanceName(String sourceDBInstanceName) {
        this.sourceDBInstanceName = sourceDBInstanceName;
        return this;
    }
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
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

}
