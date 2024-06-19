// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeAvailableResourceRequest extends TeaModel {
    /**
     * <p>The display language of the response. Default value: zh-CN. Valid values:</p>
     * <ul>
     * <li><strong>zh-CN</strong>: Chinese</li>
     * <li><strong>en-US</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The category of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Redis</strong></li>
     * <li><strong>Memcache</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Redis</p>
     */
    @NameInMap("Engine")
    public String engine;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li><strong>PrePaid</strong>: subscription</li>
     * <li><strong>PostPaid</strong>: pay-as-you-go</li>
     * </ul>
     * <blockquote>
     * <p>The default value is <strong>PrePaid</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The ID of the instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only if the <strong>OrderType</strong> parameter is set to <strong>UPGRADE</strong> or <strong>DOWNGRADE</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The edition of the instance. Valid values:</p>
     * <ul>
     * <li><strong>professional</strong>: Standard Edition. This edition supports the standalone, master-replica, read /write splitting, and cluster architectures and provides high scalability.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>professional</p>
     */
    @NameInMap("InstanceScene")
    public String instanceScene;

    /**
     * <p>The ID of the data node for which you want to query available resources that can be created. You can call the <a href="https://help.aliyun.com/document_detail/94665.html">DescribeLogicInstanceTopology</a> operation to query the ID of the data node. Remove the number sign (<code>#</code>) and the content that follows the number sign. For example, retain only r-bp10noxlhcoim2\<em>\</em>\<em>\</em>-db-0.</p>
     * <blockquote>
     * <p>Before you specify this parameter, you must set the <strong>InstanceId</strong> parameter to the ID of an instance that uses the cluster or read/write splitting architecture.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The type of the order. Default value: BUY. Valid values:</p>
     * <ul>
     * <li><strong>BUY</strong>: orders that are newly created</li>
     * <li><strong>UPGRADE</strong>: orders that are used to upgrade instances</li>
     * <li><strong>DOWNGRADE</strong>: orders that are used to downgrade instances</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>BUY</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The series of the instance. Valid values:</p>
     * <ul>
     * <li><strong>Local</strong>: classic ApsaraDB for Redis Community Edition instance or classic ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance</li>
     * <li><strong>Tair_rdb</strong>: cloud-native ApsaraDB for Redis Enhanced Edition (Tair) DRAM-based instance</li>
     * <li><strong>Tair_scm</strong>: ApsaraDB for Redis Enhanced Edition (Tair) persistent memory-optimized instance</li>
     * <li><strong>Tair_essd</strong>: ESSD-based instance</li>
     * <li><strong>OnECS</strong>: cloud-native ApsaraDB for Redis Community Edition instance</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Local</p>
     */
    @NameInMap("ProductType")
    public String productType;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/61012.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs. You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation to query the IDs of resource groups.</p>
     * <blockquote>
     * <p>You can also query the IDs of resource groups in the Resource Management console. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information about a resource group</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmyiu4e******</p>
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
     * <p>The zone ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/94527.html">DescribeZones</a> operation to query the most recent zone list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
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

    public DescribeAvailableResourceRequest setInstanceScene(String instanceScene) {
        this.instanceScene = instanceScene;
        return this;
    }
    public String getInstanceScene() {
        return this.instanceScene;
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
