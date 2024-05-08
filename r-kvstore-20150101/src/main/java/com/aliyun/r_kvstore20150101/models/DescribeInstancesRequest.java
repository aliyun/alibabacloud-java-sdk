// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
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
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **PrePaid**: subscription</p>
     * <p>*   **PostPaid**: pay-as-you-go</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Community**: ApsaraDB for Redis Community Edition</p>
     * <p>*   **Enterprise**: ApsaraDB for Redis Enhanced Edition (Tair)</p>
     */
    @NameInMap("EditionType")
    public String editionType;

    /**
     * <p>The engine version of the instance. Valid values: **2.8**, **4.0**, and **5.0**.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   1.0</p>
     * <p>*   2.8</p>
     * <p>*   4.0</p>
     * <p>*   5.0</p>
     * <p>*   6.0</p>
     * <p>*   7.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether the instance has expired. Valid values:</p>
     * <br>
     * <p>*   **true**: The instance has expired.</p>
     * <p>*   **false**: The instance has not expired.</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>Specifies whether to return the child instances of distributed instances. Valid values:</p>
     * <br>
     * <p>*   **true**: Only child instances are returned.</p>
     * <p>*   **false**: Child instances are not returned.</p>
     */
    @NameInMap("GlobalInstance")
    public Boolean globalInstance;

    /**
     * <p>The instance type of the instance. For more information, see [Instance types](~~107984~~).</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The IDs of the instances that you want to query.</p>
     * <br>
     * <p>>  If you want to specify multiple instance IDs, separate the instance IDs with commas (,). You can specify a maximum of 30 instance IDs in a single request.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <br>
     * <p>*   **Normal**: The instance is normal.</p>
     * <p>*   **Creating**: The instance is being created.</p>
     * <p>*   **Changing**: The configurations of the instance are being changed.</p>
     * <p>*   **Inactive**: The instance is disabled.</p>
     * <p>*   **Flushing**: The instance is being released.</p>
     * <p>*   **Released**: The instance is released.</p>
     * <p>*   **Transforming**: The billing method of the instance is being changed.</p>
     * <p>*   **Unavailable**: The instance is suspended.</p>
     * <p>*   **Error**: The instance failed to be created.</p>
     * <p>*   **Migrating**: The instance is being migrated.</p>
     * <p>*   **BackupRecovering**: The instance is being restored from a backup.</p>
     * <p>*   **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
     * <p>*   **NetworkModifying**: The network type of the instance is being changed.</p>
     * <p>*   **SSLModifying**: The SSL certificate of the instance is being changed.</p>
     * <p>*   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</p>
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
     * <p>The network type. Valid values:</p>
     * <br>
     * <p>*   **CLASSIC**</p>
     * <p>*   **VPC**</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. Pages start from page **1**. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: **50**. Default value: **30**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP address of the instance.</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The region ID of the instance.</p>
     * <br>
     * <p>> When you call this operation and specify the **Tag** parameter, you must also specify this parameter.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * <br>
     * <p>> You can query resource group IDs by using the ApsaraDB for Redis console or by calling the [ListResourceGroups](~~158855~~) operation. For more information, see [View basic information of a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The keyword used for fuzzy search. The keyword can be based on an instance name or an instance ID.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The tags of the instance.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    /**
     * <p>The ID of the vSwitch.</p>
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

    public static DescribeInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesRequest self = new DescribeInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesRequest setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
        return this;
    }
    public String getArchitectureType() {
        return this.architectureType;
    }

    public DescribeInstancesRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeInstancesRequest setEditionType(String editionType) {
        this.editionType = editionType;
        return this;
    }
    public String getEditionType() {
        return this.editionType;
    }

    public DescribeInstancesRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribeInstancesRequest setExpired(String expired) {
        this.expired = expired;
        return this;
    }
    public String getExpired() {
        return this.expired;
    }

    public DescribeInstancesRequest setGlobalInstance(Boolean globalInstance) {
        this.globalInstance = globalInstance;
        return this;
    }
    public Boolean getGlobalInstance() {
        return this.globalInstance;
    }

    public DescribeInstancesRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribeInstancesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeInstancesRequest setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public DescribeInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeInstancesRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public DescribeInstancesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeInstancesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesRequest setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }
    public String getPrivateIp() {
        return this.privateIp;
    }

    public DescribeInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeInstancesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeInstancesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeInstancesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeInstancesRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

    public DescribeInstancesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInstancesRequest setTag(java.util.List<DescribeInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeInstancesRequestTag> getTag() {
        return this.tag;
    }

    public DescribeInstancesRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public DescribeInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public DescribeInstancesRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class DescribeInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key. A tag is a key-value pair.</p>
         * <br>
         * <p>>  A maximum of five key-value pairs can be specified at a time.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesRequestTag self = new DescribeInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
