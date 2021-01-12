// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    @NameInMap("TargetDBInstanceClass")
    public String targetDBInstanceClass;

    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("DBInstanceTransType")
    public Integer DBInstanceTransType;

    @NameInMap("Storage")
    public Integer storage;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    @NameInMap("ZoneIdForLog")
    public String zoneIdForLog;

    @NameInMap("ZoneIdForFollower")
    public String zoneIdForFollower;

    public static MigrateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBInstanceRequest self = new MigrateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public MigrateDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MigrateDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MigrateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public MigrateDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public MigrateDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateDBInstanceRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public MigrateDBInstanceRequest setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
        this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
        return this;
    }
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    public MigrateDBInstanceRequest setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
        this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
        return this;
    }
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    public MigrateDBInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public MigrateDBInstanceRequest setSpecifiedTime(String specifiedTime) {
        this.specifiedTime = specifiedTime;
        return this;
    }
    public String getSpecifiedTime() {
        return this.specifiedTime;
    }

    public MigrateDBInstanceRequest setTargetDBInstanceClass(String targetDBInstanceClass) {
        this.targetDBInstanceClass = targetDBInstanceClass;
        return this;
    }
    public String getTargetDBInstanceClass() {
        return this.targetDBInstanceClass;
    }

    public MigrateDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public MigrateDBInstanceRequest setDBInstanceTransType(Integer DBInstanceTransType) {
        this.DBInstanceTransType = DBInstanceTransType;
        return this;
    }
    public Integer getDBInstanceTransType() {
        return this.DBInstanceTransType;
    }

    public MigrateDBInstanceRequest setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }
    public Integer getStorage() {
        return this.storage;
    }

    public MigrateDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public MigrateDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public MigrateDBInstanceRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public MigrateDBInstanceRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public MigrateDBInstanceRequest setZoneIdForLog(String zoneIdForLog) {
        this.zoneIdForLog = zoneIdForLog;
        return this;
    }
    public String getZoneIdForLog() {
        return this.zoneIdForLog;
    }

    public MigrateDBInstanceRequest setZoneIdForFollower(String zoneIdForFollower) {
        this.zoneIdForFollower = zoneIdForFollower;
        return this;
    }
    public String getZoneIdForFollower() {
        return this.zoneIdForFollower;
    }

}
