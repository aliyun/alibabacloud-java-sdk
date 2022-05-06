// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("DBInstanceTransType")
    public Integer DBInstanceTransType;

    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    @NameInMap("EffectiveTime")
    public String effectiveTime;

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

    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    @NameInMap("Storage")
    public Integer storage;

    @NameInMap("TargetDBInstanceClass")
    public String targetDBInstanceClass;

    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static StartDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDBInstanceRequest self = new StartDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StartDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public StartDBInstanceRequest setDBInstanceTransType(Integer DBInstanceTransType) {
        this.DBInstanceTransType = DBInstanceTransType;
        return this;
    }
    public Integer getDBInstanceTransType() {
        return this.DBInstanceTransType;
    }

    public StartDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public StartDBInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public StartDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public StartDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public StartDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public StartDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public StartDBInstanceRequest setSpecifiedTime(String specifiedTime) {
        this.specifiedTime = specifiedTime;
        return this;
    }
    public String getSpecifiedTime() {
        return this.specifiedTime;
    }

    public StartDBInstanceRequest setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }
    public Integer getStorage() {
        return this.storage;
    }

    public StartDBInstanceRequest setTargetDBInstanceClass(String targetDBInstanceClass) {
        this.targetDBInstanceClass = targetDBInstanceClass;
        return this;
    }
    public String getTargetDBInstanceClass() {
        return this.targetDBInstanceClass;
    }

    public StartDBInstanceRequest setTargetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
        this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
        return this;
    }
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    public StartDBInstanceRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public StartDBInstanceRequest setTargetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
        this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
        return this;
    }
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    public StartDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public StartDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
