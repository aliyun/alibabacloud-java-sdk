// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecRequest extends TeaModel {
    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition.</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition.</p>
     * <p>*   **Finance**: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</p>
     * <br>
     * <p>> If you set the **EngineVersion** parameter to an SQL Server version number, you must also specify this parameter.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The new instance type of the instance. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can call the [DescribeAvailableClasses](~~196546~~) operation to query the instance types that are available to a region.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must specify at least one of the DBInstanceClass and **DBInstanceStorage** parameters.</p>
     * <br>
     * <p>*   You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the in-use instance type of the instance.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new storage capacity of the instance. Unit: GB. You can increase the storage capacity at a step size of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~). You can call the [DescribeAvailableClasses](~~196546~~) operation to query the storage capacity range that is supported for an instance type.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must specify at least one of the DBInstanceStorage and **DBInstanceClass** parameters.</p>
     * <br>
     * <p>*   If the instance runs MySQL on RDS High-availability Edition with local SSDs, you can decrease the storage capacity at a step size of 5 GB.</p>
     * <br>
     * <p>*   You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the current storage capacity of the instance.</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The type of storage media that is used by the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSDs.</p>
     * <p>*   **cloud_ssd**: standard SSDs. This storage type is not recommended and is unavailable in some Alibaba Cloud regions.</p>
     * <p>*   **cloud_essd**: enhanced SSDs (ESSDs) of performance level 1 (PL1).</p>
     * <p>*   **cloud_essd2**: ESSD of PL2</p>
     * <p>*   **cloud_essd3**: ESSD of PL3</p>
     * <br>
     * <p>To change the storage type, take note of the following information:</p>
     * <br>
     * <p>*   If the instance runs MySQL or MariaDB and uses the standard SSD storage type, you can set the DBInstanceStorageType parameter to **cloud_essd** to upgrade the storage type of the instance to ESSD. If you want to upgrade the storage type of the instance, you must also set the **DBInstanceClass** parameter to the current instance type of the instance and the **DBInstanceStorage** parameter to the current storage capacity of the instance. For more information, see [Upgrade the storage type of an ApsaraDB RDS for MySQL instance from standard SSDs to ESSDs](~~314678~~).</p>
     * <p>*   If the instance runs PostgreSQL, you can upgrade the storage type of the instance from standard SSDs to ESSDs. However, you cannot downgrade the storage type of the instance from ESSDs to standard SSDs. ESSDs provide the following PLs: ESSDs of PL1, ESSDs of PL2, and ESSDs of PL3. You can upgrade or downgrade the storage type between ESSDs of PL1, ESSDs of PL2, and ESSDs of PL3. For more information, see [Configuration items](~~96750~~).</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The ID of the dedicated cluster to which the instance belongs.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>The type of the change that you want to perform on the instance. Valid values:</p>
     * <br>
     * <p>*   **Up**: upgrades a subscription instance, or upgrades or downgrades a pay-as-you-go instance.</p>
     * <p>*   **Down**: downgrades a subscription instance.</p>
     * <p>*   **TempUpgrade**: automatically changes the specifications of a subscription instance. This value is required for automatic specification changes.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Default value: **Up**.</p>
     * <br>
     * <p>*   If you specify only the **DBInstanceStorageType** parameter, you can leave the Direction parameter empty. For example, if you want to change only the storage type of the instance from standard SSDs to ESSDs, you do not need to specify the Direction parameter.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The time at which you want to apply the specification changes. Valid values:</p>
     * <br>
     * <p>* **Immediate**: The specification changes are immediately applied.</p>
     * <p>* **MaintainTime**: The specification changes are applied during the specified maintenance window. For more information, see [ModifyDBInstanceMaintainTime](~~26249~~).</p>
     * <br>
     * <p>Default value: **Immediate**.</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version of the instance.</p>
     * <br>
     * <p>*   Valid values for MySQL: **5.5, 5.6, 5.7, and 8.0**</p>
     * <p>*   Valid values for SQL Server: **2008r2, 08r2\_ent_ha, 2012, 2012\_ent_ha, 2012\_std_ha, 2012\_web, 2014\_std_ha, 2016\_ent_ha, 2016\_std_ha, 2016\_web, 2017\_std_ha, 2017\_ent, 2019\_std_ha, and 2019\_ent**</p>
     * <p>*   Valid values for PostgreSQL: **10.0, 11.0, 12.0, 13.0, 14.0, and 15.0**</p>
     * <p>*   Valid values for MariaDB: **10.3**</p>
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
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
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
     * <p>The specification changes of a serverless ApsaraDB RDS for MySQL instance.</p>
     */
    @NameInMap("ServerlessConfiguration")
    public ModifyDBInstanceSpecRequestServerlessConfiguration serverlessConfiguration;

    /**
     * <p>A deprecated parameter.</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The time at which you want to apply the specification changes. We recommend that you change the specifications during off-peak hours. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You must specify a point in time later than the current time, which refers to the time to call this operation. Otherwise, the specification change task fails. If the specification change task fails, you must wait for the order to be automatically canceled and then call this operation again.</p>
     * <br>
     * <p>*   If the specification change involves only the increase of the storage capacity or the change of the ESSD storage type between different PLs, the specification change immediately takes effect and does not affect your workloads. You do not need to configure this parameter.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The validity period of the specification changes on an ApsaraDB RDS for SQL Server instance. At the end of the validity period, the specification of the instance is restored to the specification that is used before an elastic upgrade is performed. Unit: days.</p>
     */
    @NameInMap("UsedTime")
    public Long usedTime;

    /**
     * <p>The ID of the zone in which the instance resides.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static ModifyDBInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecRequest self = new ModifyDBInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyDBInstanceSpecRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public ModifyDBInstanceSpecRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyDBInstanceSpecRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public ModifyDBInstanceSpecRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public ModifyDBInstanceSpecRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public ModifyDBInstanceSpecRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ModifyDBInstanceSpecRequest setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }
    public String getEffectiveTime() {
        return this.effectiveTime;
    }

    public ModifyDBInstanceSpecRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public ModifyDBInstanceSpecRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBInstanceSpecRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBInstanceSpecRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ModifyDBInstanceSpecRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifyDBInstanceSpecRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBInstanceSpecRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBInstanceSpecRequest setServerlessConfiguration(ModifyDBInstanceSpecRequestServerlessConfiguration serverlessConfiguration) {
        this.serverlessConfiguration = serverlessConfiguration;
        return this;
    }
    public ModifyDBInstanceSpecRequestServerlessConfiguration getServerlessConfiguration() {
        return this.serverlessConfiguration;
    }

    public ModifyDBInstanceSpecRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

    public ModifyDBInstanceSpecRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ModifyDBInstanceSpecRequest setUsedTime(Long usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Long getUsedTime() {
        return this.usedTime;
    }

    public ModifyDBInstanceSpecRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class ModifyDBInstanceSpecRequestServerlessConfiguration extends TeaModel {
        /**
         * <p>Specifies whether to support automatic suspension.</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS Capacity Units (RCUs).</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs.</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        /**
         * <p>Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:</p>
         * <br>
         * <p>*   **true**: The forced scaling feature is enabled.</p>
         * <p>*   **false**: The forced scaling feature is disabled. This is the default value.</p>
         */
        @NameInMap("SwitchForce")
        public Boolean switchForce;

        public static ModifyDBInstanceSpecRequestServerlessConfiguration build(java.util.Map<String, ?> map) throws Exception {
            ModifyDBInstanceSpecRequestServerlessConfiguration self = new ModifyDBInstanceSpecRequestServerlessConfiguration();
            return TeaModel.build(map, self);
        }

        public ModifyDBInstanceSpecRequestServerlessConfiguration setAutoPause(Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        public ModifyDBInstanceSpecRequestServerlessConfiguration setMaxCapacity(Double maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        public ModifyDBInstanceSpecRequestServerlessConfiguration setMinCapacity(Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        public ModifyDBInstanceSpecRequestServerlessConfiguration setSwitchForce(Boolean switchForce) {
            this.switchForce = switchForce;
            return this;
        }
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

    }

}
