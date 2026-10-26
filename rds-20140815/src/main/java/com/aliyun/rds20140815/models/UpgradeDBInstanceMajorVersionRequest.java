// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionRequest extends TeaModel {
    @NameInMap("AllowDDL")
    public Boolean allowDDL;

    /**
     * <p>Specifies when to execute statistics collection for the database.
     * Valid values:</p>
     * <ul>
     * <li><strong>Before</strong>: collects statistics before the cutover. This ensures business stability. If the data volume of the instance is too large, the upgrade may take a long time.</li>
     * <li><strong>After</strong>: collects statistics after the cutover. This accelerates the instance upgrade. Accessing tables for which no statistics are generated after the upgrade may lead to inaccurate execution plans and even database breakdown during peak hours.</li>
     * </ul>
     * <blockquote>
     * <p>For scenarios where no cutover is performed, collecting statistics before the cutover means collecting statistics before the new instance enables read and write operations, and collecting statistics after the cutover means collecting statistics after the new instance enables read and write operations.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>After</p>
     */
    @NameInMap("CollectStatMode")
    public String collectStatMode;

    /**
     * <p>An internal reserved field. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal reserved field. You do not need to specify this parameter</p>
     */
    @NameInMap("CustomExtraInfo")
    public String customExtraInfo;

    /**
     * <p>The instance type after the upgrade. The CPU and memory configurations must be greater than or equal to those of the original instance. When <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>For example, if the original instance type is <code>pg.n2.small.2c</code> with 1 core and 2 GB of memory, you can upgrade it to <code>pg.n2.medium.2c</code> with 2 cores and 4 GB of memory.</p>
     * <blockquote>
     * <p>For more information about ApsaraDB RDS for PostgreSQL instance types, see <a href="https://help.aliyun.com/document_detail/276990.html">Primary ApsaraDB RDS for PostgreSQL instance types</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pg.n2.medium.2c</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the original instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pgm-bp1gm3yh0ht1****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance storage after the upgrade. Unit: GB. When <strong>UpgradeMode</strong> (upgrade mode) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>ESSD PL1 cloud disk</strong>: 20 GB to 3,200 GB</li>
     * <li><strong>ESSD PL2 cloud disk</strong>: 500 GB to 3,200 GB</li>
     * <li><strong>ESSD PL3 cloud disk</strong>: 1,500 GB to 3,200 GB</li>
     * <li><strong>premium cloud disk</strong>: 40 GB to 2,000 GB</li>
     * </ul>
     * <blockquote>
     * <p>When you upgrade the major database version of an instance with premium local SSDs, storage capacity reduction is supported. For more information about the minimum storage capacity, see <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version</a>.</p>
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
     * <li><strong>cloud_ssd</strong>: standard SSD cloud disk</li>
     * <li><strong>cloud_essd</strong>: ESSD PL1 cloud disk</li>
     * <li><strong>cloud_essd2</strong>: ESSD PL2 cloud disk</li>
     * <li><strong>cloud_essd3</strong>: ESSD PL3 cloud disk</li>
     * <li><strong>general_essd</strong>: premium cloud disk</li>
     * </ul>
     * <p>The major engine version upgrade feature is based on cloud disk snapshots. The following storage types are supported after the upgrade:</p>
     * <ul>
     * <li>When the original instance uses standard SSD cloud disks, you can select standard SSD cloud disks.</li>
     * <li>When the original instance uses ESSD cloud disks, you can select ESSD PL1 cloud disks, ESSD PL2 cloud disks, ESSD PL3 cloud disks, or premium cloud disks.</li>
     * <li>When the original instance uses premium local SSDs, you can select ESSD PL1 cloud disks, ESSD PL2 cloud disks, ESSD PL3 cloud disks, or premium cloud disks.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The network type of the instance after the upgrade. Set the value to VPC. Only VPC-connected instances support major engine version upgrades.</p>
     * <p>If the instance is connected to the classic network, switch the network type to VPC first. For more information about how to view or switch the network type, see <a href="https://help.aliyun.com/document_detail/96761.html">Switch the network type</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method. Set the value to Postpaid, which indicates the pay-as-you-go billing method.</p>
     * <blockquote>
     * <p>If you want to change the billing method of the instance after the upgrade, see <a href="https://help.aliyun.com/document_detail/96743.html">Switch the billing method from pay-as-you-go to subscription</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>A reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>You do not need to configure this parameter. It specifies the internal IP address of the target instance. By default, the system automatically allocates an IP address based on the VPCId and vSwitchId parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The cutover configuration. Specifies whether to switch traffic to the new-version instance based on your business requirements.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs the cutover and automatic switchover. This option is generally used to execute a formal upgrade after you confirm that your business can run stably on the new version.</li>
     * <li><strong>false</strong>: does not perform the cutover and does not perform automatic switchover. This option is generally used to test the compatibility of your current business with the new version before a formal upgrade.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If you choose to perform the cutover:<ul>
     * <li>Backoff is not supported after the cutover. Proceed with caution.</li>
     * <li>During the switchover procedure, the original instance becomes read-only and your business cannot write data to the instance. Make sure that you execute the cutover during off-peak hours.</li>
     * <li>If read-only instances are attached to the original instance, you cannot perform the cutover. You can only upgrade the instance without performing the cutover, and the original read-only instances are not cloned. After the upgrade is complete, you must create PostgreSQL read-only instances for the new-version instance.</li>
     * </ul>
     * </li>
     * <li>If you choose not to perform the cutover:<ul>
     * <li>Your business on the original instance is not affected during the migration.</li>
     * <li>If you upgrade the instance without performing the cutover, you must change the database endpoint in your application to the endpoint of the new instance after the migration is complete. For more information about how to view the endpoint, see <a href="https://help.aliyun.com/document_detail/96788.html">View or change the internal and public endpoints and port numbers</a>.</li>
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
     * <p>A reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The cutover time. This parameter is used together with SwitchOver and takes effect only when <strong>SwitchOver</strong> is set to <strong>true</strong>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The cutover takes effect immediately.</li>
     * <li><strong>MaintainTime</strong>: The cutover takes effect within the maintenance window. You can call the ModifyDBInstanceMaintainTime operation to modify the maintenance window.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <p>The target major engine version after the upgrade. The value must be the same as the target version specified when you perform the pre-upgrade check.</p>
     * <blockquote>
     * <p>You can call the UpgradeDBInstanceMajorVersionPrecheck operation to perform a pre-upgrade check for a major engine version upgrade.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>13.0</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    /**
     * <p>The upgrade mode. When <strong>SwitchOver</strong> is set to <strong>true</strong>, you must configure this parameter. Valid values:</p>
     * <ul>
     * <li><strong>inPlaceUpgrade</strong>: in-place upgrade. The major engine version upgrade task is executed on the original instance, and no new-version instance is created. The major engine version of the original instance is upgraded, and the original instance inherits the existing orders, instance name, tags, CloudMonitor alert rules, and backup rules.</li>
     * <li><strong>blueGreenDeployment</strong>: blue-green deployment. The major engine version upgrade retains the original instance and creates a new-version instance. You are not charged for the new instance while it is being created, but you are charged after it is created, and the billing method may change. After the upgrade is complete, both the original instance and the new instance incur fees, and the new instance does not enjoy the discounts of the original instance.</li>
     * <li><strong>zeroDownTimeUpgrade</strong>: zero-downtime upgrade. The system uses pg_upgrade to upgrade the original instance to the target version and implements incremental updates through native logical replication. Manual switchover is supported during the upgrade procedure, and you can verify the higher-version instance before the switchover. From the start of the upgrade to the manual switchover, the instance can maintain normal read and write operations. During the switchover, the read-only duration of the instance is measured in seconds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inPlaceUpgrade</p>
     */
    @NameInMap("UpgradeMode")
    public String upgradeMode;

    /**
     * <p>A reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The VPC ID. When <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>You can call the DescribeDBInstanceAttribute operation to view the VPC ID of the original instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn00gzv****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the target instance. When <strong>UpgradeMode</strong> (upgrade mode) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <ul>
     * <li>When the original instance is a Basic Edition instance, configure the vSwitch ID of the target instance.</li>
     * <li>When the original instance is a high availability instance, you can configure the vSwitch IDs of the target primary and secondary instances, separated by commas (,).</li>
     * </ul>
     * <blockquote>
     * <p>The configured vSwitch of the target instance must be in the same zone as the original instance. You can call the DescribeVSwitches operation to query the vSwitch ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp10aqj6o4lclxdrm****,vsw-bp10aqj6o4lclxdrm****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination primary zone. When <strong>UpgradeMode</strong> is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>You can call the DescribeRegions operation to view the zone ID.</p>
     * <p>ApsaraDB RDS for PostgreSQL allows you to configure the new instance in a different zone within the same region as the original instance after the upgrade.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The ID of the secondary zone of the target instance. This parameter is available only when the original instance is a high availability instance. When <strong>UpgradeMode</strong> (upgrade mode) is set to <strong>inPlaceUpgrade</strong> or <strong>zeroDownTimeUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>ApsaraDB RDS for PostgreSQL allows you to configure the new secondary instance in a different zone within the same region as the original instance after the upgrade.</p>
     * <p>You can call the DescribeRegions operation to view the zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-j</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>A reserved parameter. You do not need to configure this parameter.</p>
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
