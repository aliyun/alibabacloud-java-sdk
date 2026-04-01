// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The data migration method of the instance. This parameter is available only for instances that are created in dedicated clusters. Valid values:</p>
     * <ul>
     * <li><strong>0</strong> (default): The system preferentially upgrades or downgrades the instance without a migration. If the resources on the host on which the instance resides are insufficient, the system migrates the instance to another suitable host.</li>
     * <li><strong>1</strong>: The system upgrades or downgrades the instance without a migration. If the upgrade or downgrade is not supported, the system reports an error.</li>
     * <li><strong>2</strong>: The system migrates the data of the instance from the host on which the instance resides to another host. You must also specify <strong>DedicatedHostGroupId</strong>, <strong>TargetDedicatedHostIdForMaster</strong>, and <strong>TargetDedicatedHostIdForSlave</strong>. If you set DBInstanceTransType to 2, you cannot migrate the data of the instance to the host on which the instance resides. If you migrate the data of the instance to the host on which the instance resides, the migration fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DBInstanceTransType")
    public Integer DBInstanceTransType;

    /**
     * <p>The dedicated cluster ID. This parameter is supported if you call this operation to suspend an RDS instance in the dedicated cluster. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-39****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The effective time. This parameter is available only for instances that are created in dedicated clusters.</p>
     * <ul>
     * <li><strong>Immediate</strong></li>
     * <li><strong>MaintainTime</strong>: The change takes effect during the planned maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecificTime</strong>: The change takes effect at a specified point in time.</li>
     * </ul>
     * <p>Default value: MaintainTime.</p>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version of the instance. This parameter is available only for instances that are created in dedicated clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The switching time. This parameter is available only for instances that are created in dedicated clusters. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter must be specified when <strong>EffectiveTime</strong> is set to <strong>Specified</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-10-21T10:00:00Z</p>
     */
    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    /**
     * <p>The storage capacity of the instance. This parameter is available only for instances that are created in dedicated clusters. Valid values: <strong>5 to 2000</strong>. Unit: GB. If you do not specify this parameter, the storage capacity of the instance remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Storage")
    public Integer storage;

    /**
     * <p>The instance type of the required instance. This parameter is available only for instances that are created in dedicated clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>rds.ebmhfc6.20xlarge</p>
     */
    @NameInMap("TargetDBInstanceClass")
    public String targetDBInstanceClass;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>The ID of the host on which the primary instance is created. This parameter is available only for instances that are created in dedicated clusters.</p>
     * <blockquote>
     * <p>This parameter must be specified when <strong>DBInstanceTransType</strong> is set to <strong>2</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host on which the secondary instance is created. This parameter is available only for instances that are created in dedicated clusters.</p>
     * <blockquote>
     * <p>This parameter must be specified when <strong>DBInstanceTransType</strong> is set to <strong>2</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The vSwitch ID. This parameter is available only for instances that are created in dedicated clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID. This parameter is available only for instances that are created in dedicated clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
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
