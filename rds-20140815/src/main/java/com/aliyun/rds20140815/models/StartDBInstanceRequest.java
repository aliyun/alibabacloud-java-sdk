// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance. You can call the [DescribeDBInstances](~~26232~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The policy based on which the system migrates the data of the instance. Valid values:</p>
     * <br>
     * <p>*   **0**: the default value. The system preferentially upgrades or downgrades the instance without a migration. If the resources on the host on which the instance resides are insufficient, the system migrates the instance to another suitable host.</p>
     * <p>*   **1**: The system upgrades or downgrades the instance without a migration. If the upgrade or downgrade is not supported, the system reports an error.</p>
     * <p>*   **2**: The system migrates the data of the instance from the host on which the instance resides to another host. You must also specify the **DedicatedHostGroupId**, **TargetDedicatedHostIdForMaster**, and **TargetDedicatedHostIdForSlave** parameters. If you set the DBInstanceTransType parameter to 2, you cannot migrate the data of the instance to the host on which the instance resides. If you migrate the data of the instance to the host on which the instance resides, the migration fails.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("DBInstanceTransType")
    public Integer DBInstanceTransType;

    /**
     * <p>The ID of the dedicated cluster. You can call the [DescribeDedicatedHostGroups](~~141946~~) operation to query the ID of the dedicated cluster.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The time at which you want the change to take effect. Valid values:</p>
     * <br>
     * <p>*   **Immediate**: The change immediately takes effect.</p>
     * <p>*   **MaintainTime**: The change takes effect during the maintenance window that you specified. For more information, see [ModifyDBInstanceMaintainTime](~~26249~~).</p>
     * <p>*   **SpecificTime**: The change takes effect at a specified point in time.</p>
     * <br>
     * <p>Default value: MaintainTime.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version of the instance.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom time at which you want the change to take effect. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when you set the **EffectiveTime** parameter to **Specified**.</p>
     * <br>
     * <p>*   Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    /**
     * <p>The storage capacity of the instance. Valid values: **5 to 2000**. Unit: GB. If you do not specify this parameter, the storage capacity of the instance remains unchanged.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("Storage")
    public Integer storage;

    /**
     * <p>The instance type of the instance.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("TargetDBInstanceClass")
    public String targetDBInstanceClass;

    /**
     * <p>The ID of the host on which the logger instance is created.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter is invalid.</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host on which the primary instance is created.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when you set the **DBInstanceTransType** parameter to **2**.</p>
     * <br>
     * <p>*   Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host on which the secondary instance is created.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   This parameter must be specified when you set the **DBInstanceTransType** parameter to **2**.</p>
     * <br>
     * <p>*   Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the instance.</p>
     * <br>
     * <p>> Only the instances that are created in dedicated clusters are supported.</p>
     */
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
