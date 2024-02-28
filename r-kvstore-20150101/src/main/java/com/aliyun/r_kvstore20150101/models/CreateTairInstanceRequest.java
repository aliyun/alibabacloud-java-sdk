// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTairInstanceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Set the value to **true**.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal.</p>
     * <p>*   **false**: disables auto-renewal.</p>
     */
    @NameInMap("AutoRenew")
    public String autoRenew;

    /**
     * <p>The subscription duration that is supported by auto-renewal. Unit: months. Valid values: **1**, **2**, **3**, **6**, and **12**.</p>
     * <br>
     * <p>> This parameter is required only if the **AutoRenew** parameter is set to **true**.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public String autoRenewPeriod;

    /**
     * <p>Specifies whether to use a coupon. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: uses a coupon.</p>
     * <p>*   **false**: does not use a coupon.</p>
     */
    @NameInMap("AutoUseCoupon")
    public String autoUseCoupon;

    /**
     * <p>The ID of the backup set of the source instance. You can call the [DescribeBackups](~~61081~~) operation to query the ID of the backup set.</p>
     * <br>
     * <p>> If you want to create an instance based on the backup set of an existing instance, you must specify this parameter after you specify the **SrcDBInstanceId** parameter. The system creates an instance based on the backup set that is specified by this parameter.</p>
     */
    @NameInMap("BackupId")
    public String backupId;

    /**
     * <p>The ID of the promotion event or the business information.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The billing method of the instance. Default value: PrePaid. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the token is unique among different requests. The token is case-sensitive. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>集群备份集ID。</p>
     */
    @NameInMap("ClusterBackupId")
    public String clusterBackupId;

    /**
     * <p>The coupon code.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to perform a dry run. Default value: false. Valid values:</p>
     * <br>
     * <p>*   **true**: performs a dry run and does not create the instance. The system prechecks the request parameters, request format, service limits, and available resources. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: performs a dry run and sends the request. If the request passes the dry run, the instance is created.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The engine version. Default value: **1.0**. The parameter value varies with the Tair instance type.</p>
     * <br>
     * <p>*   For Tair DRAM-based instances (tair_rdb) that are compatible with Redis 5.0 or 6.0, set this parameter to 5.0 or 6.0.</p>
     * <p>*   For Tair persistent memory-optimized instances (tair_scm) that are compatible with Redis 6.0, set this parameter to 1.0.</p>
     * <p>*   For Tair ESSD-based instances (tair_essd) that are compatible with Redis 4.0 or 6.0, set this parameter to 1.0 or 2.0.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The ID of the distributed instance.</p>
     */
    @NameInMap("GlobalInstanceId")
    public String globalInstanceId;

    /**
     * <p>The global IP whitelist template of the instance. Separate multiple IP whitelist templates with commas (,) and make sure that each IP whitelist template is unique.</p>
     */
    @NameInMap("GlobalSecurityGroupIds")
    public String globalSecurityGroupIds;

    /**
     * <p>The instance type. For more information, see the following topics:</p>
     * <br>
     * <p>*   [DRAM-based instances](~~443844~~)</p>
     * <p>*   [Persistent memory-optimized instances](~~443845~~)</p>
     * <p>*   [ESSD-based instances](~~443846~~)</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The name of the instance. The name must meet the following requirements:</p>
     * <br>
     * <p>*   The name is 2 to 80 characters in length.</p>
     * <p>*   The name starts with a letter and does not contain spaces or special characters. Special characters include `@ / : = " < > { [ ] }`</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The storage type of the instance. Valid values:</p>
     * <br>
     * <p>*   **tair_rdb**: ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance</p>
     * <p>*   **tair_scm**: ApsaraDB for Redis Enhanced Edition (Tair) persistent memory-optimized instance</p>
     * <p>*   **tair_essd**: ApsaraDB for Redis Enhanced Edition (Tair) ESSD-based instance</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the parameter template. The instance is created based on the parameters in the parameter template. The ID must be unique.</p>
     */
    @NameInMap("ParamGroupId")
    public String paramGroupId;

    /**
     * <p>The password that is used to connect to the instance. The password must meet the following requirements:</p>
     * <br>
     * <p>*   The password is 8 to 32 characters in length.</p>
     * <p>*   The password contains at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include `! @ # $ % ^ & * ( ) _ + - =`</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The subscription duration. Valid values: **1**, 2, 3, 4, 5, 6, 7, 8, **9**, **12**, **24**,**36**, and **60**. Unit: months.</p>
     * <br>
     * <p>> This parameter is required only if you set the **ChargeType** parameter to **PrePaid**.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The port number of the instance. Valid values: **1024** to **65535**. Default value: **6379**.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The private IP address of the instance.</p>
     * <br>
     * <p>> The IP address must be within the CIDR block of the vSwitch to which you want the instance to connect. You can call the [DescribeVSwitches](~~35748~~) operation of the VPC API to query the CIDR block information.</p>
     */
    @NameInMap("PrivateIpAddress")
    public String privateIpAddress;

    /**
     * <p>The number of read-only nodes of the instance. This parameter is available only if you create a read/write splitting instance that uses cloud disks. You can use this parameter to specify a custom number of read-only nodes for the instance. Valid value: 1 to 5.</p>
     */
    @NameInMap("ReadOnlyCount")
    public Integer readOnlyCount;

    /**
     * <p>The ID of the region where you want to create the instance. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which you want to assign the instance.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   You can query resource group IDs by using the ApsaraDB for Redis console or by calling the [ListResourceGroups](~~158855~~) operation. For more information, see [View basic information of a resource group](~~151181~~).</p>
     * <br>
     * <p>*   Before you modify the resource group to which an instance belongs, you can call the [ListResources](~~158866~~) operation to view the current resource group of the instance.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the secondary zone. You can call the [DescribeRegions](~~61012~~) operation to query the ID of the secondary zone.</p>
     * <br>
     * <p>> You cannot specify multiple zone IDs or set this parameter to a value that is the same as that of the ZoneId parameter.</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of data nodes in the instance. Valid values:</p>
     * <br>
     * <p>*   **1**: You can create an instance in the standard architecture that contains only one data node. For more information about the standard architecture, see [Cluster master-replica instances](~~52228~~). This is the default value.</p>
     * <p>*   **2** to **32**: You can create an instance in the cluster architecture that contains the specified number of data nodes. For more information about the cluster architecture, see [Cluster master-replica instances](~~52228~~).</p>
     * <br>
     * <p>> Only persistent memory-optimized instances can use the cluster architecture. Therefore, you can set this parameter to an integer from **2** to **32** only if you set the **InstanceType** parameter to **tair_scm**.</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The data shard type of the instance. Default value: MASTER_SLAVE. Valid values:</p>
     * <br>
     * <p>*   **MASTER_SLAVE**: runs in a master-replica architecture that provides high availability.</p>
     * <p>*   **STAND_ALONE**: runs in a standalone architecture. If the only node fails, the system creates a new instance and switches the workloads to the new instance. This may cause data loss. You can set this parameter to this value only if the instance uses the **single-zone** deployment type. If you set this parameter to this value, you cannot create cluster or read/write splitting instances.</p>
     */
    @NameInMap("ShardType")
    public String shardType;

    @NameInMap("SlaveReadOnlyCount")
    public Integer slaveReadOnlyCount;

    /**
     * <p>The ID of the source instance.</p>
     * <br>
     * <p>> If you want to create an instance based on the backup set of an existing instance, set this parameter to the ID of the source instance and the **BackupId** parameter to the backup set that you want to use.</p>
     */
    @NameInMap("SrcDBInstanceId")
    public String srcDBInstanceId;

    /**
     * <p>The storage space of cloud disks. Valid values vary based on the instance specifications. For more information, see [ESSD-based instances](~~443846~~).</p>
     * <br>
     * <p>> This parameter is available and required only if the **InstanceType** parameter is set to **tair_essd**.</p>
     */
    @NameInMap("Storage")
    public Integer storage;

    /**
     * <p>The storage type of the instance. Set the value to **essd_pl1**.</p>
     * <br>
     * <p>> This parameter is available only if the **InstanceType** parameter is set to **tair_essd**.</p>
     */
    @NameInMap("StorageType")
    public String storageType;

    /**
     * <p>The tags to add to the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTairInstanceRequestTag> tag;

    /**
     * <p>The ID of the vSwitch that belongs to the VPC. You can call the [DescribeVpcs](~~35739~~) operation to query the ID of the vSwitch.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the virtual private cloud (VPC). You can call the [DescribeVpcs](~~35739~~) operation to query the ID of the VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The primary zone ID of the instance. You can call the [DescribeRegions](~~61012~~) operation to query the IDs of available zones.</p>
     * <br>
     * <p>>  You can also set the SecondaryZoneId parameter to specify the secondary zone. The primary and secondary nodes will then be deployed in the specified primary and secondary zones to implement the master-replica zone-disaster recovery architecture. For example, you can set the ZoneId parameter to cn-hangzhou-h and the SecondaryZoneId parameter to cn-hangzhou-g.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateTairInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTairInstanceRequest self = new CreateTairInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateTairInstanceRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateTairInstanceRequest setAutoRenew(String autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public String getAutoRenew() {
        return this.autoRenew;
    }

    public CreateTairInstanceRequest setAutoRenewPeriod(String autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public String getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public CreateTairInstanceRequest setAutoUseCoupon(String autoUseCoupon) {
        this.autoUseCoupon = autoUseCoupon;
        return this;
    }
    public String getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    public CreateTairInstanceRequest setBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }
    public String getBackupId() {
        return this.backupId;
    }

    public CreateTairInstanceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public CreateTairInstanceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateTairInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTairInstanceRequest setClusterBackupId(String clusterBackupId) {
        this.clusterBackupId = clusterBackupId;
        return this;
    }
    public String getClusterBackupId() {
        return this.clusterBackupId;
    }

    public CreateTairInstanceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public CreateTairInstanceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTairInstanceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public CreateTairInstanceRequest setGlobalInstanceId(String globalInstanceId) {
        this.globalInstanceId = globalInstanceId;
        return this;
    }
    public String getGlobalInstanceId() {
        return this.globalInstanceId;
    }

    public CreateTairInstanceRequest setGlobalSecurityGroupIds(String globalSecurityGroupIds) {
        this.globalSecurityGroupIds = globalSecurityGroupIds;
        return this;
    }
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    public CreateTairInstanceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public CreateTairInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateTairInstanceRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateTairInstanceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTairInstanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTairInstanceRequest setParamGroupId(String paramGroupId) {
        this.paramGroupId = paramGroupId;
        return this;
    }
    public String getParamGroupId() {
        return this.paramGroupId;
    }

    public CreateTairInstanceRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateTairInstanceRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateTairInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public CreateTairInstanceRequest setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public CreateTairInstanceRequest setReadOnlyCount(Integer readOnlyCount) {
        this.readOnlyCount = readOnlyCount;
        return this;
    }
    public Integer getReadOnlyCount() {
        return this.readOnlyCount;
    }

    public CreateTairInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTairInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTairInstanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTairInstanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTairInstanceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    public CreateTairInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateTairInstanceRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public CreateTairInstanceRequest setShardType(String shardType) {
        this.shardType = shardType;
        return this;
    }
    public String getShardType() {
        return this.shardType;
    }

    public CreateTairInstanceRequest setSlaveReadOnlyCount(Integer slaveReadOnlyCount) {
        this.slaveReadOnlyCount = slaveReadOnlyCount;
        return this;
    }
    public Integer getSlaveReadOnlyCount() {
        return this.slaveReadOnlyCount;
    }

    public CreateTairInstanceRequest setSrcDBInstanceId(String srcDBInstanceId) {
        this.srcDBInstanceId = srcDBInstanceId;
        return this;
    }
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    public CreateTairInstanceRequest setStorage(Integer storage) {
        this.storage = storage;
        return this;
    }
    public Integer getStorage() {
        return this.storage;
    }

    public CreateTairInstanceRequest setStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }
    public String getStorageType() {
        return this.storageType;
    }

    public CreateTairInstanceRequest setTag(java.util.List<CreateTairInstanceRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTairInstanceRequestTag> getTag() {
        return this.tag;
    }

    public CreateTairInstanceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateTairInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateTairInstanceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateTairInstanceRequestTag extends TeaModel {
        /**
         * <p>The key of the tag. A tag is a key-value pair.</p>
         * <br>
         * <p>> A maximum of five key-value pairs can be specified at a time.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <br>
         * <p>> **N** specifies the serial number of the tag. For example, **Tag.1.Value** specifies the value of the first tag, and **Tag.2.Value** specifies the value of the second tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTairInstanceRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTairInstanceRequestTag self = new CreateTairInstanceRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTairInstanceRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTairInstanceRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
