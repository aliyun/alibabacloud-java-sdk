// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class UpgradeDBInstanceMajorVersionRequest extends TeaModel {
    /**
     * <p>The time at which ApsaraDB RDS collects the statistics of the new instance. Valid values:</p>
     * <br>
     * <p>*   Before: ApsaraDB RDS collects the statistics of the new instance before the switchover to ensure service stability. If the original instance contains a large amount of data, the upgrade may require a long period of time.</p>
     * <p>*   After: ApsaraDB RDS collects the statistics of the new instance after the switchover to accelerate the upgrade. If you access tables for which no statistics are generated, the execution plans that you specify may be inaccurate. In addition, your database service may be unavailable during peak hours.</p>
     * <br>
     * <p>> If you set the SwitchOver parameter to false, the value Before of this parameter specifies that ApsaraDB RDS collects the statistics of the new instance before the new instance starts to process read and write requests, and the value After of this parameter specifies that ApsaraDB RDS collects the statistics of the new instance after the new instance starts to process read and write requests.</p>
     */
    @NameInMap("CollectStatMode")
    public String collectStatMode;

    /**
     * <p>The instance type of the new instance. The vCPU and memory specifications of the new instance must be higher than or equal to the vCPU and memory specifications of the original instance.</p>
     * <br>
     * <p>For example, if the instance type of the original instance is `pg.n2.small.2c`, which provides 1 core and 2 GB of memory, the instance type of the new instance can be `pg.n2.medium.2c`, which provides 2 cores and 4 GB of memory.</p>
     * <br>
     * <p>> For more information about instance types in ApsaraDB RDS for PostgreSQL, see [Primary ApsaraDB RDS for PostgreSQL instance types](~~276990~~).</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The ID of the original instance.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the new instance.</p>
     * <br>
     * <p>Unit: GB</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Valid values if you use enhanced SSDs (ESSDs) of performance level 1 (PL1): 20 to 3200</p>
     * <p>*   Valid values if you use ESSDs of PL2: 500 to 3200</p>
     * <p>*   Valid values if you use ESSDs of PL3: 1500 to 3200</p>
     * <br>
     * <p>> If the original instance uses local SSDs, you can reduce the storage capacity of the instance when you upgrade the major engine version of the instance. For more information about the minimum available storage capacity, see [Upgrade the major engine version of an ApsaraDB RDS for PostgreSQL instance](~~203309~~).</p>
     */
    @NameInMap("DBInstanceStorage")
    public Integer DBInstanceStorage;

    /**
     * <p>The storage type of the new instance.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   cloud_ssd: standard SSDs</p>
     * <p>*   cloud_essd: ESSD of PL1</p>
     * <p>*   cloud_essd2: ESSD of PL2</p>
     * <p>*   cloud_essd3: ESSD of PL3</p>
     * <br>
     * <p>The major engine version upgrade feature is based on SSD snapshots. You can select a storage type based on the following conditions:</p>
     * <br>
     * <p>*   If the original instance uses standard SSDs, you can set this parameter to cloud_ssd.</p>
     * <p>*   If the original instance uses ESSDs, you can set this parameter to cloud_essd, cloud_essd2, or cloud_essd3.</p>
     * <p>*   If the original instance uses local SSDs, you can set this parameter to cloud_essd, cloud_essd2, or cloud_essd3.</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The network type of the new instance. Set the value to VPC. The major engine version upgrade feature is supported only for instances that reside in VPCs.</p>
     * <br>
     * <p>If the original instance resides in the classic network, you must migrate the instance to a VPC before you call this operation. For more information about how to view or change the network type of an instance, see [Change the network type of an ApsaraDB RDS for PostgreSQL instance](~~96761~~).</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>The billing method of the new instance. Set the value to Postpaid.</p>
     * <br>
     * <p>> For more information about how to change the billing method of an instance after the upgrade, see [Change the billing method of an instance from pay-as-you-go to subscription](~~96743~~).</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The internal IP address of the new instance. You do not need to specify this parameter. ApsaraDB RDS automatically assigns an internal IP address based on the values of the VPCId and vSwitchId parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether ApsaraDB RDS automatically switches your workloads over to the new instance after data is migrated to the new instance.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true: ApsaraDB RDS automatically switches workloads over to the new instance.</p>
     * <p>*   false: ApsaraDB RDS does not automatically switch your workloads over to the new instance. Before you perform an upgrade, we recommend that you set this parameter to false to test whether the new major engine version is compatible with your workloads.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you set this parameter to true, you must take note of the following information:</p>
     * <br>
     * <p>    *   After the switchover is complete, you cannot roll your workloads back to the original instance. Proceed with caution.</p>
     * <p>    *   During the switchover, the original instance processes only read requests. We recommend that you perform the switchover during off-peak hours.</p>
     * <p>    *   If read-only instances are attached to the original instance, you can set this parameter only to false. In this case, the read-only instances that are attached to the original instance cannot be cloned. After the upgrade is complete, you must create read-only instances for the new instance.</p>
     * <br>
     * <p>*   If you set this parameter to false, you must take note of the following information:</p>
     * <br>
     * <p>    *   The data migration does not interrupt your workloads on the original instance.</p>
     * <p>    *   After data is migrated to the new instance, you must update the endpoint configuration on your application. This update requires you to replace the endpoint of the original instance with the endpoint of the new instance. For more information about how to view the endpoint of an instance, see [View and change the internal and public endpoints and port numbers of an ApsaraDB RDS for PostgreSQL instance](~~96788~~).</p>
     */
    @NameInMap("SwitchOver")
    public String switchOver;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The time at which ApsaraDB RDS switches your workloads over to the new instance. This parameter is used together with the SwitchOver parameter and takes effect only when you set the SwitchOver parameter to true.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   Immediate: After data is migrated to the new instance, ApsaraDB RDS immediately switches your workloads over to the new instance.</p>
     * <p>*   MaintainTime: After data is migrated to the new instance, ApsaraDB RDS switches your workloads over to the new instance during the maintenance window that you specify. You can call the [ModifyDBInstanceMaintainTime](~~26249~~) operation to change the maintenance window of an instance.</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    /**
     * <p>The major engine version of the new instance. The value of this parameter must be the major engine version on which an upgrade check is performed.</p>
     * <br>
     * <p>> You can call the [UpgradeDBInstanceMajorVersionPrecheck](~~330050~~) operation to perform an upgrade check.</p>
     */
    @NameInMap("TargetMajorVersion")
    public String targetMajorVersion;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The ID of the VPC in which the original instance resides. You can call the [DescribeDBInstanceAttribute](~~26231~~) operation to query the VPC ID of the instance.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>*   If the original instance runs RDS Basic Edition, you must enter the vSwitch ID of the new instance.</p>
     * <p>*   If the original instance runs RDS High-availability Edition, you must enter the vSwitch ID of the new instance and the vSwitch ID of the secondary instance of the new instance. Make sure that you separate the vSwitch IDs with commas (,).</p>
     * <br>
     * <p>> The vSwitches that you specify must reside in the same zone as the original instance. You can call the [DescribeVSwitches](~~35748~~) operation to query the ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID of the new instance. You can call the [DescribeRegions](~~26243~~) operation to query the zone ID.</p>
     * <br>
     * <p>You can select a zone that belongs to the region in which the original instance resides. The zone can be different from the zone of the original instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The zone ID of the secondary instance for the new instance. You can specify this parameter only when the original instance runs RDS High-availability Edition.</p>
     * <br>
     * <p>You can select a zone that belongs to the region in which the original instance resides. The zone can be different from the zone of the original instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~26243~~) operation to query the zone ID.</p>
     */
    @NameInMap("ZoneIdSlave1")
    public String zoneIdSlave1;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
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
