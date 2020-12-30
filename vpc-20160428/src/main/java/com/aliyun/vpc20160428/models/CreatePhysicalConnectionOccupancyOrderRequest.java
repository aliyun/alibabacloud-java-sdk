// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreatePhysicalConnectionOccupancyOrderRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PhysicalConnectionId")
    public String physicalConnectionId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("PricingCycle")
    public String pricingCycle;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static CreatePhysicalConnectionOccupancyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhysicalConnectionOccupancyOrderRequest self = new CreatePhysicalConnectionOccupancyOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setPhysicalConnectionId(String physicalConnectionId) {
        this.physicalConnectionId = physicalConnectionId;
        return this;
    }
    public String getPhysicalConnectionId() {
        return this.physicalConnectionId;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setPricingCycle(String pricingCycle) {
        this.pricingCycle = pricingCycle;
        return this;
    }
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public CreatePhysicalConnectionOccupancyOrderRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreatePhysicalConnectionOccupancyOrderRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
