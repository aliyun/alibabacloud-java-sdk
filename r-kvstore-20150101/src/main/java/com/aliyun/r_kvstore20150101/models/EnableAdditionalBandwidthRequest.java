// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class EnableAdditionalBandwidthRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Default value: true. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables automatic payment. Make sure that you have sufficient balance within your account.</li>
     * <li><strong>false</strong>: disables automatic payment. If automatic payment is disabled, you must perform the following steps to complete the payment in the ApsaraDB for Redis console: In the top navigation bar, choose <strong>Expenses</strong> &gt; <strong>Renewal Management</strong>. In the left-side navigation pane, click <strong>Orders</strong>. On the <strong>Orders</strong> page, find the order and complete the payment.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enables auto-renewal.</li>
     * <li><strong>false</strong>: disables auto-renewal. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal cycle based on which ApsaraDB for Redis automatically renews the purchased bandwidth. Unit: months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>6</strong>, <strong>7</strong>, <strong>8</strong>, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter takes effect and must be specified only when you set the <strong>AutoRenew</strong> parameter to <strong>true</strong>.</li>
     * <li>You cannot query the auto-renewal cycle by calling an API operation. To obtain the auto-renewal cycle, you can perform the following procedure: In the top navigation bar of the ApsaraDB for Redis console, choose <strong>Expenses</strong> &gt; <strong>Renewal Management</strong>. On the page that appears, enter the ID of the instance and the <code>-bw</code> suffix in the <strong>Instance ID</strong> field. Example: r-bp1zxszhcgatnx****-bw.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The amount of extra bandwidth that you want to purchase. Unit: Mbit/s. The value must be an integer greater than or equal to <strong>0</strong>. The maximum value can be up to six times the default bandwidth of the instance or a single shard, but cannot exceed 192 Mbit/s. For example, if the default bandwidth of an instance is 10 Mbit/s, the value range of this parameter is <strong>0</strong> to <strong>60</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/190794.html">DescribeRoleZoneInfo</a> operation to obtain the default maximum bandwidth returned by the <strong>DefaultBandWidth</strong> response parameter. For more information about instance types, see <a href="https://help.aliyun.com/document_detail/26350.html">Overview</a>.</p>
     * </li>
     * <li><p>If you specify multiple data shard IDs in the <strong>NodeId</strong> parameter, you must specify the amount of bandwidth that you want to purchase for each specified data shard in the Bandwidth parameter. The bandwidth values that you specify in the Bandwidth parameter must be in the same sequence as the data shard IDs that you specify in the NodeId parameter. In addition, you must separate the bandwidth values with commas (,).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The billing method of the bandwidth instance. Default value: PostPaid. Valid values:</p>
     * <ul>
     * <li>PrePaid: subscription</li>
     * <li>PostPaid: pay-as-you-go</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/60933.html">DescribeInstances</a> operation to query the IDs of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard for which you want to purchase a specific amount of bandwidth. You can call the <a href="https://help.aliyun.com/document_detail/94665.html">DescribeLogicInstanceTopology</a> operation to query the IDs of the data shards in an instance. If you specify multiple data shard IDs, separate the data shard IDs with commas (,). You can also set this parameter to <strong>All</strong>, which specifies all the data shards of the instance.</p>
     * <blockquote>
     * <p>This parameter is available and required only if the instance is a <a href="https://help.aliyun.com/document_detail/52228.html">cluster master-replica</a> or <a href="https://help.aliyun.com/document_detail/62870.html">read/write splitting</a> instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The validity period of the bandwidth that you purchase. Unit: day. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>7</strong>, <strong>14</strong>, <strong>30</strong>, <strong>60</strong>, <strong>90</strong>, <strong>180</strong>, <strong>365</strong>, <strong>730</strong>, <strong>1095</strong>, and <strong>1825</strong>.</p>
     * <blockquote>
     * <p>If you want to continue using the purchased bandwidth after the specified period of time elapses, you must call the <a href="https://help.aliyun.com/document_detail/211199.html">RenewAdditionalBandwidth</a> operation to submit a renewal order.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
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
     * 
     * <strong>example:</strong>
     * <p>SDK</p>
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

    public EnableAdditionalBandwidthRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
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
