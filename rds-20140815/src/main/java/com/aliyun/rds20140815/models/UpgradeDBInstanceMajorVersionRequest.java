// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionRequest extends TeaModel {
    @NameInMap("AllowDDL")
    public Boolean allowDDL;

    /**
     * <p>Specifies when to execute statistics information collection on the database.</p>
     * <ul>
     * <li><strong>Before</strong>: Execute collection before the switchover. This ensures business stability. If the instance has a large data volume, the upgrade may take a long time.</li>
     * <li><strong>After</strong>: Execute collection after the switchover. The upgrade is faster. Accessing tables without generated statistics information after the upgrade may cause inaccurate execution plans. During peak hours, this may cause the database to break down.</li>
     * </ul>
     * <blockquote>
     * <p>For non-switchover scenarios, &quot;before switchover&quot; means statistics information is collected before the new instance is opened for read/write, and &quot;after switchover&quot; means statistics information is collected after the new instance is opened for read/write.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>After</p>
     */
    @NameInMap("CollectStatMode")
    public String collectStatMode;

    @NameInMap("CustomExtraInfo")
    public String customExtraInfo;

    /**
     * <p>The instance type after the upgrade. The CPU and memory configurations must be greater than or equal to those of the original instance type. If <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
     * <p>For example, if the original instance type is <code>pg.n2.small.2c</code> with 1 CPU core and 2 GB of memory, you can upgrade it to <code>pg.n2.medium.2c</code> with 2 CPU cores and 4 GB of memory.</p>
     * <blockquote>
     * <p>For the instance type codes of ApsaraDB RDS for PostgreSQL, refer to <a href="https://help.aliyun.com/document_detail/276990.html">Primary ApsaraDB RDS for PostgreSQL instance types</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pg.n2.medium.2c</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The instance ID of the original instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1gm3yh0ht1****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance storage capacity after the upgrade. Unit: GB. If <strong>UpgradeMode</strong> (upgrade pattern) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>PL1 ESSD cloud disk</strong>: 20 GB to 3200 GB</li>
     * <li><strong>PL2 ESSD cloud disk</strong>: 500 GB to 3200 GB</li>
     * <li><strong>PL3 ESSD cloud disk</strong>: 1500 GB to 3200 GB</li>
     * <li><strong>Premium performance disk</strong>: 40 GB to 2000 GB</li>
     * </ul>
     * <blockquote>
     * <p>When upgrading the major engine version of an instance with Premium Local SSDs, storage capacity reduction is supported. For the minimum storage capacity, refer to <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version of a database</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance after the upgrade.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
     * <li><strong>general_essd</strong>: premium performance disk</li>
     * </ul>
     * <p>The major engine version upgrade feature is based on cloud disk snapshots. The supported storage types after the upgrade are as follows:</p>
     * <ul>
     * <li>If the original instance uses a standard SSD, you can select standard SSD.</li>
     * <li>If the original instance uses an ESSD cloud disk, you can select PL1 ESSD, PL2 ESSD, PL3 ESSD, or premium performance disk.</li>
     * <li>If the original instance uses Premium Local SSDs, you can select PL1 ESSD, PL2 ESSD, PL3 ESSD, or premium performance disk.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The network type of the instance after the upgrade. Set this parameter to VPC. Only VPC-connected instances support major engine version upgrades.</p>
     * <p>If the network type is classic network, switch to VPC first. For information about how to view or switch the network type, refer to <a href="https://help.aliyun.com/document_detail/96761.html">Switch the network type</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method of the instance. Set this parameter to Postpaid for pay-as-you-go billing.</p>
     * <blockquote>
     * <p>If you want to change the billing method after the upgrade, refer to <a href="https://help.aliyun.com/document_detail/96743.html">Switch from pay-as-you-go to subscription</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>Reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>You do not need to configure this parameter. It specifies the internal IP address of the target instance. The system automatically assigns an IP address based on VPCId and vSwitchId by default.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The switchover configuration. Specifies whether to switch traffic to the new version instance based on your business requirements.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Switchover is performed and automatic switchover is enabled. This option is typically used to execute the formal upgrade after confirming that your business can run stably on the new version.</li>
     * <li><strong>false</strong>: Switchover is not performed and automatic switchover is not enabled. This option is typically used to test the compatibility of your application with the new version before the formal upgrade.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you select switchover:<ul>
     * <li>Switchover cannot be rolled back after execution. Proceed with caution.</li>
     * <li>During the switchover procedure, the original instance becomes read-only and writes are not allowed. Execute the switchover during off-peak hours.</li>
     * <li>If read-only instances are created for the original instance, you cannot select switchover. You can only upgrade the instance without switchover, and the original read-only instances are not cloned. After the upgrade, create new PostgreSQL read-only instances for the new version instance.</li>
     * </ul>
     * </li>
     * <li>If you do not select switchover:<ul>
     * <li>The business on the original instance is not affected during migration.</li>
     * <li>To upgrade the instance without switchover, change the database connection address in your application to the database connection address of the new instance after migration is complete. For information about how to view the connection address, refer to <a href="https://help.aliyun.com/document_detail/96788.html">View or modify the internal and public endpoints and port numbers</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SwitchOver")
    public String switchOver;

    /**
     * <p>Reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>This parameter is used together with SwitchOver and takes effect only when <strong>SwitchOver</strong> is set to <strong>true</strong>. Specifies the switchover time.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The switchover takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The switchover takes effect during the maintenance window. You can call the ModifyDBInstanceMaintainTime operation to modify the maintenance window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <p>The target major engine version of the instance after the upgrade. This value must be the same as the target version specified during the pre-upgrade check.</p>
     * <blockquote>
     * <p>You can call the UpgradeDBInstanceMajorVersionPrecheck operation to perform a pre-upgrade check for the major engine version upgrade.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>13.0</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    /**
     * <p>The upgrade pattern. Configure this parameter when <strong>SwitchOver</strong> is set to <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>inPlaceUpgrade</strong>: In-place upgrade. The major engine version upgrade task is executed on the original instance without creating a new version instance. After the upgrade, the original instance inherits the existing order, instance name, tags, CloudMonitor alert rules, and backup rules.</li>
     * <li><strong>blueGreenDeployment</strong>: Blue-green deployment. The major engine version upgrade retains the original instance and creates a new version instance. The new instance is free of charge during creation. After the new instance is created, fees are incurred and the billing method may change. After the upgrade, both the original and new instances incur fees, and the new instance does not inherit the discounts of the original instance.</li>
     * <li><strong>zeroDownTimeUpgrade</strong>: Zero-downtime upgrade. The system uses pg_upgrade to upgrade the original instance to the target version and uses native logical replication for incremental updates. Active switchover is supported during the upgrade procedure, and you can validate the higher version instance before the switchover. From the start of the upgrade until the active switchover, the instance maintains normal read/write operations. During the switchover, the read-only duration is at the second level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inPlaceUpgrade</p>
     */
    @NameInMap("UpgradeMode")
    public String upgradeMode;

    /**
     * <p>Reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID. If <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
     * <p>You can call the DescribeDBInstanceAttribute operation to query the VPC ID of the original instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn00gzv****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the target instance. If <strong>UpgradeMode</strong> (upgrade pattern) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
     * <ul>
     * <li>If the original instance is a Basic Edition instance, specify the vSwitch ID of the target instance.</li>
     * <li>If the original instance is a high-availability series instance, you can specify the vSwitch IDs of the target primary and secondary instances, separated by commas (,).</li>
     * </ul>
     * <blockquote>
     * <p>The target vSwitch must be in the same zone as the original instance. You can call the DescribeVSwitches operation to query vSwitches.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp10aqj6o4lclxdrm****,vsw-bp10aqj6o4lclxdrm****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The primary zone ID of the target instance. If <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
     * <p>You can call the DescribeRegions operation to query zone IDs.</p>
     * <p>ApsaraDB RDS for PostgreSQL allows you to deploy the new instance in a different zone within the same region as the original instance after the upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>This parameter can be configured only when the original instance is a high-availability series instance. Specifies the secondary zone ID of the target instance. If <strong>UpgradeMode</strong> (upgrade pattern) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, <strong>you do not need to configure</strong> this parameter.</p>
     * <p>ApsaraDB RDS for PostgreSQL allows you to deploy the new secondary instance in a different zone within the same region as the original instance after the upgrade.</p>
     * <p>You can call the DescribeRegions operation to query zone IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>Reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static UpgradeDBInstanceMajorVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionRequest self = new UpgradeDBInstanceMajorVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionRequest setAllowDDL(Boolean allowDDL) {
        this.allowDDL = allowDDL;
        return this;
    }
    public Boolean getAllowDDL() {
        return this.allowDDL;
    }

    public UpgradeDBInstanceMajorVersionRequest setCollectStatMode(String collectStatMode) {
        this.collectStatMode = collectStatMode;
        return this;
    }
    public String getCollectStatMode() {
        return this.collectStatMode;
    }

    public UpgradeDBInstanceMajorVersionRequest setCustomExtraInfo(String customExtraInfo) {
        this.customExtraInfo = customExtraInfo;
        return this;
    }
    public String getCustomExtraInfo() {
        return this.customExtraInfo;
    }

    public UpgradeDBInstanceMajorVersionRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public UpgradeDBInstanceMajorVersionRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBInstanceMajorVersionRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public UpgradeDBInstanceMajorVersionRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public UpgradeDBInstanceMajorVersionRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public UpgradeDBInstanceMajorVersionRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public UpgradeDBInstanceMajorVersionRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public UpgradeDBInstanceMajorVersionRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public UpgradeDBInstanceMajorVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpgradeDBInstanceMajorVersionRequest setSwitchOver(String switchOver) {
        this.switchOver = switchOver;
        return this;
    }
    public String getSwitchOver() {
        return this.switchOver;
    }

    public UpgradeDBInstanceMajorVersionRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public UpgradeDBInstanceMajorVersionRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

    public UpgradeDBInstanceMajorVersionRequest setTargetMajorVersion(String targetMajorVersion) {
        this.targetMajorVersion = targetMajorVersion;
        return this;
    }
    public String getTargetMajorVersion() {
        return this.targetMajorVersion;
    }

    public UpgradeDBInstanceMajorVersionRequest setUpgradeMode(String upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }
    public String getUpgradeMode() {
        return this.upgradeMode;
    }

    public UpgradeDBInstanceMajorVersionRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public UpgradeDBInstanceMajorVersionRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public UpgradeDBInstanceMajorVersionRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public UpgradeDBInstanceMajorVersionRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public UpgradeDBInstanceMajorVersionRequest setZoneIdSlave1(String zoneIdSlave1) {
        this.zoneIdSlave1 = zoneIdSlave1;
        return this;
    }
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    public UpgradeDBInstanceMajorVersionRequest setZoneIdSlave2(String zoneIdSlave2) {
        this.zoneIdSlave2 = zoneIdSlave2;
        return this;
    }
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

}
