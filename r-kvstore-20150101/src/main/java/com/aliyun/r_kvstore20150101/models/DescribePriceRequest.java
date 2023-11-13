// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribePriceRequest extends TeaModel {
    /**
     * <p>The extended information such as the promotional event ID and business information.</p>
     */
    @NameInMap("BusinessInfo")
    public String businessInfo;

    /**
     * <p>The storage capacity of the instance. Unit: MB. This parameter is used only to query ApsaraDB for Redis Community Edition instances that are deployed in classic mode. We recommend that you use the **InstanceClass** parameter to specify an exact instance type.</p>
     * <br>
     * <p>>  If you specify the **InstanceClass** parameter, you do not need to specify the Capacity parameter.</p>
     */
    @NameInMap("Capacity")
    public Long capacity;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   **PostPaid** (default): pay-as-you-go</p>
     * <p>*   **PrePaid**: subscription</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The coupon code. Default value: youhuiquan_promotion_option_id_for_blank. This value indicates that no coupon code is available.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Specifies whether to forcefully change the configurations of the instance. Valid values:</p>
     * <br>
     * <p>*   **false**: forcefully changes the configurations.</p>
     * <p>*   **true** (default): does not forcefully change the configurations.</p>
     */
    @NameInMap("ForceUpgrade")
    public Boolean forceUpgrade;

    /**
     * <p>The instance type.****</p>
     * <br>
     * <p>**To view the instance type, perform the following steps:**</p>
     * <br>
     * <p>1.  In the [Overview](~~26350~~) topic, click the link in the **Reference** column corresponding to the instance type that you want to view.</p>
     * <p>2.  In the instance type table of the page that appears, find the instance type in the **InstanceClass** column.</p>
     * <br>
     * <p>When you query cloud-native cluster instances, you must set this parameter to one of the following values and use the Instances parameter to specify the instance type that you want to query.</p>
     * <br>
     * <p>*   ApsaraDB for Redis cluster instances: redis.cluster.sharding.common.ce</p>
     * <p>*   Tair DRAM-based cluster instances: tair.rdb.cluster.sharding.common</p>
     * <p>*   Tair persistent memory-based cluster instances: tair.scm.cluster.sharding.common.ce</p>
     */
    @NameInMap("InstanceClass")
    public String instanceClass;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>>  This parameter is required when the **OrderType** parameter is set to **UPGRADE** or **RENEW**.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>A JSON string that contains information about one or more cloud-native cluster instances. For more information, see the "Additional description of the Instances parameter" section of this topic.</p>
     */
    @NameInMap("Instances")
    public String instances;

    /**
     * <p>The node type. Valid values:</p>
     * <br>
     * <p>*   **STAND_ALONE**: standalone</p>
     * <p>*   **MASTER_SLAVE** (default): high availability (master-replica)</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>Specifies whether to return parameters related to the order. Valid values:</p>
     * <br>
     * <p>*   **false** (default)</p>
     * <p>*   **true**</p>
     */
    @NameInMap("OrderParamOut")
    public String orderParamOut;

    /**
     * <p>The order type. Valid values:</p>
     * <br>
     * <p>*   **BUY**: The order is used to purchase instances.</p>
     * <p>*   **UPGRADE**: The order is used to change the configurations of instances.</p>
     * <p>*   **RENEW**: The order is used to renew instances.</p>
     * <p>*   **CONVERT**: The order is used to change the billing methods of instances.</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration. Unit: months. Valid values: **1**, 2, 3, 4, 5, 6, 7, 8, **9**, **12**, **24**, and **36**.</p>
     */
    @NameInMap("Period")
    public Long period;

    /**
     * <p>The number of instances that you want to purchase. Valid values: **1** to **30**. Default value: **1**.</p>
     */
    @NameInMap("Quantity")
    public Long quantity;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~61012~~) operation to query the most recent region list.</p>
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
     * <p>The zone ID of the instance. You can call the [DescribeZones](~~94527~~) operation to query the most recent zone list.</p>
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

    public DescribePriceRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
