// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class EnableAdditionalBandwidthRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-payment. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Enables auto-payment. This is the default. Ensure that your account has a sufficient balance.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables auto-payment. You must manually complete the payment.</p>
     * </li>
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
     * <li><p><strong>true</strong>: Enables auto-renewal.</p>
     * </li>
     * <li><p><strong>false</strong>: Disables auto-renewal. This is the default.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period, in months. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, <strong>6</strong>, <strong>7</strong>, <strong>8</strong>, <strong>9</strong>, <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is required only when <strong>AutoRenew</strong> is set to <strong>true</strong>.</p>
     * </li>
     * <li><p>After you set this parameter, you cannot query its value by calling API operations. To check this setting, go to the console. In the top navigation bar, choose <strong>Billing</strong> &gt; <strong>Renewal Management</strong>. Then, in the <strong>Instance ID</strong> field, enter the instance ID followed by the <code>-bw</code> suffix (for example, r-bp1zxszhcgatnx\<em>\</em>\<em>\</em>-bw).</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("BandWidthBurst")
    public Boolean bandWidthBurst;

    /**
     * <p>The amount of bandwidth to add, in MB/s. The value must be an integer greater than or equal to <strong>0</strong>. The maximum value is six times the default bandwidth of the instance type or a single data shard, with an upper limit of 192 MB/s. For example, if the default bandwidth of an instance is 10 MB/s, the valid values for this parameter are <strong>0</strong> to <strong>60</strong>.</p>
     * <blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/473782.html">DescribeRoleZoneInfo</a> operation and check the value of the <strong>DefaultBandWidth</strong> parameter in the response to get the default maximum bandwidth. For more information about instance types, see <a href="https://help.aliyun.com/document_detail/26350.html">Instance types</a>.</p>
     * </li>
     * <li><p>If you specified multiple data shard IDs for the <strong>NodeId</strong> parameter, the bandwidth values that you specify for this parameter must correspond to the order of the data shard IDs. Separate multiple bandwidth values with commas (,).</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bandwidth")
    public String bandwidth;

    /**
     * <p>The billing method for the additional bandwidth. Valid values:</p>
     * <ul>
     * <li><p><strong>PrePaid</strong>: subscription.</p>
     * </li>
     * <li><p><strong>PostPaid</strong>: pay-as-you-go. This is the only supported billing method.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
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
     * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard. You can call the <a href="https://help.aliyun.com/document_detail/473786.html">DescribeLogicInstanceTopology</a> operation to query data shard IDs. Separate multiple data shard IDs with commas (,). You can also set this parameter to <strong>All</strong> to specify all data shards.</p>
     * <blockquote>
     * <p>This parameter is required only when the instance uses the <a href="https://help.aliyun.com/document_detail/52228.html">cluster architecture</a> or the <a href="https://help.aliyun.com/document_detail/62870.html">read/write splitting architecture</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>The subscription duration, in days. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>7</strong>, <strong>14</strong>, <strong>30</strong>, <strong>60</strong>, <strong>90</strong>, <strong>180</strong>, <strong>365</strong>, <strong>730</strong>, <strong>1095</strong>, and <strong>1825</strong>.</p>
     * <blockquote>
     * <p>To continue using the purchased bandwidth, you must call the <a href="https://help.aliyun.com/document_detail/473804.html">RenewAdditionalBandwidth</a> operation to renew the bandwidth before it expires.</p>
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
     * <p>The source of the call. This parameter is used for internal maintenance. Do not specify it.</p>
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

    public EnableAdditionalBandwidthRequest setBandWidthBurst(Boolean bandWidthBurst) {
        this.bandWidthBurst = bandWidthBurst;
        return this;
    }
    public Boolean getBandWidthBurst() {
        return this.bandWidthBurst;
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
