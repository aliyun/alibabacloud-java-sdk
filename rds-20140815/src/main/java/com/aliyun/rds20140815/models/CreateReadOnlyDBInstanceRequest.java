// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateReadOnlyDBInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
     * <br>
     * <p>1.  **true**: enables the feature. Make sure that your account balance is sufficient.</p>
     * <p>2.  **false**: disables the feature. An unpaid order is generated.</p>
     * <br>
     * <p>>  Default value: true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable the auto-renewal feature for the read-only instance. If you set the PayType parameter to Prepaid, you must also specify this parameter. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the feature.</p>
     * <p>*   **false**: disables the feature.</p>
     * <br>
     * <p>> * If you set the Period parameter to Month, the auto-renewal cycle is one month.</p>
     * <p>> * If you set the Period parameter to Year, the auto-renewal cycle is one year.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("BpeEnabled")
    public String bpeEnabled;

    /**
     * <p>An invalid parameter. You do not need to specify this parameter.</p>
     */
    @NameInMap("BurstingEnabled")
    public Boolean burstingEnabled;

    /**
     * <p>The RDS edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Basic**: RDS Basic Edition</p>
     * <p>*   **HighAvailability** (default): RDS High-availability Edition</p>
     * <p>*   **AlwaysOn**: RDS Cluster Edition</p>
     * <br>
     * <p>>  The read-only instances of the primary instance that run PostgreSQL and use cloud disks run RDS Basic Edition. Therefore, set this parameter to **Basic**.</p>
     */
    @NameInMap("Category")
    public String category;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance type of the read-only instance. For more information, see [Read-only instance types](~~145759~~). We recommend that you specify an instance type whose specifications are higher than or equal to the specifications of the instance type of the primary instance. If the specifications of the read-only instance are lower than the specifications of the primary instance, the read-only instance may encounter issues such as high latency and heavy load.</p>
     */
    @NameInMap("DBInstanceClass")
    public String DBInstanceClass;

    /**
     * <p>The description of the read-only instance. The description must be 2 to 256 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The value must start with a letter</p>
     * <br>
     * <p>> The value cannot start with [http:// or https://.](http://https://。)</p>
     */
    @NameInMap("DBInstanceDescription")
    public String DBInstanceDescription;

    /**
     * <p>The primary instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The storage capacity of the read-only instance. The storage capacity of the read-only instance must be greater than or equal to that of the primary instance. For more information, see the **Storage capacity** column in [Read-only instance types](~~145759~~). This value must be a multiple of 5. Unit: GB.</p>
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
     * <p>*   **cloud_essd3**: ESSDs of PL3</p>
     * <br>
     * <p>> *   If the primary instance runs MySQL with local disks, you must set this parameter to **local_ssd**. If the primary instance runs MySQL with cloud disks, you must set this parameter to cloud_ssd, cloud_essd, cloud_essd2, or cloud_essd3.</p>
     * <p>> *   If the primary instance runs SQL Server, you must set this parameter to cloud_ssd, cloud_essd, cloud_essd2, or cloud_essd3.</p>
     */
    @NameInMap("DBInstanceStorageType")
    public String DBInstanceStorageType;

    /**
     * <p>The ID of the dedicated cluster to which the read-only instance belongs. This parameter is valid when you create the read-only instance in a dedicated cluster.</p>
     */
    @NameInMap("DedicatedHostGroupId")
    public String dedicatedHostGroupId;

    /**
     * <p>Specifies whether to enable the release protection feature for the read-only instance. Valid values:</p>
     * <br>
     * <p>*   **true**: enables the feature.</p>
     * <p>*   **false** (default): disables the feature.</p>
     * <br>
     * <p>>  You can enable the release protection feature for the read-only instance only when you set the **Billing Method** parameter to **Pay-As-You-Go**.</p>
     */
    @NameInMap("DeletionProtection")
    public Boolean deletionProtection;

    /**
     * <p>The version of the database engine. The read-only instance and the primary instance must run the same major engine version.</p>
     * <br>
     * <p>*   If the read-only instance runs MySQL, set this parameter to **5.6**, **5.7**, or **8.0**.</p>
     * <p>*   If the read-only instance runs MySQL, set this parameter to **2017\_ent, 2019\_ent, or 2022\_ent**.</p>
     * <p>*   If the read-only instance runs PostgreSQL, set this parameter to **10.0, 11.0, 12.0, 13.0, 14.0, or 15.0**.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("GdnInstanceName")
    public String gdnInstanceName;

    /**
     * <p>The network type of the read-only instance. Valid values:</p>
     * <br>
     * <p>*   **VPC**</p>
     * <p>*   **Classic**</p>
     * <br>
     * <p>Default value: VPC. If you set this parameter to VPC, you must also specify the **VPCId** and **VSwitchId** parameters.</p>
     * <br>
     * <p>> The network type of the read-only instance can be different from the network type of the primary instance.</p>
     */
    @NameInMap("InstanceNetworkType")
    public String instanceNetworkType;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("InstructionSetArch")
    public String instructionSetArch;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("IoAccelerationEnabled")
    public String ioAccelerationEnabled;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the read-only instance. Valid values:</p>
     * <br>
     * <p>*   **Postpaid**: pay-as-you-go</p>
     * <p>*   **Prepaid**: subscription</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The renewal cycle of the read-only instance. Valid values:</p>
     * <br>
     * <p>*   **Year**</p>
     * <p>*   **Month**</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The port that can be initialized when you create a read-only ApsaraDB RDS for MySQL instance.</p>
     * <br>
     * <p>Valid values: 1000 to 65534.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The private IP address of the read-only instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. The system assigns a private IP address to the read-only instance based on the values of the **VPCId** and **VSwitchId** parameters.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The region ID. The read-only instance and the primary instance must reside in the same region. You can call the DescribeRegions operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

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
     * <p>The ID of the host on which the primary instance resides. This parameter is valid when you create the read-only instance in a dedicated cluster.</p>
     */
    @NameInMap("TargetDedicatedHostIdForMaster")
    public String targetDedicatedHostIdForMaster;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("TddlBizType")
    public String tddlBizType;

    /**
     * <p>A reserved parameter.</p>
     */
    @NameInMap("TddlRegionConfig")
    public String tddlRegionConfig;

    /**
     * <p>The subscription duration of the read-only instance. Valid values:</p>
     * <br>
     * <p>*   If you set the **Period** parameter to **Year**, the value of the **UsedTime** parameter ranges from **1** to **5**.</p>
     * <p>*   If you set the **Period** parameter to **Month**, the value of the **UsedTime** parameter ranges from **1** to **9**.</p>
     * <br>
     * <p>> If you set the **PayType** parameter to **Prepaid**, you must specify the UsedTime parameter.</p>
     */
    @NameInMap("UsedTime")
    public String usedTime;

    /**
     * <p>The virtual private cloud (VPC) ID of the read-only instance. If you leave the **InstanceNetworkType** parameter empty or set it to **VPC**, you must also specify this parameter.</p>
     * <br>
     * <p>> * If the primary instance uses local disks, the read-only instance and the primary instance can belong to the same VPC or different VPCs.</p>
     * <p>> * If the primary instance uses cloud disks, the read-only instance and the primary instance must belong to the same VPC.</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The vSwitch ID of the read-only instance. If you leave the **InstanceNetworkType** parameter empty or set it to **VPC**, you must specify the VSwitchId parameter.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The zone ID. You can call the DescribeRegions operation to query the zone ID.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateReadOnlyDBInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReadOnlyDBInstanceRequest self = new CreateReadOnlyDBInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateReadOnlyDBInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateReadOnlyDBInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateReadOnlyDBInstanceRequest setBpeEnabled(String bpeEnabled) {
        this.bpeEnabled = bpeEnabled;
        return this;
    }
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    public CreateReadOnlyDBInstanceRequest setBurstingEnabled(Boolean burstingEnabled) {
        this.burstingEnabled = burstingEnabled;
        return this;
    }
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    public CreateReadOnlyDBInstanceRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateReadOnlyDBInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateReadOnlyDBInstanceRequest setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
        return this;
    }
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    public CreateReadOnlyDBInstanceRequest setDBInstanceDescription(String DBInstanceDescription) {
        this.DBInstanceDescription = DBInstanceDescription;
        return this;
    }
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    public CreateReadOnlyDBInstanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateReadOnlyDBInstanceRequest setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
        return this;
    }
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    public CreateReadOnlyDBInstanceRequest setDBInstanceStorageType(String DBInstanceStorageType) {
        this.DBInstanceStorageType = DBInstanceStorageType;
        return this;
    }
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    public CreateReadOnlyDBInstanceRequest setDedicatedHostGroupId(String dedicatedHostGroupId) {
        this.dedicatedHostGroupId = dedicatedHostGroupId;
        return this;
    }
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    public CreateReadOnlyDBInstanceRequest setDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
        return this;
    }
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    public CreateReadOnlyDBInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateReadOnlyDBInstanceRequest setGdnInstanceName(String gdnInstanceName) {
        this.gdnInstanceName = gdnInstanceName;
        return this;
    }
    public String getGdnInstanceName() {
        return this.gdnInstanceName;
    }

    public CreateReadOnlyDBInstanceRequest setInstanceNetworkType(String instanceNetworkType) {
        this.instanceNetworkType = instanceNetworkType;
        return this;
    }
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    public CreateReadOnlyDBInstanceRequest setInstructionSetArch(String instructionSetArch) {
        this.instructionSetArch = instructionSetArch;
        return this;
    }
    public String getInstructionSetArch() {
        return this.instructionSetArch;
    }

    public CreateReadOnlyDBInstanceRequest setIoAccelerationEnabled(String ioAccelerationEnabled) {
        this.ioAccelerationEnabled = ioAccelerationEnabled;
        return this;
    }
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
    }

    public CreateReadOnlyDBInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateReadOnlyDBInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateReadOnlyDBInstanceRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateReadOnlyDBInstanceRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public CreateReadOnlyDBInstanceRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateReadOnlyDBInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateReadOnlyDBInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateReadOnlyDBInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateReadOnlyDBInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateReadOnlyDBInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateReadOnlyDBInstanceRequest setTargetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
        this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
        return this;
    }
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    public CreateReadOnlyDBInstanceRequest setTddlBizType(String tddlBizType) {
        this.tddlBizType = tddlBizType;
        return this;
    }
    public String getTddlBizType() {
        return this.tddlBizType;
    }

    public CreateReadOnlyDBInstanceRequest setTddlRegionConfig(String tddlRegionConfig) {
        this.tddlRegionConfig = tddlRegionConfig;
        return this;
    }
    public String getTddlRegionConfig() {
        return this.tddlRegionConfig;
    }

    public CreateReadOnlyDBInstanceRequest setUsedTime(String usedTime) {
        this.usedTime = usedTime;
        return this;
    }
    public String getUsedTime() {
        return this.usedTime;
    }

    public CreateReadOnlyDBInstanceRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public CreateReadOnlyDBInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateReadOnlyDBInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
