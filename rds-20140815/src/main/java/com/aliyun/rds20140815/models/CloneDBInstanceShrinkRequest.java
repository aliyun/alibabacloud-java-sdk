// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CloneDBInstanceShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ol>
     * <li><p><strong>true</strong>: enables automatic payment. Make sure that your account balance is sufficient.</p>
     * </li>
     * <li><p><strong>false</strong>: generates an order but does not deduct fees.</p>
     * </li>
     * </ol>
     * <blockquote>
     * <p>Default value: true. If your payment method has an insufficient balance, you can set the AutoPay parameter to false. In this case, an unpaid order is generated, and you can log on to the ApsaraDB RDS console to complete the payment.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The ID of the backup set.</p>
     * <p>You can call the DescribeBackups operation to query the backup sets.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>BackupId</strong> and <strong>RestoreTime</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>902****</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The backup type. Valid values:</p>
     * <ul>
     * <li><strong>FullBackup</strong>: full backup.</li>
     * <li><strong>IncrementalBackup</strong>: incremental backup.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FullBackup</p>
     */
    @NameInMap("BackupType")
    public String backupType;

    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>Specifies whether to enable the I/O performance burst feature for Premium ESSD cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong>: shutdown.<blockquote>
     * <p>For more information about the I/O performance burst feature, see <a href="https://help.aliyun.com/document_detail/2340501.html">What is a premium performance disk</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The instance edition. Valid values:</p>
     * <ul>
     * <li><strong>Basic</strong>: Basic Edition.</li>
     * <li><strong>HighAvailability</strong>: high availability Edition (active).</li>
     * <li><strong>AlwaysOn</strong>: Cluster Edition (SQL Server).</li>
     * <li><strong>cluster</strong>: Cluster Edition (MySQL).</li>
     * <li><strong>Finance</strong>: Finance Edition (supported only on the China site).</li>
     * </ul>
     * <p><strong>Serverless instances</strong></p>
     * <ul>
     * <li><strong>serverless_basic</strong>: Serverless Basic Edition (applicable only to MySQL and PostgreSQL).</li>
     * <li><strong>serverless_standard</strong>: MySQL Serverless high availability Edition (active).</li>
     * <li><strong>serverless_ha</strong>: SQL Server Serverless high availability Edition (active).<blockquote>
     * <p>You do not need to specify this parameter. The cloned instance inherits the edition of the source instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HighAvailability</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The value can be up to 64 ASCII characters in length and cannot contain non-ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>0c593ea1-3bea-11e9-b96b-88**********</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The internal reserved field. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Internal reserved field. You do not need to specify this parameter</p>
     */
    @NameInMap("CustomExtraInfo")
    public String customExtraInfo;

    /**
     * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * <blockquote>
     * <p>Default value: the instance type of the primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>mysql.n1.micro.1</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance name. It must be 2 to 255 characters in length. It must start with a letter or a Chinese character and can contain letters, digits, Chinese characters, underscores (_), and hyphens (-).</p>
     * <blockquote>
     * <p>It cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>testInstance</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Instance storage capacity of the instance. Unit: GB. Instance storage capacity increases in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Instance types</a>.</p>
     * <blockquote>
     * <p>Default value: instance storage capacity of the primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The instance storage type. Valid values:</p>
     * <ul>
     * <li><strong>general_essd</strong>: Premium ESSD (recommended).</li>
     * <li><strong>local_ssd</strong>: premium local disk.</li>
     * <li><strong>cloud_ssd</strong>: standard SSD.</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
     * </ul>
     * <blockquote>
     * <p>Serverless instances support only PL1 ESSD and Premium ESSD.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>general_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The names of the databases. Format: <code>Original database name 1,Original database name 2</code>.</p>
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
     * <p>dhg-7a9****</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables the feature.</li>
     * <li><strong>false</strong> (default): disables the feature.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>VPC</strong>: Virtual Private Cloud (VPC).</li>
     * <li><strong>Classic</strong>: classic network.</li>
     * </ul>
     * <blockquote>
     * <p>Default value: the network type of the primary instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>Specifies whether to enable the Buffer Pool Extension (BPE) feature for Premium ESSD cloud disks. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: enables the feature.</li>
     * <li><strong>0</strong>: disables the feature.</li>
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
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
     * <li><strong>Prepaid</strong>: subscription.</li>
     * <li><strong>Serverless</strong>: serverless. This value is not supported for ApsaraDB RDS for MariaDB instances. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The subscription period of the subscription instance. Valid values:</p>
     * <ul>
     * <li><strong>Year</strong>: yearly subscription.</li>
     * <li><strong>Month</strong>: monthly subscription.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when the billing method is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Year</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal network IP address of the new instance. The IP address must be within the IP address range of the specified vSwitch. By default, the system automatically allocates an IP address based on the <strong>VPCId</strong> and <strong>VSwitchId</strong> parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>172.XX.XX.69</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID. You can call the DescribeRegions operation to view the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to restore individual databases and tables. A value of <strong>true</strong> specifies that individual databases and tables are restored. If you do not want to restore individual databases and tables, leave this parameter empty.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RestoreTable")
    public String restoreTable;

    /**
     * <p>The point in time to which you want to restore the instance. The point in time must be within the backup retention period. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You must specify at least one of the <strong>BackupId</strong> and <strong>RestoreTime</strong> parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2011-06-11T16:00:00Z</p>
     */
    @NameInMap("RestoreTime")
    public String restoreTime;

    @NameInMap("ServerlessConfig")
    public String serverlessConfigShrink;

    /**
     * <p>The information about the databases and tables that you want to restore. This parameter is required when you restore individual databases and tables. Format:
     * <code>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;Name of database 1&quot;,&quot;newname&quot;:&quot;New name of database 1&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of table 1 in database 1&quot;,&quot;newname&quot;:&quot;New name of table 1&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of table 2 in database 1&quot;,&quot;newname&quot;:&quot;New name of table 2&quot;}]},{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;Name of database 2&quot;,&quot;newname&quot;:&quot;New name of database 2&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of table 1 in database 2&quot;,&quot;newname&quot;:&quot;New name of table 1&quot;},{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;Name of table 2 in database 2&quot;,&quot;newname&quot;:&quot;New name of table 2&quot;}]}]</code></p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;type&quot;:&quot;db&quot;,&quot;name&quot;:&quot;testdb1&quot;,&quot;newname&quot;:&quot;testdb1_new&quot;,&quot;tables&quot;:[{&quot;type&quot;:&quot;table&quot;,&quot;name&quot;:&quot;testdb1table1&quot;,&quot;newname&quot;:&quot;testdb1table1_new&quot;}]}]</p>
     */
    @NameInMap("TableMeta")
    public String tableMeta;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CloneDBInstanceShrinkRequestTag> tag;

    /**
     * <p>The subscription duration. Valid values:</p>
     * <ul>
     * <li>Valid values when the <strong>Period</strong> parameter is set to <strong>Year</strong>: <strong>1</strong>, <strong>2</strong>, and <strong>3</strong>.</li>
     * <li>Valid values when the <strong>Period</strong> parameter is set to <strong>Month</strong>: <strong>1</strong> to <strong>9</strong>.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when the billing method is set to <strong>Prepaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public Integer usedTime;

    /**
     * <p>The VPC ID.</p>
     * <blockquote>
     * <p>Make sure that the VPC belongs to the region where the instance is deployed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6f7l4fg90****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID. The zone (active zone) where the vSwitch is located must match the zone (active zone) ID specified in <strong>ZoneId</strong>.</p>
     * <ul>
     * <li>The network type <strong>InstanceNetworkType</strong> must be set to <strong>VPC</strong>.</li>
     * <li>If you specify <strong>ZoneSlaveId1</strong> (the secondary active zone ID), you must specify two vSwitch IDs and separate them with commas (,).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6adz52c2p****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The primary zone ID. You can call the DescribeRegions operation to view the zone ID.</p>
     * <blockquote>
     * <p>Default value: the zone ID of the source instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The secondary zone (active zone) ID. If this parameter is set to the same value as the <strong>ZoneId</strong> parameter, the instance uses a single-zone (active zone) deployment. If this parameter is set to a different value from the <strong>ZoneId</strong> parameter, the instance uses a multi-zone (active zone) deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-c</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>&lt;props=&quot;intl&quot;&gt;The logger zone (active zone) ID. If this parameter is set to the same value as the <strong>ZoneId</strong> parameter, the instance uses a single-zone (active zone) deployment. If this parameter is set to a different value from the <strong>ZoneId</strong> parameter, the instance uses a multi-zone (active zone) deployment.</p>
     * <p>&lt;props=&quot;china&quot;&gt;The secondary zone (active zone) ID or logger zone (active zone) ID. If this parameter is set to the same value as the <strong>ZoneId</strong> parameter, the instance uses a single-zone (active zone) deployment. If this parameter is set to a different value from the <strong>ZoneId</strong> parameter, the instance uses a multi-zone (active zone) deployment.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-d</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static CloneDBInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneDBInstanceShrinkRequest self = new CloneDBInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloneDBInstanceShrinkRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CloneDBInstanceShrinkRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CloneDBInstanceShrinkRequest setBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }
    public String getBackupType() {
        return this.backupType;
    }

    public CloneDBInstanceShrinkRequest setBpeEnabled(String bpeEnabled) {
        this.bpeEnabled = bpeEnabled;
        return this;
    }
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    public CloneDBInstanceShrinkRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CloneDBInstanceShrinkRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CloneDBInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CloneDBInstanceShrinkRequest setCustomExtraInfo(String customExtraInfo) {
        this.customExtraInfo = customExtraInfo;
        return this;
    }
    public String getCustomExtraInfo() {
        return this.customExtraInfo;
    }

    public CloneDBInstanceShrinkRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CloneDBInstanceShrinkRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CloneDBInstanceShrinkRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CloneDBInstanceShrinkRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CloneDBInstanceShrinkRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CloneDBInstanceShrinkRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public CloneDBInstanceShrinkRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CloneDBInstanceShrinkRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CloneDBInstanceShrinkRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CloneDBInstanceShrinkRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
    }

    public CloneDBInstanceShrinkRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CloneDBInstanceShrinkRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CloneDBInstanceShrinkRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CloneDBInstanceShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CloneDBInstanceShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CloneDBInstanceShrinkRequest setRestoreTable(String restoreTable) {
        this.restoreTable = restoreTable;
        return this;
    }
    public String getRestoreTable() {
        return this.restoreTable;
    }

    public CloneDBInstanceShrinkRequest setRestoreTime(String restoreTime) {
        this.restoreTime = restoreTime;
        return this;
    }
    public String getRestoreTime() {
        return this.restoreTime;
    }

    public CloneDBInstanceShrinkRequest setServerlessConfigShrink(String serverlessConfigShrink) {
        this.serverlessConfigShrink = serverlessConfigShrink;
        return this;
    }
    public String getServerlessConfigShrink() {
        return this.serverlessConfigShrink;
    }

    public CloneDBInstanceShrinkRequest setTableMeta(String tableMeta) {
        this.tableMeta = tableMeta;
        return this;
    }
    public String getTableMeta() {
        return this.tableMeta;
    }

    public CloneDBInstanceShrinkRequest setTag(java.util.List<CloneDBInstanceShrinkRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CloneDBInstanceShrinkRequestTag> getTag() {
        return this.tag;
    }

    public CloneDBInstanceShrinkRequest setUsedTime(Integer usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public CloneDBInstanceShrinkRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CloneDBInstanceShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CloneDBInstanceShrinkRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public CloneDBInstanceShrinkRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public CloneDBInstanceShrinkRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static class CloneDBInstanceShrinkRequestTag extends TeaModel {
        /**
         * <p>The tag key. You can specify this parameter to bind a tag to the instance.</p>
         * <ul>
         * <li>If the specified tag key already exists, the tag key is directly bound to the instance. You can call the ListTagResources operation to query the created tags.</li>
         * <li>If the specified tag key does not exist, the tag key is created and then bound to the instance.</li>
         * <li>Empty strings are not allowed.</li>
         * <li>This parameter must be used together with the <strong>Tag.Value</strong> parameter and cannot be used alone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testkey1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value that corresponds to the tag key. You can specify this parameter to bind a tag to the instance.</p>
         * <ul>
         * <li>If the specified tag value already exists for the corresponding tag key, the tag value is directly bound to the instance. You can call the ListTagResources operation to query the created tags.</li>
         * <li>If the specified tag value does not exist for the corresponding tag key, the tag value is created and then bound to the instance.</li>
         * <li>This parameter must be used together with the <strong>Tag.Key</strong> parameter and cannot be used alone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testvalue1</p>
         */
        @NameInMap("Value")
        public String value;

        public static CloneDBInstanceShrinkRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CloneDBInstanceShrinkRequestTag self = new CloneDBInstanceShrinkRequestTag();
            return TeaModel.build(map, self);
        }

        public CloneDBInstanceShrinkRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CloneDBInstanceShrinkRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
