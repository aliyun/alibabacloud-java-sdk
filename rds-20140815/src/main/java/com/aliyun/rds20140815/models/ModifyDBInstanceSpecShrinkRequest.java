// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecShrinkRequest extends TeaModel {
    /**
     * <p>The resource allocation strategy. Valid values: ForceLocal and Optional. You cannot set this parameter to ForceLocal when you downgrade the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Optional</p>
     */
    @NameInMap("AllocateStrategy")
    public String allocateStrategy;

    /**
     * <p>Specifies whether to perform a <a href="https://help.aliyun.com/document_detail/127458.html">major engine version upgrade</a> for the ApsaraDB RDS for SQL Server instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs the upgrade.</li>
     * <li><strong>false</strong> (default): does not perform the upgrade.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>When you perform a major engine version upgrade, you must also pass the other required parameters, including DBInstanceId, EngineVersion, DBInstanceClass, Category, ZoneId, and VSwitchId.</li>
     * <li>If you want to upgrade the instance to the high availability series or Cluster Edition, you must also specify the ZoneIdSlave1 parameter.</li>
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
     * <li><strong>true</strong> (default): uses vouchers.</li>
     * <li><strong>false</strong>: does not use vouchers.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2340501.html">I/O performance burst feature for premium performance disks</a>. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: disables the feature.</li>
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
     * <p>This parameter is required when <strong>EngineVersion</strong> is set to a SQL Server version number.</p>
     * </blockquote>
     * <details>
     * <summary>Regular ApsaraDB RDS instances</summary>
     * 
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition</li>
     * <li><strong>HighAvailability</strong>: high availability series</li>
     * <li><strong>AlwaysOn</strong>: Cluster Edition (for SQL Server)</li>
     * <li><strong>Cluster</strong>: Cluster Edition (for MySQL)</li>
     * <li>&lt;props=&quot;china&quot;&gt;<strong>Finance</strong>: Finance Edition</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>Serverless ApsaraDB RDS instances (not supported for MariaDB)</summary>
     * 
     * <ul>
     * <li><strong>serverless_basic</strong>: Serverless Basic Edition (only for MySQL and PostgreSQL)</li>
     * <li><strong>serverless_standard</strong>: Serverless high availability series (only for MySQL and PostgreSQL)</li>
     * <li><strong>serverless_ha</strong>: Serverless high availability series (only for SQL Server)</li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2701832.html">data archiving feature</a> for premium performance disks. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: enables the feature.</p>
     * </li>
     * <li><p><strong>false</strong>: disables the feature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ColdDataEnabled")
    public Boolean coldDataEnabled;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2861985.html">storage compression feature</a> for ApsaraDB RDS for MySQL. Valid values:</p>
     * <ul>
     * <li><strong>on</strong>: enables the feature.</li>
     * <li><strong>off</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("CompressionMode")
    public String compressionMode;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/26312.html">target instance type</a>. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the available instance types.</p>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of the <strong>DBInstanceClass</strong> and <strong>DBInstanceStorage</strong> parameters.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to view the current instance type.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mysql.n8.large.2c</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>Instance ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/610396.html">DescribeDBInstances</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/26312.html">target storage capacity</a>. Unit: GB. You can call the <a href="https://help.aliyun.com/document_detail/610393.html">DescribeAvailableClasses</a> operation to query the available storage capacity range for the target instance type.</p>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of the <strong>DBInstanceStorage</strong> and <strong>DBInstanceClass</strong> parameters.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/610394.html">DescribeDBInstanceAttribute</a> operation to view the current storage capacity of the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: premium local SSD</li>
     * <li><strong>cloud_ssd</strong>: standard SSD (not recommended; no longer available in some regions)</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
     * <li><strong>general_essd</strong>: premium performance disk</li>
     * </ul>
     * <p>When you change the storage type of the instance, note the following items:
     * &lt;props=&quot;china&quot;&gt;* If you change the storage type from ESSD to premium performance disk, other parameters such as the instance type and storage capacity must remain unchanged and cannot be modified.</p>
     * <p>&lt;props=&quot;china&quot;&gt;* For ApsaraDB RDS for MySQL or ApsaraDB RDS for MariaDB instances whose storage type is standard SSD, you can set this parameter to <code>cloud_essd</code> to <a href="https://help.aliyun.com/document_detail/314678.html">upgrade the storage type to ESSD</a>. To perform the upgrade, you must specify both <strong>DBInstanceClass</strong> and <strong>DBInstanceStorage</strong>, and their values must be the same as the current values of the instance.</p>
     * <p>&lt;props=&quot;china&quot;&gt;* For ApsaraDB RDS for PostgreSQL instances, you can upgrade standard SSDs to <a href="https://help.aliyun.com/document_detail/96750.html">ESSDs of any PL</a>, but <strong>you cannot downgrade ESSDs to standard SSDs</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;For ApsaraDB RDS for PostgreSQL instances, you can upgrade standard SSDs to <a href="https://help.aliyun.com/document_detail/96750.html">ESSDs of any PL</a>, but <strong>you cannot downgrade ESSDs to standard SSDs</strong>.</p>
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
     * <p>dhg-7a9****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The type of specification change. Valid values:</p>
     * <ul>
     * <li><strong>Up</strong> (default): upgrade for subscription instances, and upgrade or downgrade for pay-as-you-go instances.</li>
     * <li><strong>Down</strong>: downgrade for subscription instances.</li>
     * <li><strong>TempUpgrade</strong>: elastic specification change for subscription ApsaraDB RDS for SQL Server instances. This value is required for elastic specification changes.</li>
     * <li><strong>Serverless</strong>: elastic setting adjustment for Serverless instances.</li>
     * </ul>
     * <blockquote>
     * <p>If you only change the <strong>DBInstanceStorageType</strong> parameter, such as changing standard SSDs to ESSDs, leave this parameter empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The effective period of the new configurations. Valid values:</p>
     * <blockquote>
     * <p><strong>Changing some configurations may affect the instance</strong>. Read the <a href="https://help.aliyun.com/document_detail/96061.html">Impact section in the feature documentation</a> before you configure this parameter. We recommend that you perform the operation during off-peak hours.</p>
     * </blockquote>
     * <ul>
     * <li><strong>Immediate</strong> (default): The new configurations immediately take effect.</li>
     * <li><strong>MaintainTime</strong>: The new configurations take effect within the <a href="https://help.aliyun.com/document_detail/610402.html">maintenance window</a>.</li>
     * <li><strong>ScheduleTime</strong>: The new configurations take effect at a specified time. The specified time must be at least 12 hours later than the current time. The actual switchover time follows the formula: EffectiveTime = ScheduleTime + SwitchTime.</li>
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
     * <li>MySQL: 5.5, 5.6, 5.7, and 8.0</li>
     * <li>SQL Server: 2008r2, 08r2_ent_ha, 2012, 2012_ent_ha, 2012_std_ha, 2012_web, 2014_std_ha, 2016_ent_ha, 2016_std_ha, 2016_web, 2017_std_ha, 2017_ent, 2019_std_ha, 2019_ent, 2022_web, 2022_std_ha, 2022_ent, 2025_std, and 2025_ent</li>
     * <li>PostgreSQL: 10.0, 11.0, 12.0, 13.0, 14.0, and 15.0</li>
     * <li>MariaDB: 10.3</li>
     * </ul>
     * </details>
     * 
     * <details>
     * <summary>Serverless ApsaraDB RDS instances (not supported for MariaDB)</summary>
     * 
     * <ul>
     * <li>MySQL: 5.7 and 8.0</li>
     * <li>SQL Server: 2016_std_sl, 2017_std_sl, and 2019_std_sl</li>
     * <li>PostgreSQL: 14.0, 15.0, and 16.0</li>
     * </ul>
     * </details>
     * 
     * <strong>example:</strong>
     * <p>8.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE) feature</a> for premium performance disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the feature.</li>
     * <li><strong>0</strong>: disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2858761.html">16KB atomic write feature</a> for ApsaraDB RDS for MySQL. Valid values:</p>
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
     * <p>The current billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Serverless</strong> (not supported for ApsaraDB RDS for MariaDB instances): Serverless.</li>
     * </ul>
     * <blockquote>
     * <p>To change the billing method to Serverless, <strong>you must configure</strong> the auto-start and auto-stop (AutoPause), scaling range (MaxCapacity and MinCapacity), and elastic policy (SwitchForce) parameters. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of Serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of Serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of Serverless ApsaraDB RDS for PostgreSQL instances</a>.</p>
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
     * <p>The <a href="https://help.aliyun.com/document_detail/276980.html">target instance type of the read-only instance</a> when you change the specifications of an ApsaraDB RDS for MySQL High-availability Edition instance with Premium Local SSDs to a cloud disk instance.</p>
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
     * <p>The configurations for changing the Serverless instance.</p>
     */
    @NameInMap("ServerlessConfiguration")
    public String serverlessConfigurationShrink;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be configured.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The time when the specification change is performed. <strong>We recommend that you perform the specification change during off-peak hours</strong>.</p>
     * <p>Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC time).</p>
     * <blockquote>
     * <ul>
     * <li>The specified time <strong>must be later than the current time</strong> (the time when the API call is initiated). Otherwise, the specification change task fails. After the task fails, you must wait for the order to be automatically canceled before you can initiate the call again.</li>
     * <li>If you only increase the storage capacity or change the ESSD storage type, the specification change is performed immediately after submission because it does not affect your business. You do not need to configure this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The <a href="https://help.aliyun.com/document_detail/126002.html">minor engine version</a> of the ApsaraDB RDS for PostgreSQL instance. When you change the instance type and an error indicating that the minor engine version is not supported is returned, you must specify the minor engine version <strong>to upgrade the minor engine version during the instance type change</strong>.</p>
     * <p>Format: <code>rds_postgres_&lt;Major version number&gt;00_&lt;Minor version number&gt;</code>. Example for version 12 released on August 30, 2020: <code>rds_postgres_1200_20200830</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>rds_postgres_1200_20200830</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The duration of the <a href="https://help.aliyun.com/document_detail/95665.html">elastic upgrade</a> for the ApsaraDB RDS for SQL Server instance. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UsedTime")
    public Long usedTime;

    /**
     * <p>The vSwitch ID. The zone where the vSwitch resides must correspond to the zone ID specified in <strong>ZoneId</strong>.</p>
     * <ul>
     * <li>The network type <strong>InstanceNetworkType</strong> must be set to <strong>VPC</strong>.</li>
     * <li>If you specify ZoneSlaveId1 (the secondary zone ID), you must specify two vSwitch IDs and separate them with a comma (,).<blockquote>
     * <p>You only need to specify the vSwitch when you upgrade the major engine version of an ApsaraDB RDS for SQL Server instance (AllowMajorVersionUpgrade), or when you need to set this parameter to switch the vSwitch.</p>
     * </blockquote>
     * </li>
     * </ul>
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
     * <p>The zone ID of the secondary node. If this value is the same as the value of <strong>ZoneId</strong>, it is a single-zone deployment. If this value is different from the value of <strong>ZoneId</strong>, it is a multi-zone deployment.</p>
     * <blockquote>
     * <p>You only need to specify the secondary zone when you upgrade the major engine version of an ApsaraDB RDS for SQL Server instance (AllowMajorVersionUpgrade), or when you need to set this parameter to switch the secondary zone.</p>
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
