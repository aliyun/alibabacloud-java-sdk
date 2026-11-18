// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesOverviewRequest extends TeaModel {
    /**
     * <p>The architecture type. Valid values:</p>
     * <ul>
     * <li><strong>cluster</strong>: Cluster.</li>
     * <li><strong>standard</strong>: Standard.</li>
     * <li><strong>rwsplit</strong>: Read/write splitting.</li>
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
     * <li><strong>PrePaid</strong>: Subscription.</li>
     * <li><strong>PostPaid</strong>: Pay-as-you-go.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The edition. Valid values:</p>
     * <ul>
     * <li><strong>Community</strong>: Community Edition.</li>
     * <li><strong>Enterprise</strong>: Enterprise Edition.</li>
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
     * <p>6.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance specifications. For more information, see <a href="https://help.aliyun.com/document_detail/107984.html">Instance specifications</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The IDs of the instances that you want to query.</p>
     * <blockquote>
     * <p>By default, all instances under the account are queried. To specify multiple instance IDs, separate the IDs with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The instance status. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: Running.</li>
     * <li><strong>Creating</strong>: Being created.</li>
     * <li><strong>Changing</strong>: Being modified.</li>
     * <li><strong>Inactive</strong>: Disabled.</li>
     * <li><strong>Flushing</strong>: Being purged.</li>
     * <li><strong>Released</strong>: Released.</li>
     * <li><strong>Transforming</strong>: Being transformed.</li>
     * <li><strong>Migrating</strong>: Being migrated.</li>
     * <li><strong>BackupRecovering</strong>: Recovering from a backup.</li>
     * <li><strong>MinorVersionUpgrading</strong>: Minor version upgrade in progress.</li>
     * <li><strong>NetworkModifying</strong>: Modifying the network.</li>
     * <li><strong>SSLModifying</strong>: Modifying SSL configurations.</li>
     * <li><strong>MajorVersionUpgrading</strong>: Major engine version upgrade in progress. The instance remains accessible.</li>
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
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>Tair</strong></li>
     * <li><strong>Redis</strong></li>
     * <li><strong>Memcache</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The network type. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: Classic network.</li>
     * <li><strong>VPC</strong>: VPC.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLASSIC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("NodeType")
    public String nodeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The VPC IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.49.***</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * <blockquote>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation or go to the console to obtain the resource group ID. Related operations: <a href="https://help.aliyun.com/document_detail/151181.html">View the basic information of a resource group</a>.</p>
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
     * <p>The keyword used for fuzzy search based on the instance ID or description.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-bp1e7clcw529l773d****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The VPC ID.</p>
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
     * <p>cn-hangzhou-b</p>
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

    public DescribeInstancesOverviewRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
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
