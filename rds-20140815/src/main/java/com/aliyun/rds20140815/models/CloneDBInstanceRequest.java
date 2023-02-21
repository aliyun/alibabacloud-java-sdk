// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneDBInstanceRequest extends TeaModel {
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
     * <p>The backup type. Valid values:</p>
     * <br>
     * <p>*   **FullBackup**: full backup</p>
     * <p>*   **IncrementalBackup**: incremental backup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>The RDS edition of the new instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition.</p>
     * <p>*   **HighAvailability**: RDS High-availability Edition.</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition for SQL Server.</p>
     * <p>*   **cluster**: RDS Cluster Edition for MySQL.</p>
     * <p>*   **Finance**: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</p>
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
     * <p>The storage type of the new instance. Valid values:</p>
     * <br>
     * <p>*   **local_ssd**: local SSD</p>
     * <p>*   **cloud_ssd**: standard SSD</p>
     * <p>*   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1)</p>
     * <p>*   **cloud_essd2**: ESSD of PL2</p>
     * <p>*   **cloud_essd3**: ESSD of PL3</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The name of the database. If you specify more than one database, specify the value in the following format: {"Original database name 1":"New database name 1","Original database name 2":"New database name 2"}</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The ID of the dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the new instance. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the feature.</p>
     * <p>*   **false**: disables the feature.</p>
     * <br>
     * <p>Default value: **false**</p>
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
     * <p>The billing method of the new instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit that is used to calculate the billing cycle of the new instance. This parameter takes effect only when you select the subscription billing method for the new instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     * <br>
     * <p>> If you set the PayType parameter to **Prepaid**, you must also specify the UsedTime parameter.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address of the new instance, which must be within the CIDR block supported by the specified vSwitch. The system automatically assigns an internal IP address to the read-only instance based on the values of the **VPCId** and **VSwitchId** parameters.</p>
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
     * <p>The configuration of a serverless instance. You must specify this parameter only when you restore data to a new serverless instance.</p>
     */
    @NameInMap("ServerlessConfig")
    public CloneDBInstanceRequestServerlessConfig serverlessConfig;

    /**
     * <p>The information about the database and table that you want to restore. The value is in the following format: </p>
     * <br>
     * <p>```</p>
     * <p>[{"type":"db","name":"Name of Database 1","newname":"New name of Database 1","tables":[{"type":"table","name":"Name of Table 1 in Database 1","newname":"New name of Table 1"},{"type":"table","name":"Name of Table 2 in Database 1","newname":"New name of Table 2"}]},{"type":"db","name":"Name of Database 2","newname":"New name of Database 2","tables":[{"type":"table","name":"Name of Table 1 in Database 2","newname":"New name of Table 1"},{"type":"table","name":"Name of Table 2 in Database 2","newname":"New name of Table 2"}]}]</p>
     * <p>```</p>
     */
    @NameInMap("TableMeta")
    public String tableMeta;

    /**
     * <p>The subscription duration of the new instance. Valid values:</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the UsedTime parameter ranges from **1 to 3**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the UsedTime parameter ranges from **1 to 9**.</p>
     * <br>
     * <p>> If you set the PayType parameter to **Prepaid**, you must also specify the UsedTime parameter.</p>
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
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>> Make sure that the vSwitch belongs to the required VPC and region.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the new instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent zone list.</p>
     * <br>
     * <p>> By default, the new instance resides in the same region as the original instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CloneDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDBInstanceRequest self = new CloneDBInstanceRequest();
        return TeaModel.build(map, self);
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
         * <p>Specifies whether to enable the automatic start and stop feature for the serverless instance. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection is established to the instance, the instance is automatically resumed. Valid values:</p>
         * <br>
         * <p>*   true: enables the feature.</p>
         * <p>*   false: disables the feature. This is the default value.</p>
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
         * <p>Specifies whether to enable the forced scaling feature for the serverless instance. In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance. Valid values:</p>
         * <br>
         * <p>*   true: enables the feature.</p>
         * <p>*   false: disables the feature. This is the default value.</p>
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
