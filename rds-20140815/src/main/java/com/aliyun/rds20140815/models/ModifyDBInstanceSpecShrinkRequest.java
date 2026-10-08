// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecShrinkRequest extends TeaModel {
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    /**
     * <p>Specifies whether to enable <a href="https://help.aliyun.com/document_detail/127458.html">major engine version upgrade</a> for the SQL Server instance. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AllowMajorVersionUpgrade")
    public Boolean allowMajorVersionUpgrade;

    /**
     * <p>Specifies whether to use coupons to offset fees. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2340501.html">I/O performance burst feature for Premium ESSDs</a>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/53509.html">instance edition</a>. Valid values:</p>
     * <blockquote>
     * <p>This parameter is required if <strong>EngineVersion</strong> is set to a SQL Server version number.</p>
     * </blockquote>
     * <details>
     * <summary>Regular ApsaraDB RDS instances</summary>
     * 
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition</li>
     * <li><strong>HighAvailability</strong>: High-availability Edition</li>
     * <li><strong>AlwaysOn</strong>: SQL Server Cluster Edition</li>
     * <li><strong>Cluster</strong>: MySQL Cluster Edition.</li>
     * <li>&lt;props=&quot;china&quot;&gt;<strong>Finance</strong>: Enterprise Edition</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>Serverless ApsaraDB RDS instances (not supported for MariaDB)</summary>
     * 
     * <ul>
     * <li><strong>serverless_basic</strong>: Serverless Basic Edition (applicable only to MySQL and PostgreSQL)</li>
     * <li><strong>serverless_standard</strong>: Serverless High-availability Edition (applicable only to MySQL and PostgreSQL)</li>
     * <li><strong>serverless_ha</strong>: Serverless High-availability Edition (applicable only to SQL Server)</li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/2701832.html">cold data archiving feature</a> for premium performance disks. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ColdDataEnabled")
    public Boolean coldDataEnabled;

    /**
     * <p>The MySQL <a href="https://help.aliyun.com/document_detail/2861985.html">storage compression feature</a>. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CompressionMode")
    public String compressionMode;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/26312.html">target instance type</a>. You can call <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> to query the instance types to which the instance can be changed.</p>
     * 
     * <strong>example:</strong>
     * <p>mysql.n8.large.2c</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/26312.html">target storage capacity</a>. Unit: GB. You can call <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> to query the available storage capacity range for the target instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The instance storage type. Valid values:</p>
     * 
     * <strong>example:</strong>
     * <p>local_ssd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The dedicated cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-7a9****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The type of specification change. Valid values:</p>
     * <ul>
     * <li><strong>Up</strong> (default): upgrade of a subscription instance or upgrade/downgrade of a pay-as-you-go instance.</li>
     * <li><strong>Down</strong>: downgrade of a subscription instance.</li>
     * <li><strong>TempUpgrade</strong>: elastic specification change of a subscription ApsaraDB RDS for SQL Server instance. This value is required for elastic specification changes.</li>
     * <li><strong>Serverless</strong>: configuration of elastic settings for a serverless instance.</li>
     * </ul>
     * <blockquote>
     * <p>If you want to change only the <strong>DBInstanceStorageType</strong> parameter, for example, from standard SSD to ESSD, leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The time when the new configurations take effect. Valid values:</p>
     * <blockquote>
     * <p><strong>Changing certain configurations may affect the instance</strong>. Read the <a href="https://help.aliyun.com/document_detail/96061.html">impact section in the feature documentation</a> before configuring this parameter. Perform this operation during off-peak hours.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Immediate</strong> (default): The new configurations take effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The new configurations take effect during the <a href="https://help.aliyun.com/document_detail/610402.html">maintenance window</a>.</li>
     * <li><strong>ScheduleTime</strong>: The new configurations take effect at a specified time. The specified time must be at least 12 hours later than the current time. The actual switchover time follows the rule: EffectiveTime = ScheduleTime + SwitchTime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version. Valid values:</p>
     * <details>
     * <summary>Regular ApsaraDB RDS instances</summary>
     * 
     * <ul>
     * <li>MySQL: 5.5, 5.6, 5.7, 8.0</li>
     * <li>SQL Server: 2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, 2019_ent, 2022_web, 2022_std_ha, 2022_ent, 2025_std, 2025_ent</li>
     * <li>PostgreSQL: 10.0, 11.0, 12.0, 13.0, 14.0, 15.0</li>
     * <li>MariaDB: 10.3</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>Serverless ApsaraDB RDS instances (MariaDB is not supported)</summary>
     * 
     * <ul>
     * <li>MySQL: 5.7, 8.0</li>
     * <li>SQL Server: 2016_std_sl, 2017_std_sl, 2019_std_sl</li>
     * <li>PostgreSQL: 14.0, 15.0, 16.0</li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE) feature</a> for premium performance disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Enabled.</li>
     * <li><strong>0</strong>: Not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>Specifies whether to enable the MySQL <a href="https://help.aliyun.com/document_detail/2858761.html">16KB atomic write feature</a>. Valid values:</p>
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
     * <li><strong>Serverless</strong> (not supported for MariaDB instances): serverless billing method.</li>
     * </ul>
     * <blockquote>
     * <p>To change the billing method to Serverless, you <strong>must configure the following parameters</strong>: automatic start and stop (AutoPause), scaling range (MaxCapacity and MinCapacity), and elastic policy (SwitchForce). For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Introduction to MySQL Serverless instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Introduction to SQL Server Serverless instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Introduction to PostgreSQL Serverless instances</a>.</p>
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
     * <p>72329885****</p>
     */
    @NameInMap("PromotionCode")
    public String promotionCode;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/276980.html">target instance type of read-only instances</a> when you perform an Upgrade/Downgrade to change a MySQL high availability (HA) instance with Premium Local SSDs to a cloud disk instance. This parameter is active only when the instance meets the requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>mysqlro.n2.large.1c</p>
     */
    @NameInMap("ReadOnlyDBInstanceClass")
    public String readOnlyDBInstanceClass;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmy****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The serverless instance configuration for the specification change.</p>
     */
    @NameInMap("ServerlessConfiguration")
    public String serverlessConfigurationShrink;

    /**
     * <p>A deprecated parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The time at which the specification change is performed. <strong>Perform the specification change during off-peak hours.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/126002.html">minor engine version</a> of the PostgreSQL instance. If the specification change fails because the minor engine version is not supported, specify this parameter to <strong>upgrade the minor engine version during the specification change</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_postgres_1200_20200830</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The duration of the SQL Server <a href="https://help.aliyun.com/document_detail/95665.html">elastic upgrade</a>. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UsedTime")
    public Long usedTime;

    /**
     * <p>The vSwitch ID. The zone of the vSwitch must correspond to the zone ID specified in <strong>ZoneId</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1oxflciovg9l7******</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary node. If this value is the same as <strong>ZoneId</strong>, the instance uses single-zone deployment. If this value is different from <strong>ZoneId</strong>, the instance uses multi-zone deployment.</p>
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

    public ModifyDBInstanceSpecShrinkRequest setAllocateStrategy(String allocateStrategy) {
        this.allocateStrategy = allocateStrategy;
        return this;
    }
    public String getAllocateStrategy() {
        return this.allocateStrategy;
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
