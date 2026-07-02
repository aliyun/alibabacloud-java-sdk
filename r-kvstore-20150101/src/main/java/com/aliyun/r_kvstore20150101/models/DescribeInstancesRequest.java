// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesRequest extends TeaModel {
    /**
     * <p>The architecture type. Valid values:</p>
     * <ul>
     * <li><strong>cluster</strong>: cluster.</li>
     * <li><strong>standard</strong>: standard.</li>
     * <li><strong>rwsplit</strong>: read/write splitting.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Community</strong>: ApsaraDB for Redis Community Edition.</li>
     * <li><strong>Enterprise</strong>: Tair Enhanced Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
    @NameInMap("EditionType")
    public String editionType;

    /**
     * <p>The Redis-compatible engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, <strong>5.0</strong>, <strong>6.0</strong>, and <strong>7.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The expiration status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: expired.</li>
     * <li><strong>false</strong>: not expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Expired")
    public String expired;

    /**
     * <p>Specifies whether to filter child instances of distributed instances from the returned instance list. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: returns only child instance information.</li>
     * <li><strong>false</strong>: does not return child instance information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GlobalInstance")
    public Boolean globalInstance;

    /**
     * <p>The instance type. For more information, see <a href="https://help.aliyun.com/document_detail/107984.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The IDs of the instances to query.</p>
     * <blockquote>
     * <p>To specify multiple instance IDs, separate them with commas (,). A maximum of 30 instance IDs can be specified in a single request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The status of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: normal.</li>
     * <li><strong>Creating</strong>: being created.</li>
     * <li><strong>Changing</strong>: being changed.</li>
     * <li><strong>Inactive</strong>: disabled.</li>
     * <li><strong>Flushing</strong>: being flushed.</li>
     * <li><strong>Released</strong>: released.</li>
     * <li><strong>Transforming</strong>: being transformed.</li>
     * <li><strong>Migrating</strong>: being migrated.</li>
     * <li><strong>BackupRecovering</strong>: being restored from a backup.</li>
     * <li><strong>MinorVersionUpgrading</strong>: minor version being upgraded.</li>
     * <li><strong>NetworkModifying</strong>: network type being changed.</li>
     * <li><strong>SSLModifying</strong>: SSL being changed.</li>
     * <li><strong>MajorVersionUpgrading</strong>: major version being upgraded. The instance can be accessed normally.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about instance statuses, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance statuses and impacts</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("InstanceStatus")
    public String instanceStatus;

    /**
     * <p>The category of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Tair</strong>: Tair (Enhanced Edition)</li>
     * <li><strong>Redis</strong>: ApsaraDB for Redis Community Edition</li>
     * <li><strong>Memcache</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: classic network.</li>
     * <li><strong>VPC</strong>: virtual private cloud (VPC).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLASSIC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>MASTER_SLAVE</strong>: high availability (dual-replica)</li>
     * <li><strong>STAND_ALONE</strong>: single replica</li>
     * <li><strong>double</strong>: dual-replica</li>
     * <li><strong>single</strong>: single replica<blockquote>
     * <p>For cloud-native instances, select <strong>MASTER_SLAVE</strong> or <strong>STAND_ALONE</strong>. For classic instances, select <strong>double</strong> or <strong>single</strong>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number of the instance list. Pages start from <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries per page. Maximum value: <strong>50</strong>. Default value: <strong>30</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The private IP address of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.49.***</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The region ID of the instance.</p>
     * <blockquote>
     * <p>When calling this API, if the <strong>Tag</strong> parameter is specified, this parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> API or use the console to obtain the list of resource group IDs. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4ekp****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The keyword used for fuzzy search by instance name or instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
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
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1nme44gek34slfc****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hongkong-b</p>
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

    public DescribeInstancesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
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
         * <p>The key of the tag. The tag key and value together form a key-value pair.</p>
         * <blockquote>
         * <p>A maximum of 5 tag key-value pairs can be specified at a time.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>存储类型</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. The tag value and key together form a key-value pair.</p>
         * 
         * <strong>example:</strong>
         * <p>开发</p>
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
