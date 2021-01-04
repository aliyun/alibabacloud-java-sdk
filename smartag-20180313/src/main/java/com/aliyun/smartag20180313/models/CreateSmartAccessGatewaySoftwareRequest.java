// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateSmartAccessGatewaySoftwareRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Period")
    public Integer period;

    @NameInMap("AutoPay")
    public Boolean autoPay;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("UserCount")
    public Integer userCount;

    @NameInMap("DataPlan")
    public Long dataPlan;

    public static CreateSmartAccessGatewaySoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSmartAccessGatewaySoftwareRequest self = new CreateSmartAccessGatewaySoftwareRequest();
        return TeaModel.build(map, self);
    }

    public CreateSmartAccessGatewaySoftwareRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateSmartAccessGatewaySoftwareRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateSmartAccessGatewaySoftwareRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateSmartAccessGatewaySoftwareRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateSmartAccessGatewaySoftwareRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSmartAccessGatewaySoftwareRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateSmartAccessGatewaySoftwareRequest setAutoPay(Boolean autoPay) {
        this.autoPay = autoPay;
        return this;
    }
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    public CreateSmartAccessGatewaySoftwareRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateSmartAccessGatewaySoftwareRequest setUserCount(Integer userCount) {
        this.userCount = userCount;
        return this;
    }
    public Integer getUserCount() {
        return this.userCount;
    }

    public CreateSmartAccessGatewaySoftwareRequest setDataPlan(Long dataPlan) {
        this.dataPlan = dataPlan;
        return this;
    }
    public Long getDataPlan() {
        return this.dataPlan;
    }

}
