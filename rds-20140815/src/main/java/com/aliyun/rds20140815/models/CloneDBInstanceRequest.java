// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
     * <ol>
     * <li><strong>true</strong>: enables the feature. You must make sure that your account balance is sufficient.</li>
     * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
     * </ol>
     * <blockquote>
     * <p> Default value: true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The backup set ID.</p>
     * <p>You can call the DescribeBackups operation to query the backup set ID.</p>
     * <blockquote>
     * <p> You must specify at least one of the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>902****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The type of backup that is used to restore the data of the original instance. Valid values:</p>
     * <ul>
     * <li><strong>FullBackup</strong></li>
     * <li><strong>IncrementalBackup</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullBackup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BpeEnabled")
    public String bpeEnabled;

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
     * <ul>
     * <li><strong>Basic</strong>: RDS Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
     * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server.</li>
     * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL.</li>
     * <li><strong>Finance</strong>: RDS Enterprise Edition. This edition is available only on the China site (aliyun.com).</li>
     * </ul>
     * <p><strong>Serverless instances</strong></p>
     * <ul>
     * <li><strong>serverless_basic</strong>: RDS Basic Edition. This edition is available only for serverless instances that run MySQL and PostgreSQL.</li>
     * <li><strong>serverless_standard</strong>: RDS High-availability Edition for ApsaraDB RDS for MySQL</li>
     * <li><strong>serverless_ha</strong>: RDS High-availability Edition for ApsaraDB RDS for SQL Server</li>
     * </ul>
     * <blockquote>
     * <p> You do not need to configure this parameter. The value of this parameter is the same as that of the original instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The instance type of the new instance. For information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
     * <blockquote>
     * <p>By default, the new instance uses the same instance type as the original primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mysql.n1.micro.1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the new instance. Unit: GB. You can increase the storage capacity in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
     * <blockquote>
     * <p>By default, the new instance has the same storage capacity as the original primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>local_ssd</strong>: local SSDs</li>
     * <li><strong>cloud_ssd</strong>: standard SSDs</li>
     * <li><strong>cloud_essd</strong>: enhanced SSDs (ESSDs) of performance level 1 (PL1)</li>
     * <li><strong>cloud_essd2</strong>: ESSDs of PL2</li>
     * <li><strong>cloud_essd3</strong>: ESSD of PL3</li>
     * </ul>
     * <blockquote>
     * <p>Serverless instances support only ESSDs of PL 1. For a serverless instance, you must set this parameter to <strong>cloud_essd</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The name of the database. If you specify more than one database, the value is in the following format: <code>Original database name 1,Original database name 2</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>test1,test2</p>
     */
    @NameInMap("DbNames")
    public String dbNames;

    /**
     * <p>The ID of the dedicated cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>dhg-7a9xxxxxxxx</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong> (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The network type of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong></li>
     * <li><strong>Classic</strong></li>
     * </ul>
     * <blockquote>
     * <p>By default, the new instance has the same network type as the original primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Serverless</strong>: serverless. This value is not supported for instances that run MariaDB. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The unit that is used to calculate the billing cycle of the new instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong></li>
     * <li><strong>Month</strong></li>
     * </ul>
     * <blockquote>
     * <p> If you set the PayType parameter to <strong>Prepaid</strong>, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address of the new instance, which must be within the CIDR block supported by the specified vSwitch. The system automatically assigns an internal IP address based on the values of the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XXX.69</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to restore only the databases and tables that you specify. The value <strong>1</strong> specifies to restore only the specified databases and tables. If you do not want to restore only the specified databases or tables, you do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RestoreTable")
    public String restoreTable;

    /**
     * <p>The point in time to which you want to restore data. The point in time must fall within the specified backup retention period. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>BackupId</strong> and <strong>RestoreTime</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2011-06-11T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    /**
     * <p>The specifications for the serverless instance. You must specify this parameter only when you restore data to a new serverless instance.</p>
     * <blockquote>
     * <p> This parameter is available only on the China site (aliyun.com).</p>
     * </blockquote>
     */
    @NameInMap("ServerlessConfig")
    public CloneDBInstanceRequestServerlessConfig serverlessConfig;

    /**
     * <p>The information about the database and table that you want to restore. The value is in the following format: <code>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;Name of Database 1&quot;,&quot;newname&quot;:&quot;New name of Database 1&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 1 in Database 1&quot;,&quot;newname&quot;:&quot;New name of Table 1&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 2 in Database 1&quot;,&quot;newname&quot;:&quot;New name of Table 2&quot;}]},{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;Name of Database 2&quot;,&quot;newname&quot;:&quot;New name of Database 2&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 1 in Database 2&quot;,&quot;newname&quot;:&quot;New name of Table 1&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of Table 2 in Database 2&quot;,&quot;newname&quot;:&quot;New name of Table 2&quot;}]}]</code></p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;testdb1&quot;,&quot;newname&quot;:&quot;testdb1_new&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;testdb1table1&quot;,&quot;newname&quot;:&quot;testdb1table1_new&quot;}]}]</p>
     */
    @NameInMap("TableMeta")
    public String tableMeta;

    /**
     * <p>The subscription duration of the new instance. Valid values:</p>
     * <ul>
     * <li>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of the UsedTime parameter ranges from <strong>1 to 3</strong>.</li>
     * <li>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of the UsedTime parameter ranges from <strong>1 to 9</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>If you set the PayType parameter to <strong>Prepaid</strong>, you must also specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The ID of the virtual private cloud (VPC).</p>
     * <blockquote>
     * <p> Make sure that the VPC belongs to the required region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6f7l4fg90xxxxxxxxxx</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch. The vSwitch must belong to the zone that is specified by <strong>ZoneId</strong>.</p>
     * <ul>
     * <li>If you set <strong>InstanceNetworkType</strong> to <strong>VPC</strong>, you must also specify this parameter.</li>
     * <li>If you specify the <strong>ZoneSlaveId1</strong> parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2pxxxxxxxxxx</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the primary instance. You can call the DescribeRegions operation to query the zone ID.</p>
     * <blockquote>
     * <p> Set this value to the zone ID of the original instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary instance. If you set the ZoneIdSlave1 parameter and the <strong>ZoneId</strong> parameter to the same value, the single-zone deployment method is used. If you set the ZoneIdSlave1 parameter and the <strong>ZoneId</strong> parameter to different values, the multi-zone deployment method is used.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>The zone ID of the logger instance. If you set the ZoneIdSlave2 parameter to the same value as the <strong>ZoneId</strong> parameter, the single-zone deployment method is used. If you set the ZoneIdSlave2 parameter to a different value from the <strong>ZoneId</strong> parameter, the multi-zone deployment method is used.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
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

    public CloneDBInstanceRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is supported only for serverless ApsaraDB RDS for MySQL instances.</li>
         * <li>This parameter is available only on the China site (aliyun.com).</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoPause")
        public Boolean autoPause;

        /**
         * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
         * <ul>
         * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>1 to 8</strong></li>
         * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong></li>
         * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>1 to 12</strong></li>
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
         * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>0.5 to 8</strong>.</li>
         * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong>. Only integers are supported.</li>
         * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>0.5 to 12</strong>.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The value of this parameter must be less than or equal to the value of <strong>MaxCapacity</strong>.</li>
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
         * <p>Specifies whether to enable the forced scaling feature for the serverless ApsaraDB RDS for MySQL instance. In most cases, ApsaraDB RDS automatically scales in or out the RCUs of a serverless instance based on business requirements in real time. In rare cases, the scaling does not take effect in real time. You can enable the forced scaling feature to forcefully scales in or out the RCUs of the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is supported only for serverless ApsaraDB RDS for MySQL instances.</p>
         * </li>
         * <li><p>This parameter is available only on the China site (aliyun.com).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
