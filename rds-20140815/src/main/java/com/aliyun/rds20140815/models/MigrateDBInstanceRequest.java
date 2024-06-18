// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateDBInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The dedicated cluster ID. You can call the DescribeDedicatedHostGroups operation to query the dedicated cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-4n******</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The time when you want the system to start the migration. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: The system immediately starts the migration. This is the default value.</li>
     * <li><strong>MaintainTime</strong>: The system starts the migration during the specified maintenance window.</li>
     * <li><strong>Specified</strong>: The system starts the migration at the specified point in time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

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
     * <p>The point in time when you want the system to start the migration. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This parameter must be specified when you set <strong>EffectiveTime</strong> to <strong>Specified</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-10-21T10:00:00Z</p>
     */
    @NameInMap("SpecifiedTime")
    public String specifiedTime;

    /**
     * <p>The ID of the host to which you want to migrate the primary instance. You can call the DescribeDedicatedHosts operation to query the host ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp******</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>The ID of the host to which you want to migrate the secondary instance. You can call the DescribeDedicatedHosts operation to query the host ID.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp******</p>
     */
    @NameInMap("TargetDedicatedHostIdForSlave")
    public String targetDedicatedHostIdForSlave;

    /**
     * <p>The zone ID of the secondary node.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneIdForFollower")
    public String zoneIdForFollower;

    /**
     * <p>The zone ID of the logger instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("ZoneIdForLog")
    public String zoneIdForLog;

    public static MigrateDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateDBInstanceRequest self = new MigrateDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public MigrateDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public MigrateDBInstanceRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public MigrateDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public MigrateDBInstanceRequest setSpecifiedTime(String specifiedTime) {
        this.specifiedTime = specifiedTime;
        return this;
    }
    public String getSpecifiedTime() {
        return this.specifiedTime;
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

    public MigrateDBInstanceRequest setZoneIdForFollower(String zoneIdForFollower) {
        this.zoneIdForFollower = zoneIdForFollower;
        return this;
    }
    public String getZoneIdForFollower() {
        return this.zoneIdForFollower;
    }

    public MigrateDBInstanceRequest setZoneIdForLog(String zoneIdForLog) {
        this.zoneIdForLog = zoneIdForLog;
        return this;
    }
    public String getZoneIdForLog() {
        return this.zoneIdForLog;
    }

}
