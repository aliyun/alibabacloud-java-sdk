// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <p>The connection mode of the instance. Valid values:</p>
     * <br>
     * <p>*   **Standard**: standard mode</p>
     * <p>*   **Safe**: proxy mode</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The username that is used to connect to the instance. By default, the username that is named after the instance ID is returned.</p>
     */
    @NameInMap("EditionType")
    public String editionType;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>*   **Tair**</p>
     * <p>*   **Redis**</p>
     * <p>*   **Memcache**</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The database engine type of the instance. Valid values:</p>
     * <br>
     * <p>*   **Tair**</p>
     * <p>*   **Redis**</p>
     * <p>*   **Memcache**</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>The details of the tags.</p>
     */
    @NameInMap("GlobalInstance")
    public Boolean globalInstance;

    /**
     * <p>The database engine version of the instance. Valid values: **2.8**, **4.0**, and **5.0**.</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The node type. Valid values:</p>
     * <br>
     * <p>*   **double**: The instance contains a master node and a replica node.</p>
     * <p>*   **single**: The instance contains only a master node. This node type is phrased out.</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <br>
     * <p>*   **Community**: Community Edition</p>
     * <p>*   **Enterprise**: Enhance Edition (Tair)</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The key of the tag.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <br>
     * <p>*   **Normal**: The instance is normal.</p>
     * <p>*   **Creating**: The instance is being created.</p>
     * <p>*   **Changing**: The configurations of the instance are being changed.</p>
     * <p>*   **Inactive**: The instance is disabled.</p>
     * <p>*   **Flushing**: The instance is being released.</p>
     * <p>*   **Released**: The instance is released.</p>
     * <p>*   **Transforming**: The billing method of the instance is changing.</p>
     * <p>*   **Unavailable**: The instance is suspended.</p>
     * <p>*   **Error**: The instance failed to be created.</p>
     * <p>*   **Migrating**: The instance is being migrated.</p>
     * <p>*   **BackupRecovering**: The instance is being restored from a backup.</p>
     * <p>*   **MinorVersionUpgrading**: The minor version of the instance is being updated.</p>
     * <p>*   **NetworkModifying**: The network type of the instance is being changed.</p>
     * <p>*   **SSLModifying**: The SSL certificate of the instance is being changed.</p>
     * <p>*   **MajorVersionUpgrading**: The major version of the instance is being upgraded. The instance remains available during the upgrade.</p>
     * <br>
     * <p>>  For more information about instance states, see [Instance states and impacts](~~200740~~).</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The parameter configurations of the instance. For more information, see [Modify parameters of an instance](~~43885~~).</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP address of the instance.</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The service port of the instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the vSwitch to which the instance is connected.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The number of entries to return on each page. Maximum value: **50**. Default value: **10**.</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The bandwidth of the instance. Unit: MB/s.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeInstancesRequestTag> tag;

    /**
     * <p>The keyword used for fuzzy search. The keyword can be based on an instance name or an instance ID.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  If you specify multiple instance IDs, separate the instance IDs with commas (,).</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The architecture of the instance. Default value: NULL. Valid values:</p>
     * <br>
     * <p>*   **cluster**: cluster architecture</p>
     * <p>*   **standard**: standard architecture</p>
     * <p>*   **rwsplit**: read/write splitting architecture</p>
     * <p>*   **NULL**: The instance can be a cluster instance, standard instance, or read/write splitting instance.</p>
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
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The instance type.</p>
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
