// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDBInstanceSpecRequest extends TeaModel {
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
     * <p>An invalid parameter. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <ul>
     * <li><p>Regular instance</p>
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
     * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
     * <li><strong>Cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_standard</strong>: RDS High-availability Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server.</li>
     * </ul>
     * <p>**</p>
     * <p><strong>Note</strong> If you set the <strong>EngineVersion</strong> parameter to an SQL Server version number, you must also specify this parameter.</p>
     * </li>
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
     * <p>The new instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>. You can also call the DescribeAvailableClasses operation to query the instance types that are supported by an instance.</p>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of DBInstanceClass and <strong>DBInstanceStorage</strong>.</li>
     * <li>You can call the DescribeDBInstanceAttribute operation to query the current instance type of the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds.mys2.small</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5*******</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The new storage capacity of the instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>. You can also call the DescribeAvailableClasses operation to query the storage capacity range that is supported by the new instance type.</p>
     * <blockquote>
     * <ul>
     * <li>You must specify at least one of the DBInstanceStorage and <strong>DBInstanceClass</strong> parameters.</li>
     * <li>You can call the DescribeDBInstanceAttribute to query the current storage capacity of the instance.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSD.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD. This storage type is not recommended and is unavailable in some Alibaba Cloud regions.</li>
     * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD) of performance level 1 (PL1).</li>
     * <li><strong>cloud_essd2</strong>: ESSDs of PL2.</li>
     * <li><strong>cloud_essd3</strong>: ESSD of PL3.</li>
     * </ul>
     * <p>To change the storage type, take note of the following items:</p>
     * <p>If the instance runs PostgreSQL, you can upgrade the storage type of the instance from standard SSD to ESSD. However, you cannot downgrade the storage type of the instance from ESSD to standard SSD. ESSDs provide the following PLs: PL1, PL2, and PL3. You can upgrade or downgrade the storage type between ESSD of PL1, ESSD of PL2, and ESSD of PL3. For more information, see <a href="https://help.aliyun.com/document_detail/96750.html">Configuration items</a>.</p>
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
     * <li><strong>Serverless</strong>: modifies the auto scaling settings of a serverless instance. This value is required if you want to modify the auto scaling settings of a serverless instance.</li>
     * </ul>
     * <blockquote>
     * <p> If you specify only <strong>DBInstanceStorageType</strong>, you can leave Direction empty. For example, if you want to change only the storage type of the instance from standard SSD to ESSD, you do not need to specify Direction.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Up</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The time when you want the change to take effect. Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong> (default)</li>
     * <li><strong>MaintainTime</strong>: The effective time is within the maintenance window. For more information, see ModifyDBInstanceMaintainTime.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaintainTime</p>
     */
    @NameInMap("EffectiveTime")
    public String effectiveTime;

    /**
     * <p>The database engine version of the instance.</p>
     * <ul>
     * <li><p>Regular instance</p>
     * <ul>
     * <li>Valid values if you set the Engine parameter to MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
     * <li>Valid values if you set the Engine parameter to SQLServer: <strong>2008r2</strong>, <strong>08r2_ent_ha</strong>, <strong>2012</strong>, <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_std_ha</strong>, <strong>2017_ent</strong>, <strong>2019_std_ha</strong>, and <strong>2019_ent</strong></li>
     * <li>Valid values if you set the Engine parameter to PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, and <strong>15.0</strong></li>
     * <li>Valid value if you set the Engine parameter to MariaDB: <strong>10.3</strong></li>
     * </ul>
     * </li>
     * <li><p>Serverless instance</p>
     * <ul>
     * <li>Valid values if you set the Engine parameter to MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
     * <li>Valid values if you set the Engine parameter to SQLServer: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
     * <li>Valid values if you set the Engine parameter to PostgreSQL: <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong></li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>ApsaraDB RDS for MariaDB does not support serverless instances.</p>
     * </blockquote>
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

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Serverless</strong>: serverless. This value is not supported for instances that run MariaDB. If you set the value to Serverless, you must specify the scaling range of computing resources, configure the automatic start and stop feature, and configure auto scaling policies for your serverless instance. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

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
     * <blockquote>
     * <p> This parameter is available only on the China site (aliyun.com).</p>
     * </blockquote>
     */
    @NameInMap("ServerlessConfiguration")
    public ModifyDBInstanceSpecRequestServerlessConfiguration serverlessConfiguration;

    /**
     * <p>A deprecated parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Specifies whether to enable the automatic suspension feature.</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The number of the minor version.</p>
     * <p>This parameter is required only for instances that run PostgreSQL. If the minor engine version does not support changing the instance type, you must specify the minor engine version to update the minor engine version when you change the instance type.</p>
     * <p>Format: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. Example: <code>rds_postgres_1200_20200830</code>.</p>
     * <blockquote>
     * <p> For more information about minor engine versions, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes for AliPG</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rds_postgres_1200_20200830</p>
     */
    @NameInMap("TargetMinorVersion")
    public String targetMinorVersion;

    /**
     * <p>The ID of the order.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("UsedTime")
    public Long usedTime;

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

    public static ModifyDBInstanceSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBInstanceSpecRequest self = new ModifyDBInstanceSpecRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBInstanceSpecRequest setAutoUseCoupon(Boolean autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public ModifyDBInstanceSpecRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public ModifyDBInstanceSpecRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public ModifyDBInstanceSpecRequest setColdDataEnabled(Boolean coldDataEnabled) {
        this.coldDataEnabled = coldDataEnabled;
        return this;
    }
    public Boolean getColdDataEnabled() {
        return this.coldDataEnabled;
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

    public ModifyDBInstanceSpecRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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

    public ModifyDBInstanceSpecRequest setTargetMinorVersion(String targetMinorVersion) {
        this.targetMinorVersion = targetMinorVersion;
        return this;
    }
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
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
         * <p>Specifies whether to enable the automatic start and stop feature for the serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for serverless instances that run MySQL and PostgreSQL. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is automatically resumed.</li>
         * <li>This parameter is available only on the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         * 
         * <strong>if can be null:</strong>
         * <p>false</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
         * <ul>
         * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>1 to 32</strong></li>
         * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong></li>
         * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>1 to 14</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong> and can be specified only to an <strong>integer</strong>.</li>
         * <li>This parameter is available only on the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs. Valid values:</p>
         * <ul>
         * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>0.5 to 32</strong>.</li>
         * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong>. Only integers are supported.</li>
         * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>0.5 to 14</strong>.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The value of this parameter must be less than or equal to the value of MaxCapacity.</li>
         * <li>This parameter is available only on the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        /**
         * <p>Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required only for serverless instances that run MySQL and PostgreSQL. If you set this parameter to true, a service interruption that lasts 30 to 120 seconds occurs during forced scaling. Process with caution.</li>
         * <li>The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.</li>
         * <li>This parameter is available only on the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
