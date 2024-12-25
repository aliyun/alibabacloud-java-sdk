// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class ModifyLoadBalancerPayTypeRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payment. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes</li>
     * <li><strong>false</strong> (default): no</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is valid only when the <code>PayType</code> parameter is set to <strong>PrePay</strong>. This parameter is valid only for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The subscription duration.</p>
     * <ul>
     * <li>If <strong>PricingCycle</strong> is set to <strong>month</strong>, the valid values are <strong>1</strong> to <strong>9</strong>.</li>
     * <li>If <strong>PricingCycle</strong> is set to <strong>year</strong>, the valid values are <strong>1</strong> to <strong>3</strong>.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is valid only when the <strong>PayType</strong> parameter is set to <strong>PrePay</strong>. This parameter is valid only for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Duration")
    public Integer duration;

    /**
     * <p>The ID of the CLB instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1b6c719dfa08ex*****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The billing method of the CLB instance. Valid values:</p>
     * <ul>
     * <li><strong>PayOnDemand</strong> (default): pay-as-you-go</li>
     * </ul>
     * <p>To change the billing method of a pay-as-you-go CLB instance to subscription, you must set the parameter to <strong>PrePay</strong>. In addition, the previous billing method of the CLB instance must be <strong>PayOnDemand</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePay</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The billing cycle.</p>
     * <p>Valid values: <strong>year</strong> and <strong>month</strong>.</p>
     * <blockquote>
     * <p> This parameter is valid only when the <strong>PayType</strong> parameter is set to <strong>PrePay</strong>. This parameter is valid only for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The ID of the region where the CLB instance is deployed.</p>
     * <p>You can query the region ID from the <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a> list or by calling the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation.</p>
     * <p>This parameter is required.</p>
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

    public static ModifyLoadBalancerPayTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLoadBalancerPayTypeRequest self = new ModifyLoadBalancerPayTypeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLoadBalancerPayTypeRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public ModifyLoadBalancerPayTypeRequest setDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    public Integer getDuration() {
        return this.duration;
    }

    public ModifyLoadBalancerPayTypeRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public ModifyLoadBalancerPayTypeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyLoadBalancerPayTypeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLoadBalancerPayTypeRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public ModifyLoadBalancerPayTypeRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public ModifyLoadBalancerPayTypeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLoadBalancerPayTypeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyLoadBalancerPayTypeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
