// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The extended information such as the promotional event ID and business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The storage capacity of the instance. Unit: MB. This parameter is used only to query Redis Open-Source Edition instances that are deployed in classic mode. We recommend that you use the <strong>InstanceClass</strong> parameter to specify an exact instance type.</p>
     * <blockquote>
     * <p> If you specify the <strong>InstanceClass</strong> parameter, you do not need to specify the Capacity parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PostPaid</strong> (default): pay-as-you-go</li>
     * <li><strong>PrePaid</strong>: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The coupon code. Default value: youhuiquan_promotion_option_id_for_blank. This value indicates that no coupon code is available.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The engine version of the instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to forcefully change the configurations of the instance. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: forcefully changes the configurations.</li>
     * <li><strong>true</strong> (default): does not forcefully change the configurations.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceUpgrade")
    public Boolean forceUpgrade;

    /**
     * <p>The instance type.**** <strong>To view the instance type, perform the following steps:</strong></p>
     * <ol>
     * <li>In the <a href="https://help.aliyun.com/document_detail/26350.html">Instance specifications</a> topic, click the link in the <strong>References for instance specifications</strong> column corresponding to the instance type that you want to view.</li>
     * <li>In the instance type table of the specification documentation, find the instance type in the <strong>InstanceClass</strong> column.</li>
     * </ol>
     * <blockquote>
     * <p> If you want to query new instances, in addition to key parameters, you must also specify at least the following parameters:</p>
     * </blockquote>
     * <ul>
     * <li><p>To query a classic instance, specify this parameter.</p>
     * </li>
     * <li><p>To query a cloud-native standard instance, specify this parameter.</p>
     * </li>
     * <li><p>To query a cloud-native cluster instance, specify this parameter and the <strong>ShardCount</strong> parameter.</p>
     * </li>
     * <li><p>To query a cloud-native read/write splitting instance, specify this parameter and the <strong>Instances</strong> parameter.</p>
     * </li>
     * <li><p>To query multiple instances of different specifications or to query a Tair ESSD-based instance that has a custom storage type and storage capacity, specify the Instances parameter. In this case, you do not need to specify the InstanceClass parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> This parameter is required when the <strong>OrderType</strong> parameter is set to <strong>UPGRADE</strong> or <strong>RENEW</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>If you want to query cloud-native read/write splitting instances, Tair ESSD-based instances, or instances of different specifications, you must specify this parameter as a JSON string. For more information, see the <strong>Additional description of the Instances parameter</strong> section.</p>
     * 
     * <strong>example:</strong>
     * <p>Instances=[{&quot;RegionId&quot;: &quot;cn-hangzhou&quot;,&quot;ZoneId&quot;: &quot;cn-hangzhou-b&quot;,&quot;InstanceClass&quot;: &quot;redis.master.small.default&quot;,&quot;Period&quot;: &quot;1&quot;,&quot;Quantity&quot;: &quot;1&quot;,&quot;Capacity&quot;: &quot;4096&quot;}]</p>
     */
    @NameInMap("Instances")
    public String instances;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>STAND_ALONE</strong>: standalone</li>
     * <li><strong>MASTER_SLAVE</strong> (default): high availability (master-replica)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>Specifies whether to return parameters related to the order. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default)</li>
     * <li><strong>true</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OrderParamOut")
    public String orderParamOut;

    /**
     * <p>The order type. Valid values:</p>
     * <ul>
     * <li><strong>BUY</strong>: specifies the orders that are used to purchase instances.</li>
     * <li><strong>UPGRADE</strong>: specifies the orders that are used to change the configurations of instances.</li>
     * <li><strong>RENEW</strong>: specifies the orders that are used to renew instances.</li>
     * <li><strong>CONVERT</strong>: specifies the orders that are used to change the billing methods of instances.</li>
     * </ul>
     * <p>This parameter is required.</p>
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
     * <p>The subscription duration. Unit: month. Valid values: <strong>1</strong>, 2, 3, 4, 5, 6, 7, 8, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The number of instances that you want to purchase. Valid values: <strong>1</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Long quantity;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of data shards in the cloud-native cluster instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query the zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-e</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePriceRequest self = new DescribePriceRequest();
        return TeaModel.build(map, self);
    }

    public DescribePriceRequest setBusinessInfo(String businessInfo) {
        this.businessInfo = businessInfo;
        return this;
    }
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    public DescribePriceRequest setCapacity(Long capacity) {
        this.capacity = capacity;
        return this;
    }
    public Long getCapacity() {
        return this.capacity;
    }

    public DescribePriceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribePriceRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public DescribePriceRequest setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }
    public String getEngineVersion() {
        return this.engineVersion;
    }

    public DescribePriceRequest setForceUpgrade(Boolean forceUpgrade) {
        this.forceUpgrade = forceUpgrade;
        return this;
    }
    public Boolean getForceUpgrade() {
        return this.forceUpgrade;
    }

    public DescribePriceRequest setInstanceClass(String instanceClass) {
        this.instanceClass = instanceClass;
        return this;
    }
    public String getInstanceClass() {
        return this.instanceClass;
    }

    public DescribePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePriceRequest setInstances(String instances) {
        this.instances = instances;
        return this;
    }
    public String getInstances() {
        return this.instances;
    }

    public DescribePriceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public DescribePriceRequest setOrderParamOut(String orderParamOut) {
        this.orderParamOut = orderParamOut;
        return this;
    }
    public String getOrderParamOut() {
        return this.orderParamOut;
    }

    public DescribePriceRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public DescribePriceRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribePriceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribePriceRequest setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public DescribePriceRequest setQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }
    public Long getQuantity() {
        return this.quantity;
    }

    public DescribePriceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePriceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribePriceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribePriceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribePriceRequest setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
        return this;
    }
    public Integer getShardCount() {
        return this.shardCount;
    }

    public DescribePriceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
