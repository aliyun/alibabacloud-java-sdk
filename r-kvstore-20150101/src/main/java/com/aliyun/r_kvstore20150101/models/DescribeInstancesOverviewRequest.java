// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeInstancesOverviewRequest extends TeaModel {
    /**
     * <p>The architecture of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cluster</strong>: cluster architecture</li>
     * <li><strong>standard</strong>: standard architecture</li>
     * <li><strong>rwsplit</strong>: read/write splitting architecture</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("ArchitectureType")
    public String architectureType;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
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
     * <li><strong>Community</strong>: Community Edition</li>
     * <li><strong>Enterprise</strong>: Enhanced Edition (Tair)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enterprise</p>
     */
    @NameInMap("EditionType")
    public String editionType;

    /**
     * <p>The database engine version of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>4.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>The instance type of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/107984.html">Instance types</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The IDs of instances.</p>
     * <blockquote>
     * <p>By default, all instances that belong to this account are queried. If you specify multiple instance IDs, separate the instance IDs with commas (,).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceIds")
    public String instanceIds;

    /**
     * <p>The state of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: The instance is normal.</li>
     * <li><strong>Creating</strong>: The instance is being created.</li>
     * <li><strong>Changing</strong>: The configurations of the instance are being changed.</li>
     * <li><strong>Inactive</strong>: The instance is disabled.</li>
     * <li><strong>Flushing</strong>: The instance is being released.</li>
     * <li><strong>Released</strong>: The instance is released.</li>
     * <li><strong>Transforming</strong>: The billing method of the instance is being changed.</li>
     * <li><strong>Unavailable</strong>: The instance is unavailable.</li>
     * <li><strong>Error</strong>: The instance failed to be created.</li>
     * <li><strong>Migrating</strong>: The instance is being migrated.</li>
     * <li><strong>BackupRecovering</strong>: The instance is being restored from a backup.</li>
     * <li><strong>MinorVersionUpgrading</strong>: The minor version of the instance is being updated.</li>
     * <li><strong>NetworkModifying</strong>: The network type of the instance is being changed.</li>
     * <li><strong>SSLModifying</strong>: The SSL certificate of the instance is being changed.</li>
     * <li><strong>MajorVersionUpgrading</strong>: The major version of the instance is being upgraded. The instance remains accessible during the upgrade.</li>
     * </ul>
     * <blockquote>
     * <p>For more information about instance states, see <a href="https://help.aliyun.com/document_detail/200740.html">Instance states and impacts</a>.</p>
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
     * <p>The network type of the instance. Valid values:</p>
     * <ul>
     * <li><strong>CLASSIC</strong>: classic network</li>
     * <li><strong>VPC</strong>: Virtual Private Cloud (VPC)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLASSIC</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The private IP address of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.49.***</p>
     */
    @NameInMap("PrivateIp")
    public String privateIp;

    /**
     * <p>The ID of the region in which the instances you want to query reside. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instances you want to query belong.</p>
     * <blockquote>
     * <p>You can query resource group IDs by using the ApsaraDB for Redis console or by calling the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
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
     * <p>The keyword used for fuzzy search. The keyword can be based on an instance ID or an instance description.</p>
     * 
     * <strong>example:</strong>
     * <p>apitest</p>
     */
    @NameInMap("SearchKey")
    public String searchKey;

    @NameInMap("SecurityToken")
    public String securityToken;

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
     * <p>The zone ID of the instance.</p>
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
