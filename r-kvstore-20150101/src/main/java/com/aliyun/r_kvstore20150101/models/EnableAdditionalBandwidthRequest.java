// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class EnableAdditionalBandwidthRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <br>
     * <p>*   **true**: enables automatic payment. Make sure that your Alibaba Cloud account has a sufficient balance.</p>
     * <p>*   **false**: disables automatic payment. To manually complete the payment, you can perform the following procedure: In the top navigation bar of the ApsaraDB for Redis console, choose **Expenses** > **Renewal Management**. In the left-side navigation pane of the Billing Management console, click **Orders******. On the page that appears, find the order and complete the payment.</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <br>
     * <p>*   **true**: enables auto-renewal.</p>
     * <p>*   **false**: disables auto-renewal. This is the default value.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal cycle based on which ApsaraDB for Redis automatically renews the purchased bandwidth. Unit: months. Valid values: **1**, **2**, **3**, **4**, **5**, **6**, **7**, **8**, **9**, **12**, **24**, **36**, and **60**.</p>
     * <br>
     * <p>> * This parameter takes effect and must be specified only when you set the **AutoRenew** parameter to **true**.</p>
     * <p>> * You cannot query the auto-renewal cycle by calling an API operation. To obtain the auto-renewal cycle, you can perform the following procedure: In the top navigation bar of the ApsaraDB for Redis console, choose **Expenses** > **Renewal Management**. On the page that appears, enter the ID of the instance and the `-bw` suffix in the **Instance ID** field. Example: r-bp1zxszhcgatnx****-bw.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The amount of bandwidth that you want to purchase. Unit: MB/s. The value of this parameter must be an integer that is greater than or equal to **0**. You can set this parameter to a value that is up to two times the default bandwidth that is supported by the instance type. For example, if the default bandwidth that is supported by the instance type is 10 MB/s, you can set this parameter to a value within the range of **0** to **20**.</p>
     * <br>
     * <p>> * You call the [DescribeRoleZoneInfo](~~190794~~) operation to query the default bandwidth that is supported by an instance type. In the response, the default bandwidth is indicated by the **DefaultBandWidth** parameter. For more information about instance types, see [Overview](~~26350~~).</p>
     * <p>> * If you specify multiple data shard IDs in the **NodeId** parameter, you must specify the amount of bandwidth that you want to purchase for each specified data shard in the Bandwidth parameter. The bandwidth values that you specify in the Bandwidth parameter must be in the same sequence as the data shard IDs that you specify in the NodeId parameter. In addition, you must separate the bandwidth values with commas (,).</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The ID of the coupon that you want to use.</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The ID of the instance. You can call the [DescribeInstances](~~60933~~) operation to query the IDs of instances.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard for which you want to purchase a specific amount of bandwidth. You can call the [DescribeLogicInstanceTopology](~~94665~~) operation to query the IDs of the data shards in an instance. If you specify multiple data shard IDs, separate the data shard IDs with commas (,). You can also set this parameter to **ALL**, which specifies all the data shards of the instance.</p>
     * <br>
     * <p>>  This parameter takes effect and must be specified only when the instance is a cluster master-replica instance or a read/write splitting instance. For more information, see [Cluster master-replica instances](~~52228~~) or [Read/write splitting instances](~~62870~~).</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The period of time for which the purchased bandwidth is valid. Unit: days. Valid values: **1**, **2**, **3**, **7**, **14**, **30**, **60**, **90**, **180**, **365**, **730**, **1095**, and **1825**.</p>
     * <br>
     * <p>>  If you want to continue using the purchased bandwidth after the specified period of time elapses, you must call the [RenewAdditionalBandwidth](~~211199~~) operation to submit a renewal order.</p>
     */
    @NameInMap("OrderTimeLength")
    public String orderTimeLength;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The source of the operation. This parameter is used only for internal maintenance. You do not need to specify this parameter.</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    public static EnableAdditionalBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAdditionalBandwidthRequest self = new EnableAdditionalBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public EnableAdditionalBandwidthRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public EnableAdditionalBandwidthRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public EnableAdditionalBandwidthRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public EnableAdditionalBandwidthRequest setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public String getBandwidth() {
        return this.bandwidth;
    }

    public EnableAdditionalBandwidthRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public EnableAdditionalBandwidthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableAdditionalBandwidthRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public EnableAdditionalBandwidthRequest setOrderTimeLength(String orderTimeLength) {
        this.orderTimeLength = orderTimeLength;
        return this;
    }
    public String getOrderTimeLength() {
        return this.orderTimeLength;
    }

    public EnableAdditionalBandwidthRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public EnableAdditionalBandwidthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public EnableAdditionalBandwidthRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public EnableAdditionalBandwidthRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableAdditionalBandwidthRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public EnableAdditionalBandwidthRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

}
