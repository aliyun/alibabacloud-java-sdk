// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesOverviewRequest extends TeaModel {
    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <br>
     * <p>*   **cluster**: cluster architecture</p>
     * <p>*   **standard**: standard architecture</p>
     * <p>*   **rwsplit**: read/write splitting architecture</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Community**: Community Edition</p>
     * <p>*   **Enterprise**: Enhance Edition (Tair)</p>
     */
    @NameInMap("EditionType")
    public String editionType;

    /**
     * <p>The database engine version of the instance. Valid values: **2.8**, **4.0**, and **5.0**.</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance type. For more information, see [Instance types](~~107984~~).</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  By default, all instances that belong to this account are queried. If you specify multiple instance IDs, separate the instance IDs with commas (,).</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <br>
     * <p>* **Normal**: The instance is normal.</p>
     * <p>* **Creating**: The instance is being created.</p>
     * <p>* **Changing**: The configurations of the instance are being changed.</p>
     * <p>* **Inactive**: The instance is disabled.</p>
     * <p>* **Flushing**: The instance is being released.</p>
     * <p>* **Released**: The instance is released.</p>
     * <p>* **Transforming**: The billing method of the instance is changing.</p>
     * <p>* **Unavailable**: The instance is suspended.</p>
     * <p>* **Error**: The instance failed to be created.</p>
     * <p>* **Migrating**: The instance is being migrated.</p>
     * <p>* **BackupRecovering**: The instance is being restored from a backup.</p>
     * <p>* **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
     * <p>* **NetworkModifying**: The network type of the instance is being changed.</p>
     * <p>* **SSLModifying**: The SSL certificate of the instance is being changed.</p>
     * <p>* **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains available during the upgrade.</p>
     * <br>
     * <p>> For more information about instance states, see [Instance states and impacts](~~200740~~).</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>*   **Tair**</p>
     * <p>*   **Redis**</p>
     * <p>*   **Memcache**</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <br>
     * <p>*   **CLASSIC**: classic network</p>
     * <p>*   **VPC**: Virtual Private Cloud (VPC)</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private IP address of the instance.</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The region ID of the instance whose information you want to query. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the instance.</p>
     * <br>
     * <p>>  You can query resource group IDs by using the ApsaraDB for Redis console or by calling the [ListResourceGroups](~~158855~~) operation. For more information, see [View basic information of a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The keyword used for fuzzy search. The keyword can be based on an instance ID or an instance description.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the vSwitch to which the instance is connected.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID of the instance.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeInstancesOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesOverviewRequest self = new DescribeInstancesOverviewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesOverviewRequest setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
    }

    public DescribeInstancesOverviewRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeInstancesOverviewRequest setEditionType(String editionType) {
        this.editionType = editionType;
        return this;
    }
    public String getEditionType() {
        return this.editionType;
    }

    public DescribeInstancesOverviewRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeInstancesOverviewRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeInstancesOverviewRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstancesOverviewRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeInstancesOverviewRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstancesOverviewRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeInstancesOverviewRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstancesOverviewRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstancesOverviewRequest setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public DescribeInstancesOverviewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesOverviewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesOverviewRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstancesOverviewRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInstancesOverviewRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeInstancesOverviewRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInstancesOverviewRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeInstancesOverviewRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeInstancesOverviewRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
