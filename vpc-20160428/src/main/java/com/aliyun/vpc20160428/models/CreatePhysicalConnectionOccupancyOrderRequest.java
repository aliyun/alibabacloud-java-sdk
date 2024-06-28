// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable automatic payments. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: yes Make sure that you have a sufficient balance in your account. Otherwise, your order becomes invalid and is automatically canceled.</li>
     * <li><strong>false</strong>: disables automatic payment. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoPay")
    public Boolean autoPay;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * 
     * <strong>example:</strong>
     * <p>CBCE910E-D396-4944</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The billing method. Set the value to</p>
     * <p><strong>PrePaid</strong>, which specifies the subscription billing method. If you choose this billing method, make sure that your Alibaba Cloud account supports balance payments or credit payments.</p>
     * 
     * <strong>example:</strong>
     * <p>PrePaid</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The subscription duration.</p>
     * <ul>
     * <li>If <strong>PricingCycle</strong> is set to <strong>Month</strong>, set <strong>Period</strong> to a value from <strong>1 to 9</strong>.</li>
     * <li>If <strong>PricingCycle</strong> is set to <strong>Year</strong>, set <strong>Period</strong> to a value from <strong>1 to 5</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The ID of the Express Connect circuit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-bp1hp0wr072f6****</p>
     */
    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    /**
     * <p>The billing cycle of the subscription. Valid values:</p>
     * <ul>
     * <li><strong>Month</strong> (default)</li>
     * <li><strong>Year</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Month</p>
     */
    @NameInMap("PricingCycle")
    public String pricingCycle;

    /**
     * <p>The region ID of the Express Connect circuit.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

    public static CreatePhysicalConnectionOccupancyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionOccupancyOrderRequest self = new CreatePhysicalConnectionOccupancyOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
