// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class MigrateToOtherZoneRequest extends TeaModel {
    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition</li>
     * <li><strong>HighAvailability</strong>: High-availability Edition</li>
     * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition</li>
     * <li><strong>cluster</strong>: MySQL Cluster Edition</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    @NameInMap("CustomExtraInfo")
    public String customExtraInfo;

    /**
     * <p>The target instance type of the destination instance. Only the instance type can be changed. The storage type cannot be changed.
     * When the <strong>IsModifySpec</strong> parameter settings require <strong>true</strong>, you must specify at least one of this parameter and <strong>DBInstanceStorage</strong>.</p>
     * <p>For more information about instance types, see <a href="https://help.aliyun.com/document_detail/276975.html">Primary ApsaraDB RDS for MySQL instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.x4.xlarge.2</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID. You can call DescribeDBInstances to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The destination storage capacity. When the <strong>IsModifySpec</strong> parameter settings require <strong>true</strong>, you must specify at least one of this parameter and <strong>DBInstanceClass</strong>.</p>
     * <p>Unit: GB.
     * Valid values: The storage capacity varies based on the instance type. For more information, see <a href="https://help.aliyun.com/document_detail/276975.html">Primary ApsaraDB RDS for MySQL instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DBInstanceStorage")
    public Long DBInstanceStorage;

    /**
     * <p>The instance storage type. Valid values:</p>
     * <ul>
     * <li>cloud_essd: PL1 ESSD cloud disk.</li>
     * <li>cloud_essd2: PL2 ESSD cloud disk.</li>
     * <li>cloud_essd3: PL3 ESSD cloud disk.</li>
     * <li>cloud_ssd: standard SSD (not recommended because standard SSDs are no longer available for purchase in some regions).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The effective period. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The migration takes effect immediately. This is the default value.</li>
     * <li><strong>MaintainTime</strong>: The migration takes effect during the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * <li><strong>ScheduleTime</strong>: The migration takes effect at a custom time.</li>
     * </ul>
     * <blockquote>
     * <p>If you set this parameter to <strong>ScheduleTime</strong>, you must also specify the <strong>SwitchTime</strong> parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>Specifies whether to enable the Buffer Pool Extension (BPE) feature for premium performance disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enable.</li>
     * <li><strong>0</strong>: Disable.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about the BPE feature, see <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE)</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>Specifies whether to change the instance specifications during zone migration.</p>
     * <ul>
     * <li><strong>true</strong>: Change the specifications. When this parameter is set to <strong>true</strong>, you must specify at least one of the <strong>DBInstanceClass</strong> and <strong>DBInstanceStorage</strong> parameters.</li>
     * <li><strong>false</strong>: Do not change the specifications. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is applicable only to ApsaraDB RDS for MySQL instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsModifySpec")
    public String isModifySpec;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The custom time at which the zone switch takes effect. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>This parameter is used together with the <strong>EffectiveTime</strong> parameter and is required only when <strong>EffectiveTime</strong> is set to <strong>ScheduleTime</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-12-14T15:15:15Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The virtual private cloud (VPC) ID. The VPC cannot be changed during instance migration and must remain the same.</p>
     * <ul>
     * <li>This parameter is required when you migrate a VPC-connected instance to a different zone.</li>
     * <li>If the instance engine is SQL Server, the VPC can be changed during instance migration.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vpc-****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID.</p>
     * <ul>
     * <li>This parameter is required when you migrate a VPC-connected instance to a different zone. You can invoke DescribeVSwitches to query the vSwitches that have been created.</li>
     * <li>When you perform instance migration for an ApsaraDB RDS for PostgreSQL or SQL Server instance to a different zone with a secondary zone configured, you can specify multiple vSwitch IDs separated by commas (,), corresponding to the zones.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination zone. You can call DescribeRegions to query the zone ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The secondary zone 1.</p>
     * <blockquote>
     * <p>This parameter is required for instances that are not of the Basic Edition.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The secondary zone 2.</p>
     * <blockquote>
     * <p>This parameter is applicable only to RDS Enterprise Edition instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static MigrateToOtherZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateToOtherZoneRequest self = new MigrateToOtherZoneRequest();
        return TeaModel.build(map, self);
    }

    public MigrateToOtherZoneRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public MigrateToOtherZoneRequest setCustomExtraInfo(String customExtraInfo) {
        this.customExtraInfo = customExtraInfo;
        return this;
    }
    public String getCustomExtraInfo() {
        return this.customExtraInfo;
    }

    public MigrateToOtherZoneRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public MigrateToOtherZoneRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public MigrateToOtherZoneRequest setDBInstanceStorage(Long DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Long getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public MigrateToOtherZoneRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public MigrateToOtherZoneRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public MigrateToOtherZoneRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
    }

    public MigrateToOtherZoneRequest setIsModifySpec(String isModifySpec) {
        this.isModifySpec = isModifySpec;
        return this;
    }
    public String getIsModifySpec() {
        return this.isModifySpec;
    }

    public MigrateToOtherZoneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public MigrateToOtherZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MigrateToOtherZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MigrateToOtherZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public MigrateToOtherZoneRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public MigrateToOtherZoneRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public MigrateToOtherZoneRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public MigrateToOtherZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public MigrateToOtherZoneRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public MigrateToOtherZoneRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

}
