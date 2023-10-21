// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to use vouchers to offset fees. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default)</p>
     */
    @NameInMap("AutoUseCoupon")
    public Boolean autoUseCoupon;

    /**
     * <p>An invalid parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   Regular instance</p>
     * <br>
     * <p>    *   **Basic**: RDS Basic Edition</p>
     * <p>    *   **HighAvailability**: RDS High-availability Edition</p>
     * <p>    *   **AlwaysOn**: RDS Cluster Edition for SQL Server</p>
     * <p>    *   **AlwaysOn**: RDS Cluster Edition for SQL Server</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   **serverless_basic**: RDS Serverless Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</p>
     * <p>    *   **serverless_standard**: RDS Serverless High-availability Edition for MySQL.</p>
     * <p>    *   **serverless_ha** RDS Serverless High-availability Edition for SQL Server.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**If you set **EngineVersion** to an SQL Server version number, you must also specify this parameter.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The new instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can also call the [DescribeAvailableClasses](~~610393~~) operation to query the instance types that are supported by an instance.</p>
     * <br>
     * <p>- You must specify at least one of DBInstanceClass and **DBInstanceStorage**.</p>
     * <p>- You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to query the current instance type of the instance.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID. You can call the [DescribeDBInstances](~~610396~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new storage capacity of the instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can call the [DescribeAvailableClasses](~~610393~~) operation to query the storage capacity range that is supported by the new instance type.</p>
     * <br>
     * <p>*   You must specify at least one of the DBInstanceStorage and **DBInstanceClass** parameters.</p>
     * <p>*   You can call the [DescribeDBInstanceAttribute](~~610394~~) operation to query the current storage capacity of the instance.</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSD.</p>
     * <p>*   **cloud_ssd**: standard SSD. This storage type is not recommended and is unavailable in some Alibaba Cloud regions.</p>
     * <p>*   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1).</p>
     * <p>*   **cloud_essd2**: ESSDs of PL2.</p>
     * <p>*   **cloud_essd3**: ESSD of PL3.</p>
     * <br>
     * <p>To change the storage type, take note of the following items:</p>
     * <br>
     * <p>If the instance runs PostgreSQL, you can upgrade the storage type of the instance from standard SSD to ESSD. However, you cannot downgrade the storage type of the instance from ESSD to standard SSD. ESSDs provide the following PLs: PL1, PL2, and PL3. You can upgrade or downgrade the storage type between ESSD of PL1, ESSD of PL2, and ESSD of PL3. For more information, see [Configuration items](~~96750~~).</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The ID of the dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The type of change that you want to perform on the instance. Valid values:</p>
     * <br>
     * <p>*   **Up** (default): upgrades a subscription instance, or upgrades or downgrades a pay-as-you-go instance.</p>
     * <p>*   **Down**: downgrades a subscription instance.</p>
     * <p>*   **TempUpgrade**: performs auto scaling on a subscription instance that runs SQL Server. This value is required for auto scaling.</p>
     * <p>*   **Serverless**: modifies the auto scaling settings of a serverless instance This value is required if you want to modify the auto scaling settings of a serverless instance.</p>
     * <br>
     * <p>>  If you specify only **DBInstanceStorageType**, you can leave Direction empty. For example, if you want to change only the storage type of the instance from standard SSD to ESSD, you do not need to specify Direction.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The effective time. Valid values:</p>
     * <br>
     * <p>*   **Immediately**: This is the default value.</p>
     * <p>*   **MaintainTime**: The effective time is within the maintenance window. For more information, see [ModifyDBInstanceMaintainTime](~~610402~~).</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version of the instance.</p>
     * <br>
     * <p>*   Regular instance</p>
     * <br>
     * <p>    *   Valid values if you set Engine to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**</p>
     * <p>    *   Valid values if you set Engine to SQLServer: **2008r2**, **08r2\_ent_ha**, **2012**, **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2014\_std_ha**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_std_ha**, **2017\_ent**, **2019\_std_ha**, and **2019\_ent**</p>
     * <p>    *   Valid values if you set Engine to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, and **15.0**</p>
     * <p>    *   Valid value if you set Engine to MariaDB: **10.3**</p>
     * <br>
     * <p>*   Serverless instance</p>
     * <br>
     * <p>    *   Valid values if you set Engine to MySQL: **5.7** and **8.0**</p>
     * <p>    *   Valid values if you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**</p>
     * <p>    *   Valid value if you set Engine to PostgreSQL: **14.0**</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription.</p>
     * <p>*   **Serverless**: serverless. This value is not supported for instances that run MariaDB. If you set the value to Serverless, you must specify the scaling range of computing resources, configure the automatic start and stop feature, and configure auto scaling policies for your serverless instance. For more information, see [Overview of serverless ApsaraDB RDS for MySQL instances](~~411291~~), [Overview of serverless ApsaraDB RDS for SQL Server instances](~~604344~~), and [Overview of serverless ApsaraDB RDS for PostgreSQL instances](~~607742~~).</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The serverless instance on which you want to perform the specification change.</p>
     */
    @NameInMap("ServerlessConfiguration")
    public String serverlessConfigurationShrink;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The number of the minor version.</p>
     * <br>
     * <p>This parameter is required only for instances that run PostgreSQL. If the minor engine version does not support changing the instance type, you must specify the minor engine version to update the minor engine version when you change the instance type.</p>
     * <br>
     * <p>Format: `rds_postgres_<Major engine version>00_<Minor engine version>`. Example: `rds_postgres_1200_20200830`.</p>
     * <br>
     * <p>>  For more information about minor engine versions, see [Release notes for AliPG](~~126002~~).</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("UsedTime")
    public Long usedTime;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition.</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition.</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition for SQL Server.</p>
     * <p>*   **Finance**: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</p>
     * <br>
     * <p>> If you set **EngineVersion** to an SQL Server version number, you must also specify this parameter.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyDBInstanceSpecShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecShrinkRequest self = new ModifyDBInstanceSpecShrinkRequest();
        return TeaModel.build(map, self);
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

    public ModifyDBInstanceSpecShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
