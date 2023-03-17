// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The language of the return values. Defualt value: zh-CN. Valid values:</p>
     * <br>
     * <p>* **zh-CN**: Chinese</p>
     * <p>* **en-US**: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The database engine of the instance. Valid values:</p>
     * <br>
     * <p>* **Redis**</p>
     * <p>* **Memcache**</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>* **PrePaid**: subscription</p>
     * <p>* **PostPaid**: pay-as-you-go</p>
     * <br>
     * <p>> The default value is **PrePaid**.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The ID of the instance</p>
     * <br>
     * <p>>  This parameter is available and required only if the **OrderType** parameter is set to **UPGRADE** or **DOWNGRADE**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data node for which you want to query available resources that can be created. You can call the [DescribeLogicInstanceTopology](~~94665~~) operation to query the ID of the data node. Remove the number sign (`#`) and the content that follows the number sign. For example, retain only r-bp10noxlhcoim2****-db-0.</p>
     * <br>
     * <p>>  Before you specify this parameter, you must set the **InstanceId** parameter to the ID of an instance that uses the cluster or read/write splitting architecture.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The type of the order. Default value: BUY. Valid values:</p>
     * <br>
     * <p>* **BUY**: orders that are newly created.</p>
     * <p>* **UPGRADE**: orders that are used to upgrade instances.</p>
     * <p>* **DOWNGRADE**: orders that are used to downgrade instances.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The series of the instance. Valid values:</p>
     * <br>
     * <p>* **Local**: ApsaraDB for Redis Community Edition instances that use local disks or ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instances that use local disks</p>
     * <p>* **Tair_rdb**: ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instances that use cloud disks</p>
     * <p>* **Tair_scm**: ApsaraDB for Redis Enhanced Edition (Tair) persistent memory-optimized instances</p>
     * <p>* **Tair_essd**: ApsaraDB for Redis Enhanced Edition (Tair) ESSD-based instances</p>
     * <p>* **OnECS**: ApsaraDB for Redis Community Edition instances that use cloud disks</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which to assign the instance. You can call the [ListResourceGroups](~~158855~~) operation to query the IDs of resource groups.</p>
     * <br>
     * <p>>  You can also query the IDs of resource groups in the Resource Management console. For more information, see [View basic information about a resource group](~~151181~~).</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The zone ID of the instance. You can call the [DescribeZones](~~94527~~) operation to query the most recent zone list.</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAvailableResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvailableResourceRequest self = new DescribeAvailableResourceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAvailableResourceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DescribeAvailableResourceRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeAvailableResourceRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public DescribeAvailableResourceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAvailableResourceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeAvailableResourceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribeAvailableResourceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeAvailableResourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeAvailableResourceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DescribeAvailableResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAvailableResourceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeAvailableResourceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeAvailableResourceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeAvailableResourceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAvailableResourceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
