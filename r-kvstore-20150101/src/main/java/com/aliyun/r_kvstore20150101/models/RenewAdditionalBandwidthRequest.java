// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RenewAdditionalBandwidthRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Automatic payment. This is the default value.</li>
     * <li><strong>false</strong>: Manual payment. You must choose <strong>Expenses and Costs</strong> &gt; <strong>Renewals</strong> in the top navigation bar of the console, and then choose <strong>Order Management</strong> &gt; <strong>My Orders</strong> in the left-side navigation pane to find and pay for the order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The coupon code.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_promotion_option_id_for_blank</p>
     */
    @NameInMap("CouponNo")
    public String couponNo;

    /**
     * <p>Instance ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/473778.html">DescribeInstances</a> operation to query instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The purchase duration. Unit: days. Valid values: <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>7</strong>, <strong>14</strong>, <strong>30</strong>, <strong>60</strong>, <strong>90</strong>, <strong>180</strong>, <strong>365</strong>, <strong>730</strong>, <strong>1095</strong>, and <strong>1825</strong>.</p>
     * <p>This parameter is required.</p>
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
     * <p>The source of the API call. This parameter is used only for internal maintenance and does not need to be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>SDK</p>
     */
    @NameInMap("SourceBiz")
    public String sourceBiz;

    public static RenewAdditionalBandwidthRequest build(java.util.Map<String, ?> map) throws Exception {
        RenewAdditionalBandwidthRequest self = new RenewAdditionalBandwidthRequest();
        return TeaModel.build(map, self);
    }

    public RenewAdditionalBandwidthRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public RenewAdditionalBandwidthRequest setCouponNo(String couponNo) {
        this.couponNo = couponNo;
        return this;
    }
    public String getCouponNo() {
        return this.couponNo;
    }

    public RenewAdditionalBandwidthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RenewAdditionalBandwidthRequest setOrderTimeLength(String orderTimeLength) {
        this.orderTimeLength = orderTimeLength;
        return this;
    }
    public String getOrderTimeLength() {
        return this.orderTimeLength;
    }

    public RenewAdditionalBandwidthRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RenewAdditionalBandwidthRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RenewAdditionalBandwidthRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RenewAdditionalBandwidthRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public RenewAdditionalBandwidthRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RenewAdditionalBandwidthRequest setSourceBiz(String sourceBiz) {
        this.sourceBiz = sourceBiz;
        return this;
    }
    public String getSourceBiz() {
        return this.sourceBiz;
    }

}
