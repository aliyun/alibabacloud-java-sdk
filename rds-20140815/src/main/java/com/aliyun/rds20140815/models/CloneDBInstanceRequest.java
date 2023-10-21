// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically complete the payment. Valid values:</p>
     * <br>
     * <p>1.  **true**: automatically completes the payment. You must make sure that your account balance is sufficient.</p>
     * <p>2.  **false**: does not automatically complete the payment. An unpaid order is generated.</p>
     * <br>
     * <p>> The default value is true. If your account balance is insufficient, you can set AutoPay to false to generate an unpaid order. Then, you can pay for the order in the ApsaraDB RDS console.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the backup set.</p>
     * <br>
     * <p>You can call the [DescribeBackups](~~26273~~) operation to query the backup sets.</p>
     * <br>
     * <p>> You must specify at least one of the **BackupId** and **RestoreTime** parameters.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The type of backup that is used to restore the data of the original instance. Valid values:</p>
     * <br>
     * <p>*   **FullBackup**</p>
     * <p>*   **IncrementalBackup**</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition.</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition.</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition for SQL Server.</p>
     * <p>*   **cluster**: RDS Cluster Edition for MySQL.</p>
     * <p>*   **Finance**: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</p>
     * <br>
     * <p>**Serverless instance**</p>
     * <br>
     * <p>*   **serverless_basic**: RDS Serverless Basic Edition. This edition is available only for instances that run MySQL and PostgreSQL.</p>
     * <p>*   **serverless_standard**: RDS Serverless High-availability Edition for MySQL.</p>
     * <p>*   **serverless_ha**: RDS Serverless High-availability Edition for SQL Server.</p>
     * <br>
     * <p>>  You do not need to configure this parameter. The value of this parameter is the same as that of the original instance.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The instance type of the new instance. For information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
     * <br>
     * <p>> By default, the new instance uses the same instance type as the original primary instance.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the new instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).</p>
     * <br>
     * <p>> By default, the new instance has the same storage capacity as the original primary instance.</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSDs</p>
     * <p>*   **cloud_ssd**: standard SSDs</p>
     * <p>*   **cloud_essd**: enhanced SSDs (ESSDs) of performance level 1 (PL1)</p>
     * <p>*   **cloud_essd2**: ESSDs of PL2</p>
     * <p>*   **cloud_essd3**: ESSD of PL3</p>
     * <br>
     * <p>> Serverless instances support only ESSDs of PL 1. For a serverless instance, you must set this parameter to **cloud_essd**.</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The name of the database. If you specify more than one database, the value is in the following format: `Original database name 1,Original database name 2`.</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The ID of the dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the feature.</p>
     * <p>*   **false** (default): disables the feature.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The network type of the new instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**</p>
     * <p>*   **Classic**</p>
     * <br>
     * <p>> By default, the new instance has the same network type as the original primary instance.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go.</p>
     * <p>*   **Prepaid**: subscription.</p>
     * <p>*   **Serverless**: serverless. This value is not supported for instances that run MariaDB. For more information, see [Overview of serverless ApsaraDB RDS for MySQL instances](~~411291~~), [Overview of serverless ApsaraDB RDS for SQL Server instances](~~604344~~), and [Overview of serverless ApsaraDB RDS for PostgreSQL instances](~~607742~~).</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit that is used to calculate the billing cycle of the new instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>> If you set the PayType parameter to **Prepaid**, you must also specify this parameter.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address of the new instance, which must be within the CIDR block supported by the specified vSwitch. The system automatically assigns an internal IP address based on the values of the **VPCId** and **VSwitchId** parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID of the new instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to restore only the databases and tables that you specify. The value **1** specifies to restore only the specified databases and tables. If you do not want to restore only the specified databases or tables, you do not need to specify this parameter.</p>
     */
    @NameInMap("RestoreTable")
    public String restoreTable;

    /**
     * <p>The point in time to which you want to restore data. The point in time must fall within the specified backup retention period. Specify the time in the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time must be in UTC.</p>
     * <br>
     * <p>> You must specify at least one of the **BackupId** and **RestoreTime** parameters.</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The configuration of the serverless instance. You must specify this parameter only when you restore data to a new serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public CloneDBInstanceRequestServerlessConfig serverlessConfig;

    /**
     * <p>The information about the database and table that you want to restore. The value is in the following format: `[{"type":"db","name":"Name of Database 1","newname":"New name of Database 1","tables":[{"type":"table","name":"Name of Table 1 in Database 1","newname":"New name of Table 1"},{"type":"table","name":"Name of Table 2 in Database 1","newname":"New name of Table 2"}]},{"type":"db","name":"Name of Database 2","newname":"New name of Database 2","tables":[{"type":"table","name":"Name of Table 1 in Database 2","newname":"New name of Table 1"},{"type":"table","name":"Name of Table 2 in Database 2","newname":"New name of Table 2"}]}]`</p>
     */
    @NameInMap("TableMeta")
    public String tableMeta;

    /**
     * <p>The subscription duration of the new instance. Valid values:</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the UsedTime parameter ranges from **1 to 3**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the UsedTime parameter ranges from **1 to 9**.</p>
     * <br>
     * <p>> If you set the PayType parameter to **Prepaid**, you must also specify this parameter.</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <br>
     * <p>> Make sure that the VPC belongs to the required region.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. The vSwitch must belong to the zone that is specified by the **ZoneId** parameter.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you set the **InstanceNetworkType** parameter to **VPC**, you must also specify this parameter.</p>
     * <br>
     * <p>*   If you specify the **ZoneSlaveId1** parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the primary instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent zone list.</p>
     * <br>
     * <p>> By default, the new instance resides in the same region as the original instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary instance. If you set the ZoneIdSlave1 parameter and the **ZoneId** parameter to the same value, the single-zone deployment method is used. If you set the ZoneIdSlave1 parameter and the **ZoneId** parameter to different values, the multi-zone deployment method is used.</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The zone ID of the logger instance. If you set the ZoneIdSlave2 parameter to the same value as the **ZoneId** parameter, the single-zone deployment method is used. If you set the ZoneIdSlave2 parameter to a different value from the **ZoneId** parameter, the multi-zone deployment method is used.</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CloneDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDBInstanceRequest self = new CloneDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CloneDBInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CloneDBInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CloneDBInstanceRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CloneDBInstanceRequest setBpeEnabled(String bpeEnabled) {
        this.bpeEnabled = bpeEnabled;
        return this;
    }
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    public CloneDBInstanceRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CloneDBInstanceRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CloneDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CloneDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CloneDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CloneDBInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CloneDBInstanceRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public CloneDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CloneDBInstanceRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CloneDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CloneDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CloneDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CloneDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CloneDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloneDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloneDBInstanceRequest setRestoreTable(String restoreTable) {
        this.restoreTable = restoreTable;
        return this;
    }
    public String getRestoreTable() {
        return this.restoreTable;
    }

    public CloneDBInstanceRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CloneDBInstanceRequest setServerlessConfig(CloneDBInstanceRequestServerlessConfig serverlessConfig) {
        this.serverlessConfig = serverlessConfig;
        return this;
    }
    public CloneDBInstanceRequestServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    public CloneDBInstanceRequest setTableMeta(String tableMeta) {
        this.tableMeta = tableMeta;
        return this;
    }
    public String getTableMeta() {
        return this.tableMeta;
    }

    public CloneDBInstanceRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CloneDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CloneDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CloneDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CloneDBInstanceRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CloneDBInstanceRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static class CloneDBInstanceRequestServerlessConfig extends TeaModel {
        /**
         * <p>Specifies whether to enable the automatic start and stop feature for the serverless ApsaraDB RDS for MySQL instance. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection is established to the instance, the instance is automatically resumed. Valid values:</p>
         * <br>
         * <p>*   **true**: enables the feature.</p>
         * <p>*   **false** (default): disables the feature.</p>
         * <br>
         * <p>> This parameter is supported only for serverless ApsaraDB RDS for MySQL instances.</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
         * <br>
         * <p>*   Serverless ApsaraDB RDS for MySQL instances: **1 to 8**</p>
         * <p>*   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**</p>
         * <p>*   Serverless ApsaraDB RDS for PostgreSQL instances: **1 to 12**</p>
         * <br>
         * <p>> The value of this parameter must be greater than or equal to the value of **MinCapacity** and can be specified only to an **integer**.</p>
         */
        @NameInMap("MaxCapacity")
        public Double maxCapacity;

        /**
         * <p>The minimum number of RCUs. Valid values:</p>
         * <br>
         * <p>*   Serverless ApsaraDB RDS for MySQL instances: **0.5 to 8**.</p>
         * <p>*   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**. Only integers are supported.</p>
         * <p>*   Serverless ApsaraDB RDS for PostgreSQL instances: **0.5 to 12**.</p>
         * <br>
         * <p>> The value of this parameter must be less than or equal to the value of **MaxCapacity**.</p>
         */
        @NameInMap("MinCapacity")
        public Double minCapacity;

        /**
         * <p>Specifies whether to enable the forced scaling feature for the serverless ApsaraDB RDS for MySQL instance. In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance. Valid values:</p>
         * <br>
         * <p>*   **true**: enables the feature.</p>
         * <p>*   **false** (default): disables the feature.</p>
         * <br>
         * <p>> This parameter is supported only for serverless ApsaraDB RDS for MySQL instances.</p>
         */
        @NameInMap("SwitchForce")
        public Boolean switchForce;

        public static CloneDBInstanceRequestServerlessConfig build(java.util.Map<String, ?> map) throws Exception {
            CloneDBInstanceRequestServerlessConfig self = new CloneDBInstanceRequestServerlessConfig();
            return TeaModel.build(map, self);
        }

        public CloneDBInstanceRequestServerlessConfig setAutoPause(Boolean autoPause) {
            this.autoPause = autoPause;
            return this;
        }
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        public CloneDBInstanceRequestServerlessConfig setMaxCapacity(Double maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        public CloneDBInstanceRequestServerlessConfig setMinCapacity(Double minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        public CloneDBInstanceRequestServerlessConfig setSwitchForce(Boolean switchForce) {
            this.switchForce = switchForce;
            return this;
        }
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

    }

}
