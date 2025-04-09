// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to upgrade the major engine version of an ApsaraDB RDS for SQL Server instance. For more information, see <a href="https://help.aliyun.com/document_detail/127458.html">Upgrade the major engine version</a>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When you upgrade the major engine version, you must also specify the required parameters such as DBInstanceId, EngineVersion, DBInstanceClass, Category, ZoneId, and VSwitchId.</li>
     * <li>If you want to upgrade the instance edition to RDS High-availability Edition or RDS Cluster Edition, you must specify ZoneIdSlave1.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowMajorVersionUpgrade")
    public Boolean allowMajorVersionUpgrade;

    /**
     * <p>Specifies whether to use vouchers to offset fees. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>An invalid parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <blockquote>
     * <p> If you set <strong>EngineVersion</strong> to an SQL Server version number, you must also specify this parameter.</p>
     * </blockquote>
     * <p><strong>Regular RDS instances</strong></p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
     * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
     * <li><strong>Cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
     * </ul>
     * <p><strong>Serverless instances. ApsaraDB RDS for MariaDB does not support serverless instances.</strong></p>
     * <ul>
     * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_standard</strong>: RDS High-availability Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_ha</strong>: RDS High-availability Edition for serverless instances. This edition is available only for instances that run SQL Server.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ColdDataEnabled")
    public Boolean coldDataEnabled;

    /**
     * <p>Specifies whether to enable the storage compression feature for the ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/2861985.html">Use the storage compression feature</a>. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CompressionMode")
    public String compressionMode;

    /**
     * <p>The instance type of the new instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Specifications</a>. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the instance types.</p>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of DBInstanceClass and <strong>DBInstanceStorage</strong>.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to query the current instance type of the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds.mys2.small</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> operation to query the instance IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the new instance. Unit: GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Storage types</a>. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the storage capacity range that is supported by the new instance type.</p>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of DBInstanceStorage and <strong>DBInstanceClass</strong>.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to query the current storage capacity of the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSD.</li>
     * <li><strong>cloud_ssd</strong>: SSD cloud disks. This storage medium is not recommended and is unavailable in specific Alibaba Cloud regions.</li>
     * <li><strong>cloud_essd</strong>: performance level 1 (PL1) Enterprise SSD (ESSD).</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * </ul>
     * <p>To change the storage type, take note of the following items:</p>
     * <p>If the instance runs PostgreSQL, you can upgrade the storage type of the instance from standard SSDs to ESSDs. However, you cannot downgrade the storage type of the instance from ESSDs to standard SSDs. ESSDs provide the following PLs: ESSDs of PL1, ESSDs of PL2, and ESSDs of PL3. You can upgrade or downgrade the storage type between ESSD of PL1, ESSD of PL2, and ESSD of PL3. For more information, see <a href="https://help.aliyun.com/document_detail/96750.html">Configuration items</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The ID of the dedicated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-7a9********</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The type of change that you want to perform on the instance. Valid values:</p>
     * <ul>
     * <li><strong>Up</strong> (default): upgrades a subscription instance, or upgrades or downgrades a pay-as-you-go instance.</li>
     * <li><strong>Down</strong>: downgrades a subscription instance.</li>
     * <li><strong>TempUpgrade</strong>: performs auto scaling on a subscription instance that runs SQL Server. This value is required for auto scaling.</li>
     * <li><strong>Serverless</strong>: modifies the auto scaling settings of a serverless instance.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify only <strong>DBInstanceStorageType</strong>, you can leave Direction empty. For example, if you want to change only the storage type of the instance from standard SSD to Enterprise SSD (ESSD), you do not need to specify Direction.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The time when the new specifications take effect. Valid values:</p>
     * <blockquote>
     * <p> <strong>Specific changes may affect the instance</strong>. Read the <a href="https://help.aliyun.com/document_detail/96061.html">Impact</a> section before you specify this parameter. We recommend that you specify this parameter during off-peak hours.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Immediate</strong> (default): The changes immediately take effect.</li>
     * <li><strong>MaintainTime</strong>: The changes take effect during the <a href="https://help.aliyun.com/document_detail/610402.html">maintenance window</a> of the instance.</li>
     * <li><strong>ScheduleTime</strong>: The changes take effect at the point in time that you specify. This time must be at least 12 hours later than the current time. The actual effective time is calculated based on the following formula: EffectiveTime = ScheduleTime + SwitchTime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version of the instance. Valid values:</p>
     * <p><strong>Regular RDS instances</strong></p>
     * <ul>
     * <li>Valid values when Engine is set to MySQL: 5.5, 5.6, 5.7, and 8.0.</li>
     * <li>Valid values when Engine is set to SQLServer: 2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, and 2019_ent.</li>
     * <li>Valid values when Engine is set to PostgreSQL: 10.0, 11.0, 12.0, 13.0, 14.0, and 15.0.</li>
     * <li>Valid value when Engine is set to MariaDB: 10.3.</li>
     * </ul>
     * <p><strong>Serverless instances. ApsaraDB RDS for MariaDB does not support serverless instances.</strong></p>
     * <ul>
     * <li>Valid values when Engine is set to MySQL: 5.7 and 8.0.</li>
     * <li>Valid values when Engine is set to SQL Server: 2016_std_sl, 2017_std_sl, and 2019_std_sl.</li>
     * <li>Valid values when Engine is set to PostgreSQL: 14.0, 15.0, and 16.0.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5.6</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>Specifies whether to enable the write optimization feature for the ApsaraDB RDS for MySQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/2858761.html">Use the write optimization feature</a>. Valid values:</p>
     * <ul>
     * <li><strong>optimized</strong>: enables the feature.</li>
     * <li><strong>none</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>optimized</p>
     */
    @NameInMap("OptimizedWrites")
    public String optimizedWrites;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Serverless</strong>: serverless. This value is not supported for ApsaraDB RDS for MariaDB instances.</li>
     * </ul>
     * <blockquote>
     * <p> If you want to set this parameter to Serverless, **you must specify **AutoPause, MaxCapacity, MinCapacity, and SwitchForce. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>723298850895</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The specification of the read-only instance when you change the storage type of the ApsaraDB RDS for MySQL instance that runs RDS High-availability Edition from cloud disk to local disk.</p>
     * 
     * <strong>example:</strong>
     * <p>mysqlro.n2.large.c</p>
     */
    @NameInMap("ReadOnlyDBInstanceClass")
    public String readOnlyDBInstanceClass;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy**********</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The specifications that you want to change for a serverless instance.</p>
     */
    @NameInMap("ServerlessConfiguration")
    public String serverlessConfigurationShrink;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Specifies whether to enable the automatic suspension feature.</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The time at which you want to change the specifications. <strong>We recommend that you perform the specification changes during off-peak hours.</strong></p>
     * <p>Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The time at which you want to change the specifications <strong>must be later than the current time</strong>. Otherwise, the specification change task fails. If the specification change task fails, you must wait for the order to be automatically canceled, and then call this operation again.</li>
     * <li>If you want to increase the storage capacity or change the ESSD storage type between different PLs, the specification change immediately takes effect and does not affect your workloads. You do not need to specify this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The minor engine version number of the ApsaraDB RDS for PostgreSQL instance. For more information, see <a href="https://help.aliyun.com/document_detail/126002.html">Update the minor engine version</a>. If the minor engine version does not support changing the instance type, you must specify the minor engine version to <strong>update the minor engine version when you change the instance type</strong>.</p>
     * <p>Format: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. For example, if the instance runs PostgreSQL 12, set this parameter to <code>rds_postgres_1200_20200830</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_postgres_1200_20200830</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The validity period of the specification changes on an ApsaraDB RDS for SQL Server instance. At the end of the validity period, the specifications of the instance are restored to the specifications that are used before an <a href="https://help.aliyun.com/document_detail/95665.html">elastic upgrade</a> is performed. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UsedTime")
    public Long usedTime;

    /**
     * <p>The vSwitch ID. The vSwitch must belong to the zone that is specified by <strong>ZoneId</strong>.</p>
     * <ul>
     * <li>If you set <strong>InstanceNetworkType</strong> to <strong>VPC</strong>, you must also specify this parameter.</li>
     * <li>If you specify ZoneSlaveId1, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</li>
     * </ul>
     * <blockquote>
     * <p> If you want to upgrade the major engine version of an ApsaraDB RDS for SQL Server instance by specifying AllowMajorVersionUpgrade or change the vSwitch, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1oxflciovg9l7163lr7</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
     * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for SQL Server.</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</li>
     * </ul>
     * <blockquote>
     * <p>If you set <strong>EngineVersion</strong> to an SQL Server version number, you must also specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary instance. If you set this parameter to the same value as <strong>ZoneId</strong>, the single-zone deployment method is used. If you set this parameter to a different value from <strong>ZoneId</strong>, the multi-zone deployment method is used.</p>
     * <blockquote>
     * <p> If you want to upgrade the major engine version of an ApsaraDB RDS for SQL Server instance by specifying AllowMajorVersionUpgrade or change the secondary zone, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    public static ModifyDBInstanceSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecShrinkRequest self = new ModifyDBInstanceSpecShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecShrinkRequest setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }
    public Boolean getAllowMajorVersionUpgrade() {
        return this.allowMajorVersionUpgrade;
    }

    public ModifyDBInstanceSpecShrinkRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public ModifyDBInstanceSpecShrinkRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public ModifyDBInstanceSpecShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyDBInstanceSpecShrinkRequest setColdDataEnabled(Boolean coldDataEnabled) {
        this.coldDataEnabled = coldDataEnabled;
        return this;
    }
    public Boolean getColdDataEnabled() {
        return this.coldDataEnabled;
    }

    public ModifyDBInstanceSpecShrinkRequest setCompressionMode(String compressionMode) {
        this.compressionMode = compressionMode;
        return this;
    }
    public String getCompressionMode() {
        return this.compressionMode;
    }

    public ModifyDBInstanceSpecShrinkRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public ModifyDBInstanceSpecShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSpecShrinkRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public ModifyDBInstanceSpecShrinkRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public ModifyDBInstanceSpecShrinkRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public ModifyDBInstanceSpecShrinkRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyDBInstanceSpecShrinkRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBInstanceSpecShrinkRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public ModifyDBInstanceSpecShrinkRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
    }

    public ModifyDBInstanceSpecShrinkRequest setOptimizedWrites(String optimizedWrites) {
        this.optimizedWrites = optimizedWrites;
        return this;
    }
    public String getOptimizedWrites() {
        return this.optimizedWrites;
    }

    public ModifyDBInstanceSpecShrinkRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceSpecShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSpecShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ModifyDBInstanceSpecShrinkRequest setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
    public String getPromotionCode() {
        return this.promotionCode;
    }

    public ModifyDBInstanceSpecShrinkRequest setReadOnlyDBInstanceClass(String readOnlyDBInstanceClass) {
        this.readOnlyDBInstanceClass = readOnlyDBInstanceClass;
        return this;
    }
    public String getReadOnlyDBInstanceClass() {
        return this.readOnlyDBInstanceClass;
    }

    public ModifyDBInstanceSpecShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDBInstanceSpecShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceSpecShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceSpecShrinkRequest setServerlessConfigurationShrink(String serverlessConfigurationShrink) {
        this.serverlessConfigurationShrink = serverlessConfigurationShrink;
        return this;
    }
    public String getServerlessConfigurationShrink() {
        return this.serverlessConfigurationShrink;
    }

    public ModifyDBInstanceSpecShrinkRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

    public ModifyDBInstanceSpecShrinkRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ModifyDBInstanceSpecShrinkRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    public ModifyDBInstanceSpecShrinkRequest setUsedTime(Long usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Long getUsedTime() {
        return this.usedTime;
    }

    public ModifyDBInstanceSpecShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyDBInstanceSpecShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ModifyDBInstanceSpecShrinkRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

}
