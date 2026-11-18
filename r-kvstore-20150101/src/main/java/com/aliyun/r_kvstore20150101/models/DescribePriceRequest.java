// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The extended information, such as the promotion ID and business information.</p>
     * 
     * <strong>example:</strong>
     * <p>000000000000</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>Specifies the instance type by using the storage capacity of the instance. Unit: MB. This parameter applies only to instances of ApsaraDB for Redis Community Edition in the classic deployment mode. We recommend that you use the <strong>InstanceClass</strong> parameter to specify an exact instance type.</p>
     * <blockquote>
     * <p>If you specify the <strong>InstanceClass</strong> parameter, you do not need to specify this parameter.</p>
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
     * <li><strong>PostPaid</strong> (default): pay-as-you-go.</li>
     * <li><strong>PrePaid</strong>: subscription.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The coupon code. Default value: youhuiquan_promotion_option_id_for_blank, which indicates that no coupon code is used.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>&lt;props=&quot;china&quot;&gt;Database engine version of the Redis instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, <strong>5.0</strong>, and <strong>6.0</strong>.</p>
     * <p>&lt;props=&quot;intl&quot;&gt;Database engine version of the Redis instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
     * <p>&lt;props=&quot;partner&quot;&gt;Database engine version of the Redis instance. Valid values: <strong>2.8</strong>, <strong>4.0</strong>, and <strong>5.0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5.0</p>
     */
    @NameInMap("EngineVersion")
    public String engineVersion;

    /**
     * <p>Specifies whether to forcibly upgrade or downgrade the instance. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Yes.</li>
     * <li><strong>true</strong> (default): No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ForceUpgrade")
    public Boolean forceUpgrade;

    /**
     * <p>Specifies the instance type by using the <strong>InstanceClass</strong> code. To query the <strong>InstanceClass</strong> code, perform the following steps:</p>
     * <ol>
     * <li>On the <a href="https://help.aliyun.com/document_detail/26350.html">Instance type query</a> page, select the instance type as needed and click the value in the <strong>Architecture Type</strong> column to open the instance type documentation.</li>
     * <li>In the instance type table of the documentation, select the required instance type and find the code in the <strong>InstanceClass</strong> column.</li>
     * </ol>
     * <blockquote>
     * <p>For example, to query pricing for a new purchase, you must specify at least the following parameters in addition to other key parameters:</p>
     * <ul>
     * <li>To query a classic instance: specify this parameter.</li>
     * <li>To query a cloud-native standard architecture instance: specify this parameter.</li>
     * <li>To query a cloud-native cluster architecture instance: specify this parameter and the <strong>ShardCount</strong> parameter.</li>
     * <li>To query a cloud-native read/write splitting architecture instance: specify this parameter and the <strong>Instances</strong> parameter.</li>
     * <li>To query multiple instances of different types, or to query Tair ESSD instances (with custom storage types and storage space): specify the Instances parameter. You do not need to specify this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>redis.master.small.default</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>OrderType</strong> is set to <strong>UPGRADE</strong> or <strong>RENEW</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instances to query. This parameter is required when you query cloud-native read/write splitting architecture instances, Tair ESSD instances, or multiple instances of different types. The value is a JSON string. For more information, see <strong>Supplementary description of the Instances parameter</strong> below.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;RegionId&quot;: &quot;cn-hangzhou&quot;,&quot;ZoneId&quot;: &quot;cn-hangzhou-b&quot;,&quot;ShardClass&quot;: &quot;tair.scm.with.proxy.standard.2m.8d&quot;,&quot;ShardCount&quot;: &quot;3&quot;,&quot;Period&quot;: &quot;1&quot;,&quot;Quantity&quot;: &quot;1&quot;}]</p>
     */
    @NameInMap("Instances")
    public String instances;

    /**
     * <p>Specifies whether to return unavailable coupons.</p>
     */
    @NameInMap("NeedUnavailableCoupon")
    public Boolean needUnavailableCoupon;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>STAND_ALONE</strong>: Single-replica.</li>
     * <li><strong>MASTER_SLAVE</strong> (default): High-availability (dual-replica).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MASTER_SLAVE</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>Specifies whether to return the order parameters. Valid values:</p>
     * <ul>
     * <li><strong>false</strong> (default): Not returned.</li>
     * <li><strong>true</strong>: Returned.</li>
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
     * <li><strong>BUY</strong>: New purchase.</li>
     * <li><strong>UPGRADE</strong>: Upgrade or downgrade.</li>
     * <li><strong>RENEW</strong>: Renewal.</li>
     * <li><strong>CONVERT</strong>: Billing method conversion.</li>
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
     * <p>The subscription duration. Unit: months. Valid values: <strong>1</strong> to <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, and <strong>36</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The number of instances to purchase. Valid values: <strong>1</strong> to <strong>30</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Quantity")
    public Long quantity;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/473763.html">DescribeRegions</a> operation to query available regions.</p>
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

    /**
     * <p>The secondary zone ID. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query available zones.</p>
     * <blockquote>
     * <p>The value of this parameter cannot be the same as the value of the ZoneId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("SecondaryZoneId")
    public String secondaryZoneId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The number of data shard nodes in the cloud-native cluster instance.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ShardCount")
    public Integer shardCount;

    /**
     * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/473764.html">DescribeZones</a> operation to query available zones.</p>
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

    public DescribePriceRequest setNeedUnavailableCoupon(Boolean needUnavailableCoupon) {
        this.needUnavailableCoupon = needUnavailableCoupon;
        return this;
    }
    public Boolean getNeedUnavailableCoupon() {
        return this.needUnavailableCoupon;
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

    public DescribePriceRequest setSecondaryZoneId(String secondaryZoneId) {
        this.secondaryZoneId = secondaryZoneId;
        return this;
    }
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
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
