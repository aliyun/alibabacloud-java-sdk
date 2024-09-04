// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionRequest extends TeaModel {
    /**
     * <p>Specify the point in time at which the system collects the statistics of the instance.</p>
     * <ul>
     * <li><strong>Before</strong>: The system collects the statistics of the instance before the switchover to ensure service stability. If the instance contains a large amount of data, the upgrade may require a long period of time.</li>
     * <li><strong>After</strong>: The system collects the statistics of the instance after the switchover to accelerate the upgrade. After the upgrade, if you access tables for which no statistics are generated, the query plans may be inaccurate, and your database service may be unavailable during peak hours.</li>
     * </ul>
     * <blockquote>
     * <p> If you set the SwitchOver parameter to false, the value Before specifies that the system collects the statistics of the instance before the instance starts to process read and write requests, and the value After specifies that the system collects the statistics of the instance after the instance starts to process read and write requests.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>After</p>
     */
    @NameInMap("CollectStatMode")
    public String collectStatMode;

    /**
     * <p>The new instance type of the instance. The new CPU and memory specifications of the instance must be higher than or equal to the original CPU and memory specifications. If you set the <strong>UpgradeMode</strong> parameter to <strong>inPlaceUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>For example, you can upgrade the instance type from <code>pg.n2.small.2c</code> to <code>pg.n2.medium.2c</code>. The pg.n2.small.2c instance type provides 1 CPU core and 2 GB of memory. The pg.n2.medium.2c instance type provides 2 CPU cores and 4 GB of memory.</p>
     * <blockquote>
     * <p> For more information about the instance types of ApsaraDB RDS for PostgreSQL instances, see <a href="https://help.aliyun.com/document_detail/276990.html">Instance types for primary ApsaraDB RDS for PostgreSQL instances</a>.</p>
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
     * <p>The new storage capacity of the instance. Unit: GB If you set the <strong>UpgradeMode</strong> parameter to <strong>inPlaceUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>PL1 ESSD</strong>: 20 GB to 32,000 GB</li>
     * <li><strong>PL2 ESSD</strong>: 500 GB to 3,200 GB</li>
     * <li><strong>PL3 ESSD</strong>: 1,500 GB to 3,200 GB</li>
     * <li><strong>General ESSD</strong>: 40 GB to 2,000 GB</li>
     * </ul>
     * <blockquote>
     * <p> If the original instance uses local disks, you can reduce the storage capacity of the instance when you upgrade the major engine version of the instance. For more information about the minimum storage capacity, see <a href="https://help.aliyun.com/document_detail/203309.html">Upgrade the major engine version</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the instance that runs the required major engine version.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>cloud_ssd</strong>: standard SSD</li>
     * <li><strong>cloud_essd</strong>: performance level 1 (PL1) Enterprise SSD (ESSD)</li>
     * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
     * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
     * <li><strong>general_essd</strong>: general ESSD</li>
     * </ul>
     * <p>The major engine version upgrade feature is developed based on snapshots for cloud disks. You can select a storage type after the upgrade based on the following items:</p>
     * <ul>
     * <li>If the original instance uses standard SSDs, set this parameter to cloud_ssd.</li>
     * <li>If the original instance uses ESSDs, set this parameter to cloud_essd, cloud_essd2, cloud_essd3, or general_essd.</li>
     * <li>If the original instance uses local SSDs, set this parameter to cloud_essd, cloud_essd2, cloud_essd3, or general_essd.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The network type of the new instance. Set the value to VPC. The major engine version upgrade feature is supported only for instances that reside in VPCs.</p>
     * <p>If the original instance resides in the classic network, you must migrate the instance to a VPC before you call this operation. For more information about how to view or change the network type of an instance, see <a href="https://help.aliyun.com/document_detail/96761.html">Change the network type of an ApsaraDB RDS for PostgreSQL instance</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method. Set the value to Postpaid.</p>
     * <blockquote>
     * <p> For more information about how to change the billing method of an instance after the upgrade, see <a href="https://help.aliyun.com/document_detail/96743.html">Change the billing method of an instance from pay-as-you-go to subscription</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Postpaid</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address of the new instance. You do not need to specify this parameter. The system automatically assigns an internal IP address based on the values of the VPCId and vSwitchId parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.XX.XX</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to switch your workloads over to the instance that runs the required major engine version based on your business requirements.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system automatically switches workloads over to the instance. This configuration method is used to perform an upgrade after you verify that the new major engine version is compatible with your workloads.</li>
     * <li><strong>false</strong>: The system does not automatically switch your workloads over to the instance. In most cases, this configuration method is used to test whether the new major engine version is compatible with your workloads before you perform the upgrade.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you set this parameter to true, you must take note of the following items:</p>
     * <ul>
     * <li>After the switchover is complete, you cannot roll your workloads back to the original instance. Proceed with caution.</li>
     * <li>During the switchover, the original instance processes only read requests. We recommend that you perform the switchover during off-peak hours.</li>
     * <li>If read-only instances are attached to the original instance, you can set this parameter only to false. In this case, the read-only instances that are attached to the original instance cannot be cloned. After the upgrade is complete, you must create read-only instances for the instance.</li>
     * </ul>
     * </li>
     * <li><p>If you set this parameter to false, you must take note of the following items:</p>
     * <ul>
     * <li>The data migration does not interrupt your workloads on the original instance.</li>
     * <li>After data is migrated to the instance that runs the required major engine version, you must update the endpoint configuration in your application. This update requires you to replace the endpoint of the original instance with the endpoint of the instance that runs the required major engine version. For more information about how to view the endpoint of an instance, see <a href="https://help.aliyun.com/document_detail/96788.html">Viewing and change of the internal and public endpoints and port numbers</a>.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SwitchOver")
    public String switchOver;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-07-10T13:15:12Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The point in time at which the workloads are switched over. This parameter is used together with the SwitchOver parameter. This parameter is available only when you set the <strong>SwitchOver</strong> parameter to <strong>true</strong>.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>Immediate</strong>: The workloads are immediately switched over.</li>
     * <li><strong>MaintainTime</strong>: The workloads are switched over within the maintenance window that you specify. You can call the ModifyDBInstanceMaintainTime operation to change the maintenance window of an instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Immediate</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <p>The major engine version of the new instance. The value of this parameter must be the major engine version on which an upgrade check is performed.</p>
     * <blockquote>
     * <p> You can call the UpgradeDBInstanceMajorVersionPrecheck operation to perform an upgrade check.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>13.0</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    /**
     * <p>The upgrade mode. This parameter is required when you set the <strong>SwitchOver</strong> parameter to <strong>true</strong>. Valid values:</p>
     * <ul>
     * <li><strong>inPlaceUpgrade</strong>: local upgrade. The major engine version upgrade is performed on the original instance, and no new instance is created. After the upgrade, the original instance runs the required major engine version and inherits the original orders, name, tags, alert rules in CloudMonitor, and backup settings.</li>
     * <li><strong>blueGreenDeployment</strong>: blue-green deployment. After the major engine version of the instance is upgraded, the original instance is retained and a new instance is created. Fees are generated for the new instance based on the billing method that you specified. However, no fees are generated for the creation of the new instance. After the upgrade is complete, fees are generated for both the original and new instances and the new instance cannot enjoy the discounts provided for the original instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>inPlaceUpgrade</p>
     */
    @NameInMap("UpgradeMode")
    public String upgradeMode;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID of the instance. If you set the <strong>UpgradeMode</strong> parameter to <strong>inPlaceUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>You can call the DescribeDBInstanceAttribute operation to query the VPC ID of the original instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1opxu1zkhn00gzv****</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the instance that runs the required major engine version. If you set the <strong>UpgradeMode</strong> parameter to <strong>inPlaceUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <ul>
     * <li>If the original instance runs RDS Basic Edition, configure the vSwitch ID for the instance that runs the required major engine version.</li>
     * <li>If the original instance runs RDS High-availability Edition, configure the vSwitch IDs for the instance that runs the required major engine version and its secondary instance. Separate the vSwitch IDs with commas (,).</li>
     * </ul>
     * <blockquote>
     * <p> The vSwitches that you specify must reside in the same zone as the original instance. You can call the DescribeVSwitches operation to query the vSwitch IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp10aqj6o4lclxdrm****,vsw-bp10aqj6o4lclxdrm****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the zone to which the primary instance that runs the required major engine version belongs. If you set the <strong>UpgradeMode</strong> parameter to <strong>inPlaceUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>You can call the DescribeRegions operation to query zone IDs.</p>
     * <p>You can select a zone that belongs to the region in which the original instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The ID of the zone to which the secondary instance runs the required major engine version belongs. This parameter is available only when the original instance runs RDS High-availability Edition. If you set the <strong>UpgradeMode</strong> parameter to <strong>inPlaceUpgrade</strong>, you <strong>do not need to configure</strong> this parameter.</p>
     * <p>You can select a zone that belongs to the region in which the original instance resides.</p>
     * <p>You can call the DescribeRegions operation to query zone IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("ZoneIdSlave2")
    public String zoneIdSlave2;

    public static UpgradeDBInstanceMajorVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBInstanceMajorVersionRequest self = new UpgradeDBInstanceMajorVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeDBInstanceMajorVersionRequest setCollectStatMode(String collectStatMode) {
        this.collectStatMode = collectStatMode;
        return this;
    }
    public String getCollectStatMode() {
        return this.collectStatMode;
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
