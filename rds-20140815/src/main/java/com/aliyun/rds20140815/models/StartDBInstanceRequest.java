// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class StartDBInstanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. The migration method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Default value. The system preferentially performs a local specification change. If local resources are insufficient, a cross-instance migration is performed.</li>
     * <li><strong>1</strong>: Local specification change. If the system determines that the instance does not support a local specification change, an error is returned.</li>
     * <li><strong>2</strong>: Cross-instance migration. The instance is migrated to a specified host. You must specify <strong>DedicatedHostGroupId</strong>, <strong>TargetDedicatedHostIdForMaster</strong>, and <strong>TargetDedicatedHostIdForSlave</strong>. The instance cannot be migrated to the host on which it currently resides. Otherwise, the migration fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DBInstanceTransType")
    public Integer DBInstanceTransType;

    /**
     * <p>This operation also supports starting an ApsaraDB RDS instance in a dedicated cluster. In this case, specify the dedicated cluster ID. You can call DescribeDedicatedHostGroups to query the dedicated cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-39****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. The effective period. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The operation takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The operation takes effect during the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>SpecificTime</strong>: The operation takes effect at a specified time.</li>
     * </ul>
     * <p>Default value: MaintainTime.</p>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. The database engine version.</p>
     * 
     * <strong>example:</strong>
     * <p>5.7</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call DescribeRegions to query the region ID.</p>
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
     * <p>This parameter is supported only for dedicated cluster instances. The specified switchover time. Format: yyyy-MM-ddTHH:mm:ssZ (UTC).</p>
     * <blockquote>
     * <p>This parameter is required when <strong>EffectiveTime</strong> is set to <strong>Specified</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-10-21T10:00:00Z</p>
     */
    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. The custom storage capacity. Valid values: <strong>5 to 2000</strong>. Unit: GB. If you do not specify this parameter, the storage capacity remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Storage")
    public Integer storage;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. The instance type of the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rds.ebmhfc6.20xlarge</p>
     */
    @NameInMap("TargetDBInstanceClass")
    public String targetDBInstanceClass;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be configured.</p>
     * 
     * <strong>example:</strong>
     * <p>dh-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForLog")
    public String targetDedicatedHostIdForLog;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. Specifies the ID of the destination host for the primary node.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DBInstanceTransType</strong> is set to <strong>2</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. Specifies the ID of the destination host for the secondary node.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>DBInstanceTransType</strong> is set to <strong>2</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dh-bp****</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>This parameter is supported only for dedicated cluster instances. The zone ID.</p>
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
